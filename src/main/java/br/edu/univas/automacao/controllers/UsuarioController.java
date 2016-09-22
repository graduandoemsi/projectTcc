/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.univas.teste_12.controllers;

import br.edu.univas.teste_12.data.Chamado;
import br.edu.univas.teste_12.data.Status;
import br.edu.univas.teste_12.data.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javax.ws.rs.core.Application;

/**
 *
 * @author Rubem
 */
@Path("usuarios")
public class UsuarioController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")

        public List<Usuario>listUsuario(){ 

        List<Usuario> usuarios = new ArrayList<>();
        
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Primeiro");
        usuario1.setEmail("primeiro.com.br");
        usuario1.setCpf("123456789");
        usuario1.setSenha("1234");
        
        Usuario usuario2 = new Usuario();
        usuario2.setNome("Segundo");
        usuario2.setEmail("segundo.com.br");
        usuario2.setCpf("987654321");
        usuario2.setSenha("4321");
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        
        
        return usuarios;
    }
    //traz o objeto
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{cpf}/")
    public Usuario getUsuario(@PathParam("cpf") String cpf){
        
        Usuario usuario = new Usuario();

        usuario.setNome("Primeiro");
        usuario.setEmail("primeiro.com.br");
        usuario.setCpf("123456789");
        usuario.setSenha("1234");

        return usuario;

    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response create(Usuario usuario){       
        System.out.println(usuario.toString());
        return Response.status(Response.Status.OK).build();
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")  
    public Response update(Usuario usuario){
        System.out.println(usuario.toString());
        return Response.status(Response.Status.OK).build();
    }            

    @DELETE
    @Path("{cpf}/")   
    public Response delete(@PathParam("cpf") String cpf){
        System.out.println("Deletando o cpf " + cpf);
        return Response.status(Response.Status.OK).build();
    }            
    
}
