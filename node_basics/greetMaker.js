function greetMaker(name){

	function greet(){
		console.log("Hello "+name+"!");
	}

	return greet;
}

var greetGeorge = greetMaker("George");
var greetTayyaba = greetMaker("Tayyaba");

greetGeorge();

greetTayyaba();

var greetWorld = greetMaker("Hello");

greetWorld();


function createAdder(baseNumber){

	function adderPoints(numberToAdd){
		console.log(baseNumber+numberToAdd);
	}
	return adderPoints;
}

var addTen = createAdder(10);

addTen(2);

addTen(10);