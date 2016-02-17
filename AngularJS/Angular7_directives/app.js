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
    
    this.name = '';
    
    this.namelength = function(){
    
        return self.name.length;
    
    };
    
});

myApp.controller('mainController', ["$scope", "$log", "nameService", function($scope, $log, nameService){

    $scope.searchbox = nameService.name;
    
    $scope.$watch('searchbox', function(){
        
        nameService.name = $scope.searchbox;
        
    });
    
$scope.people =[
    {

    name:'George Pottanat',
    age: '21',
    address: '7218 Hyde Rd',
    city: 'Richmond',
    state: 'VA',
    zip: '23220'
},
        {

    name:'Tony Stark',
    age: '32',
    address: '1232 Oceanview Driver',
    city: 'San Francisco',
    state: 'VA',
    zip: '71283'
},
        {

    name:'Steve Jobs',
    age: '27',
    address: '1235 1st Street',
    city: 'New York',
    state: 'NY',
    zip: '67231'
}
               
               ]

$scope.formattedAddress = function(person){

    return person.address+', '+person.city+', '+person.state+', '+person.zip;
};

}]);

myApp.controller('secondController', ["$scope","$routeParams", "nameService", function($scope, $routeParams, nameService){

    $scope.searchbox = nameService.name;
    
        $scope.$watch('searchbox', function(){
        
        nameService.name = $scope.searchbox;
        
    });
    
}]);

myApp.directive('searchResult',function(){

    return {
        
        restrict: 'AECM',
        
        templateUrl: 'directives/searchresults.html', 
        
        replace: true,
        
        scope:{
            personObject: "=",
            formattedAddressFunction: "&"
        }
        
    }
});