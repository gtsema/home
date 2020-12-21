a = fetch("/api/temperature").then(responce => responce.json())
                             .then(json => document.getElementById("test").innerHTML = JSON.stringify(json));