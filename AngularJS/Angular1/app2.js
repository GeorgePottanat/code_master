var myApp = angular.module('myApp', [/*modules here*/]);

myApp.controller('mainController',["$scope","$log",function($scope, $log){
$log.info($scope);
}]);