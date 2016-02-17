var accounts = [
{blance: 10000,
username: "GeorgePottanat"}
];
//createAccount(account)

var createAccount= function(account){

	accounts.push(account);

	return account;

};

var getAccount = function(account){

	for(i = 0; i<accounts.length; i++){

		if(accounts[i].username===account){
		   return accounts[i];
		}
	};

};

console.log(getAccount("GeorgePottanat"));

var deposit, withdraw;

var depositMoney = function(deposit){

	return accounts.total+=deposit;
}

var withdrawMoney = function(withdraw){
	return accounts.total-=withdraw;
}

var getBalance = function(){

	return accounts.total;
}

console.log(getBalance());

console.log("Your total is now $"+depositMoney(1000));

console.log("Your total after withdrawal is $"+withdrawMoney(500));