/** 
 * This Script implements basic CRUD functions 
*/

//Global Constant and Variables 
const personUrl = "http://localhost:8082/itschool/persons/";

let personList = document.getElementById('personList');
let viewBox = document.getElementById('viewBox');


function sendPerson () {
    
    // Initialize Structure
    let data = {};
    //Ceck if inputs are valid 

    // Importing data in object
    
    data.socialSecNumber = document.getElementById('socialSecNumber').value;
    data.firstName  = document.getElementById('firstName').value;
    data.lastName = document.getElementById('lastName').value;
    data.birthDate = document.getElementById('birthDate').value;
    data.gender = document.getElementById('gender').value;

    //Refactor
    //let fields =  [socialSecNumber,firstName,lastName, birthDate, gender];
    //fields.map( v => (data.v = document.getElementById(""+v).value) );

    //Turning object into JSON File 
    let json = JSON.stringify(data);

    // Create the HTTP POST Request
    client = new XMLHttpRequest();
    client.onload = function (data) {
        if (client.readyState == 4 && client.status == "201") {
            console.table(data);
            console.log("Person Created");
            //Append to field
            //<p class="help is-success">This username is available</p>
            //  <p class="help is-danger">This email is invalid</p>
            // <span class="icon is-small is-left"><i class="fas fa-envelope"></i></span>
        }
        
        else {
            console.error(data);
             // Append to field
        //  <p class="help is-danger">This email is invalid</p>
        // <span class="icon is-small is-left"><i class="fas fa-envelope"></i></span>
        }
      }
    
    client.open('POST', personUrl, true);
    client.setRequestHeader('Content-type','application/json; charset=utf-8');

    client.send(json); 
   
}


showPersons = () => {
    // Get all persons
    client = new XMLHttpRequest();
    
client.onload = function (data) {
            
        var response = JSON.parse(client.responseText);
        if (client.readyState == 4 && client.status == "200") {

            console.table(response);
            
            response.forEach(function (person, index){
                personList.innerHTML += "<tr><td>"+index+"</td><td>"+person.firstName+"</td><td>"+person.lastName+"</td><td>"+person.socialSecNumber+"</td><td>"+person.birthDate+"</td><td>"+person.gender+"</td></tr>";
            });
            viewBox.append(personList);

        } else {
            console.error(data);
             // Append to field
        //  <p class="help is-danger">This email is invalid</p>
        // <span class="icon is-small is-left"><i class="fas fa-envelope"></i></span>
        }

    }
    client.open('GET', personUrl, true);
    client.send(null);
}