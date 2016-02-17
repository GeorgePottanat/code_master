var myApp = angular.module('myApp', []);

myApp.controller('mainController', ["$scope","$http", function($scope, $http){

	console.log("Welcome to the controller of AngularJS!");
    var refresh = function(){
    $http.get('/contactList').success(function(response){

    	console.log("I got the data I requested!");
    	$scope.contactList = response;
    	$scope.contact = "";

    }); 

};

refresh();

    $scope.addContact = function(){

    	console.log($scope.contact);

    	$http.post('/contactList', $scope.contact).success(function(response){

    		console.log(response);
    		refresh();
    	});

    };

    $scope.remove = function(contact){
    	console.log(contact);
        $http.delete('/contactList/'+contact).success(function(response){

            console.log(response);
            refresh();
        });
    };

    $scope.edit = function(contact){

        console.log(contact);
        $http.get('/contactList/'+contact).success(function(response){
            $scope.contact = response;
        });

    };

    $scope.update = function(){

        console.log($scope.contact._id);
        $http.put('/contactList/'+$scope.contact._id, $scope.contact).success(function(response){
            refresh();
        });
    };

    $scope.deselect = function(){
        $scope.contact = ' ';
    };


}]);