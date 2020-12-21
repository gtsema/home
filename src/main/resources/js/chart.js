let ctx = document.getElementById('chart').getContext('2d');

let data = {
        labels: [1500,1600,1700,1750,1800,1850,1900,1950,1999,2050],
        datasets: [{
            data: [86,114,106,106,107,111,133,221,783,2478],
            label: "Africa",
            borderColor: "#3e95cd",
            fill: false
        }]
};

let options = {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }]
        }
};

let myChart = new Chart(ctx, {
    type: 'line',
    data: data,
    options: options
});
