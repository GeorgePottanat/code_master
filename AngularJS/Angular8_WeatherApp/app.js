//module
var myApp = angular.module('myApp',['ngRoute', 'ngResource'])

//setting up routing

myApp.config(function($routeProvider){

    $routeProvider
    .when('/',{
        templateUrl: 'pages/main.html',
        controller: 'mainController'
    })
    .when('/search',{
        templateUrl: 'pages/second.html',
        controller: 'secondController'
    
    })

});



//controller
myApp.controller('mainController',['$scope', cityService, function($scope, 'cityService'){

        $scope.city = cityService.city;
    
        $scope.$watch('city', function(){
        
            cityService.city = $scope.city;
        });

}]);

myApp.controller('secondController', 'cityService',['$scope', function($scope, cityService){

        

}]);

//services
myApp.service('cityService', function(){

    this.city="New York, NY";

});