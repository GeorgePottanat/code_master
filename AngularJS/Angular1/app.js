var myApp = angular.module('myApp', [/*modules here*/]);

myApp.controller('mainController', [($scope, $log){

$log.log("Hello!");
$log.error("Warning!!!!");

console.log($log);
console.log($scope);

}]);