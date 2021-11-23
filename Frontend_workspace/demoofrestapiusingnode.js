const https = require('http')
const express = require("express");
let app = new express();
// list of service

// service or view values
app.get("/listofproducts", function(req,res) {
    
    // we need to write call to backend show u later..
    //  need to call service and  and return
    res.send("view records");
 });


// service or view values


// An object of options to indicate where to post to


const data = JSON.stringify({
  todo: 'Buy the milk'
})

const options = {
  hostname: 'whatever.com',
  port: 443,
  path: '/todos',
  method: 'POST',
  headers: {
    'Content-Type': 'application/json',
    'Content-Length': data.length
  }
}

const req = https.request(options, res => {
  console.log(`statusCode: ${res.statusCode}`)

  res.on('data', d => {
    process.stdout.write(d)
  })
})

req.on('error', error => {
  console.error(error)
})

req.write(data)
req.end()

// service or view values
app.put("/update", function(req,res) {
    
    
    //  need to call service and  and return
    res.send("updated records");
 });


// service or view values
app.delete("/del", function(req,res) {
    
    
    //  need to call service and  and return
    res.send("del  records");
 });








let port=8085;
app.listen(port, function() {
console.log("server started listening on  port number"+port);
});

