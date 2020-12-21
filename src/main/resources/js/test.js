let url = '/api/temperature';
measures = [];

function getMeasure(date, data) {
    return {
        date,
        data
    };
}

fetch(url).then(responce => responce.json())
          .then(json => {
            for (i in json) {
                measures.push(getMeasure(new Date(json[i].date).toLocaleString("ru", { hour: 'numeric', minute: 'numeric' }),
                                         json[i].measure));
            }
          });

console.log(measures);
//console.log(y_temp);

//document.getElementById("test").innerHTML = getData();

//let url = '/api/temperature';
////let measures = [];
//
//function getMeasure(date, data) {
//    return {
//        date,
//        data
//    };
//}

//fetch(url).then(responce => responce.json())
//          .then(json => {
//            for (i in json) {
//                measures.push(getMeasure(new Date(json[i].date).toLocaleString("ru", { hour: 'numeric',
//                                                                                       minute: 'numeric' }),
//                                         json[i].measure));
//            }
//          });

//let measures = [{"date" : "12:00", "data" : 10.2},
//                {"date" : "12:01", "data" : 10.4},
//                {"date" : "12:02", "data" : 10.6},
//                {"date" : "12:03", "data" : 10.8},
//                {"date" : "12:04", "data" : 11.0}];

//let data = {
//    datasets: [{
//        data: [{id: 'Sales', nested: {value: 1500}}, {id: 'Purchases', nested: {value: 500}}]
//    }]
//};
//
//let options = {
//    parsing: {
//        xAxisKey: 'id',
//        yAxisKey: 'nested.value'
//    }
//};