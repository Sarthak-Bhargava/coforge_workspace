//Adding Data to db.json using json server
function addDept(){
   let dept ={
       "id":2,
       "dname":"HR",
       "loc":"Mumbai"
   }
   fetch('http://localhost:3000/dept/',{
        method: 'POST',
        headers:{
           'Content-Type':'application/json' 
        },
        body:JSON.stringify(dept)
    }).then((res)=>{
        console.log(res);

    })
}

//Updating the Data in db.json using json server
function editDept(){
    let dept ={
        "id":2,
        "dname":"Quality",
        "loc":"Kolkatta"
    }    
    fetch("http://localhost:3000/dept/2",{
        method:"PUT",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(dept)
    }).then((res)=>{
        console.log(res);
    })
}

//Deleting Data in db.json using json server
function deleteDept(){
    fetch("http://localhost:3000/dept/2",{
       method:"DELETE",
       headers:{
           "Content-Type":"application/json"
       }
      }).then((res)=>{
       console.log(res);
   })
}

//Fetching the Data from db.json using json server
function getDept(){
    fetch("http://localhost:3000/dept").then((res)=>{
       return res.json();
   }).then((dept)=>{
       console.log(dept);
   })
}


