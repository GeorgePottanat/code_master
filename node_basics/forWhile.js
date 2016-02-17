for(i=0; i<=10; i++){
	console.log(i);
};


var j=0, countLimit = 10;

while( j < countLimit){
	console.log('while '+j);
	j++;
}

var countDownLimit = function(start, limit){

	while(start>=limit){
			console.log(start);
			start--;
		};
	

};

countDownLimit(50, 10);