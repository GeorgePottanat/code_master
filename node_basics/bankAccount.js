var account = {
	total: 1000
}
var deposit, withdraw;

var depositMoney = function(deposit){

	return account.total+=deposit;
}

var withdrawMoney = function(withdraw){
	return account.total-=withdraw;
}

var getBalance = function(){

	return account.total;
}

console.log(getBalance());

console.log("Your total is now $"+depositMoney(1000));

console.log("Your total after withdrawal is $"+withdrawMoney(500));