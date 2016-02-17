var accounts = [
{username: "GeorgePottanat",
  blance: 10000,
  assets: ['Ferrari', 'Tesla S', 'Mercedes X']
}
];
//createAccount(account)

var createAccount= function(account){

	accounts.push(account);

	return account;

};

var getAccount = function(account){
	
	var accountData;

	for(i = 0; i<accounts.length; i++){

		if(accounts[i].username===account){
		   accountData = accounts[i];
		}
	};

	return accountData;
};

var amount, account;

var depositMoney = function(account, amount){
	if(typeof amount ==='number'){
		account.balance+=amount;
	}else{
		console.log("I'm sorry that's an invalid number!");
	}
}

var withdrawMoney = function(account, amount){
	if(typeof amount ==='number'){

		account.balance-=amount;

	}else{
		console.log("I'm sorry that's an withdraw fail!");
	}
	
}

var getBalance = function(account){

	return account.balance;
}

var createBalanceGetter = function(account){
	return function (){
		 return account.balance;
	}
}


var Tayyaba = createAccount({
	username: "TayyabaFeroze",
	balance: 100000,
	assets: ['Bobby']
});

depositMoney(Tayyaba, 1000);

withdrawMoney(Tayyaba, 'x');

console.log(accounts);

var tayyaba2 = getAccount('TayyabaFeroze');

var getTayyaba2Balance = createBalanceGetter(tayyaba2);

console.log(getTayyaba2Balance());