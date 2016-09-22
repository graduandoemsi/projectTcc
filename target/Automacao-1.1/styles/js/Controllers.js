    // create the controller and inject Angular's $scope
    App.controller('mainController', function($scope, loginService) {

        // create a message to display in our view
        $scope.message = 'Everyone come and see how good I look!';
    });    

   App.controller('secondController', function($scope) {

        // create a message to display in our view
        $scope.message = 'Everyone come and see how good I look!';
    });  

    App.controller('aboutController', function($scope) {
        $scope.message = 'Look! I am an about page.';
    });

    App.controller('contactController', function($scope) {
        $scope.message = 'Contact us! JK. This is just a demo.';
    });
    
    App.controller('loginController', function($scope, loginService) {
        $scope.login = function (user) {           
            loginService.login(user);           
        }
    });
    App.controller('servicoController', function($scope) {
        $scope.message = 'servico';
    });
     App.controller('salaController', function($scope) {
        //$scope.message = 'Sala';
    });