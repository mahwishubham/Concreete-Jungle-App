let getBtn = document.getElementById("get");
let tourElement = document.getElementById("tours");
let logoutBtn = document.getElementById("logout");

logoutBtn.addEventListener('click', logout);
document.addEventListener('DOMContentLoaded', addTours);

function addTours() {
  fetch('http://ec2-34-222-20-217.us-west-2.compute.amazonaws.com:8080/tours',{
    credentials:'include'

  })
    .then((res) => {
      return res.json();
    })
    .then((data) => {
      addToursToTable(data)

    })
}

function logout() {
  fetch("http://ec2-34-222-20-217.us-west-2.compute.amazonaws.com:8080/logout", {
    'method': 'POST',
  })
    .then((res) => {
      data = res.status;
      return data;
    })
    .then((data) => {
      if (data == 200) {

        localStorage.clear();
        window.alert("Logout Successful");
        window.location.href = "/login.html"
      }
    });
}

function addToursToTable(data) {

  let num_tours = data.tours

  i = 0;
  while (i < num_tours.length) {
    let tour = num_tours[i]

    let route_name = tour[0]
    let route_id = tour[1]
    let guide_id = tour[2]
    let day = tour[3]
    let price = tour[4]
    let inactive = tour[5]

    let row = document.createElement("tr");
    let idCell = document.createElement("td");
    let routeCell = document.createElement("td");
    let guideCell = document.createElement("td");
    let dayCell = document.createElement("td");
    let priceCell = document.createElement("td");

    idCell.innerHTML = route_name;
    priceCell.innerHTML = "$" + parseFloat(price / 100).toFixed(2);
    routeCell.innerHTML = route_id;
    guideCell.innerHTML = guide_id;

    if (day == 1) { dayCell.innerHTML = "Monday"; }
    if (day == 2) { dayCell.innerHTML = "Tuesday"; }
    if (day == 3) { dayCell.innerHTML = "Wednesday"; }
    if (day == 4) { dayCell.innerHTML = "Thursday"; }
    if (day == 5) { dayCell.innerHTML = "Friday"; }
    if (day == 6) { dayCell.innerHTML = "Saturday"; }
    if (day == 7) { dayCell.innerHTML = "Sunday"; }

    row.appendChild(routeCell);
    row.appendChild(guideCell);

    row.appendChild(idCell);
    row.appendChild(dayCell);
    row.appendChild(priceCell);

    tourElement.appendChild(row);

    i++
  }



}
