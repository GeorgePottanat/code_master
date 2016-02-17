var myApp = angular.module('myApp', ['ngRoute', 'ngResource']);

myApp.config( function($routeProvider){
	$routeProvider
	.when('/', {
		templateUrl:"pages/home.html",
		controller:"homeController"
	})

	.when('/search', {
		templateUrl:"pages/search.html",
		controller:"weatherController"
	})

	.when('/search/:days', {
		templateUrl:"pages/search.html",
		controller:"weatherController"
	})

});

myApp.controller('homeController', ['$scope', 'getAddress', function($scope, getAddress){

	 $scope.address = getAddress.address;

	 $scope.$watch('address', function(){
	 	getAddress.address = $scope.address;
	 });

}]);

myApp.controller('weatherController', ['$scope', '$resoruce', '$routeParams', 'getAddress', function($scope, $resource, $routeParams, getAddress){

	$scope.address = getAddress.address;

	$scope.days = $routeParams.days || "2";

	$scope.weatherAPI = $resource("http://api.openweathermap.org/data/2.5/forecast/daily", {
		callback: "JSON_CALLBACK" }, { get: {method: "JSONP"}});

	$scope.weatherResult = $scope.weatherAPI.get({q: $scope.city, cnt: $scope.days});

	$scope.convertToFahrenheit = function(degK){
		return Math.round((1.8*(degK-273))+32);
	}

	$scope.convertDate = function(dt){
		return new Date(dt*1000);
	};


}]);

//Services
myApp.service('getAddress', function(){
		this.address = 'New York, NY';
});

myApp.directive('weatherResult', function(){
	return{
		restrict: 'E',
		templateUrl:"/pages/weatherResult.html",
		replace: true,
		scope:{
			weatherDay: "=",
			convertToStandard:"&",
			convertToDate: "&",
			dateFormat: "@"
		}
	};
});