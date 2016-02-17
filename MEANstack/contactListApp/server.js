var express = require('express');

var app = express();

var mongojs = require('mongojs');

var db = mongojs('contactList', ['contactList']);

var bodyParser = require('body-parser');

app.use(express.static(__dirname + "/public"));

app.use(bodyParser.json());

app.get('/contactList', function(req, res){

	console.log("Getting the data!");

	db.contactList.find(function(error, docs){

		console.log(docs);
		res.json(docs);
	});

});

app.post('/contactList', function(req, res){

	console.log(req.body);

	db.contactList.insert(req.body, function(err, doc){
		res.json(doc);
	});
});

app.delete('/contactList/:contact', function(req, res){
	var contact = req.params.contact;
	console.log(contact);

	db.contactList.remove({_id: mongojs.ObjectId(contact)}, function(err, doc){
		res.json(doc);
	});

});

app.get('/contactList/:contact', function(req, res){
	var contact = req.params.contact;
	console.log(contact);

	db.contactList.findOne({_id: mongojs.ObjectId(contact)}, function(err, doc){
		res.json(doc);
	});


app.put('/contactList/:contact', function(req, res){
	var contact = req.params.contact;
	
	db.contactList.findAndModify({
		query:{_id: mongojs.ObjectId(contact)}, 
				update: {$set: {name: req.body.name, email: req.body.email, phone: req.body.phone, linkedin: req.body.linkedin }},
				new: true}, function(err, doc){
					res.json(doc);
				})
});	
});



app.listen(3000);

console.log("Server running on localhost:3000");