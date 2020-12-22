let ctx = document.getElementById('chart').getContext('2d');
let url = '/api/temperature';

function getConfig(data) {
    return {
        type: 'line',
        data: {
            labels: data.map(o => o.date),
            datasets: [{
                label: 'Жопка',
                data: data.map(o => o.value)
            }]
        },
        options: {
             responsive: true,
             maintainAspectRatio: true,
             title: {
                 display: true,
                 text: 'Коты это круто'
             },
             tooltips: {
                 mode: 'index',
                 intersect: false,
             },
             scales: {
                 xAxes: [{
                     display: true,
                     scaleLabel: {
                         display: true
                     }
                 }],
                 yAxes: [{
                     display: true,
                     labelString: 'value',
                     ticks: {
                         beginAtZero: true
                     }
                 }]
             }
         }
    }
}

fetch(url).then(responce => responce.json())
          .then(json => {
            data = [];
              for (i in json) {
                  let date = new Date(json[i].date).toLocaleString("ru", { hour: 'numeric', minute: 'numeric' });
                  let value = json[i].value;
                  data.push({ date, value });
              }
              return data;
              })
          .then((data) => {
              let myChart = new Chart(ctx, getConfig(data));
          });