App.factory("loginService", function ($http) {
    var _login = function(user) {
            return $http.post('/login', user);
        };
        return {
           
           login: _login
           
    };
});


