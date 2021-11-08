const express = require('express')
const app = express()
const port = 8080
var path = require('path');
const fs = require("fs");






app.get('/convert/topdf', function(request, response) {
	response.sendFile(path.join(__dirname + '/File_Converter.html'));
});


app.listen(port,() =>{
console.log('App is listening on Port ${port}');
});
