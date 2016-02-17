import path from 'path';
import express from 'express';
import handlebars from 'express-handlebars';
import React from 'react';
import ReactDOMServer from 'react-dom/server';
import App from './generated/app';
import cassandra from 'cassandra-driver';


const app = express();

const client = new cassandra.Client({contactPoints: ['127.0.0.1']});
client.connect(function(err, result){
    console.log("Connected cassandra on index!");
});

// View templates
app.engine('handlebars', handlebars({defaultLayout: 'main'}));
app.set('view engine', 'handlebars');

// Static assets
app.use(express.static(path.resolve(__dirname, '../dist')));

// Routes
app.get('/', (request, response) => {
  response.render('app', {
    app: ReactDOMServer.renderToString(<App />)
  });
});

app.listen(3000, () => console.log('Server running on localhost:3000'));