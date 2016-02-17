var name = [{
	person: "George",
    age: "25"},
    {
    	person: "Alan",
    	age: "24"
    }]

name.push({
	person: "Tayyaba",
	age: "21"
})

//name.pop() removes the last ntry in the array

name.forEach(function(nakama){
	console.log(nakama)
});

var length = name.length;

console.log(length);


var grades = [100, 98, 87];

var totalGrade = 0;

grades.forEach(function(grade){
     totalGrade+=grade;
});
 console.log("Current total is "+totalGrade);

 var average = totalGrade/grades.length;

 console.log("The average is "+average);