var myApp = angular.module('myApp', []);

myApp.controller('mainController', ["$scope", "$filter", function($scope, $filter){

	$scope.handle = '';

	$scope.lowercasehandle = function() {

		return $filter('lowercase')($scope.handle);
	};

	$scope.characters = 5;

	$scope.rules = [

	{rulename: "Must be 5 characters!"},
	{rulename: "Must be unique"},
	{rulename: "Must not be your name!"}

	]

}]);