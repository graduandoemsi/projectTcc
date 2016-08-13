/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
         
		angular.module("acao", []);
		angular.module("acao").controller("acaoCtrl", function ($scope) {
			$scope.app = "Acionamentos";
			
			$scope.ligarLed = function (led) {
				console.log($scope.led);
			};
		});