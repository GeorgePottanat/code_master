var person = {
	nameFirst: "George",
	nameLast: "Pottanat",
	hobby: "Tinkerer",
	age: 23
}

var greetUser = function(person){
	console.log(person.nameFirst +" "+person.nameLast);
}

greetUser(person);