let ctx = document.getElementById('chart').getContext('2d');

let url = '/api/temperature';
let x_data = [];
let y_data = [];

fetch(url).then(responce => responce.json())
          .then(json => {
              for (i in json) {
                  x_data.push(new Date(json[i].date).toLocaleString("ru", { hour: 'numeric',
                                                                            minute: 'numeric' }));
                  y_data.push(json[i].measure);
              }
          });

let myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: x_data,
        datasets: [{
            label: "жопа",
            data: y_data
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
//        hover: {
//            mode: 'nearest',
//            intersect: true
//        },
        scales: {
            xAxes: [{
                display: true,
                scaleLabel: {
                    display: true
                }
            }],
            yAxes: [{
                display: true,
                scaleLabel: {
                    display: true
                },
                ticks: {
                    beginAtZero: true
                }
            }]
        }
    }
});
