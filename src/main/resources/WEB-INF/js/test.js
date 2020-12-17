fetch('api/temperature').then(response => response.json())
             .then(json => document.getElementById("name").innerHTML = JSON.stringify(json));