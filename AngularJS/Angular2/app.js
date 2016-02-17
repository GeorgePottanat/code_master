var myApp = angular.module('myApp', [/*modules here - lesson on Interpolation (string combos)*/]);

myApp.controller('mainController', ["$scope", "$timeout", function($scope, $timeout){

	$scope.name= "Georgie";

	$timeout(function() {

		$scope.name = "Tony";

	}, 6000);

	$timeout(function() {

		$scope.name = "Paul";

	}, 10000);

}]);