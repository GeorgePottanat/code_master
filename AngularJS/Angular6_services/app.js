var myApp = angular.module('myApp', ['ngRoute']);

myApp.config(function ($routeProvider){

	$routeProvider
	 .when('/', {

	 	templateUrl: 'pages/main.html',
	 	controller: 'mainController'

	 })

	 .when('/second/:num',{

	 	templateUrl: 'pages/second.html',
	 	controller: 'secondController'

	 })

	 .when('/second',{

	 	templateUrl: 'pages/second.html',
	 	controller: 'secondController'

	 })

});


myApp.service('nameService', function(){

    var self = this;
    
    this.name = 'George Pottanat';
    
    this.namelength = function(){
    
        return self.name.length;
    
    };
    
});

myApp.controller('mainController', ["$scope", "$log", "nameService", function($scope, $log, nameService){

     $scope.name = nameService.name;
    
    $scope.$watch('name', function(){
    
        nameService.name = $scope.name;
        
    });
    
     $log.info(nameService.name);
    $log.info(nameService.namelength());

}]);

myApp.controller('secondController', ["$scope","$routeParams","nameService", function($scope, $routeParams, nameService){

     $scope.name = $routeParams.num || 1;
$scope.name = nameService.name;
    
    $scope.$watch('name', function(){
    
        nameService.name = $scope.name;
        
    });

}]);