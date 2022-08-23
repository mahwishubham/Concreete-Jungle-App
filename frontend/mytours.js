getBtn = document.getElementById("get");
updateBtn = document.getElementsByName("update");
tourElement = document.getElementById("tours");
// getBtn.addEventListener('click', addTours)
document.addEventListener("DOMContentLoaded", addTours);

let logoutBtn = document.getElementById("logout");

logoutBtn.addEventListener("click", logout);

document.addEventListener("DOMContentLoaded", loginstatus);

function loginstatus() {
  if (localStorage.getItem("role") == "user") {
    window.location.href = "/tours.html";
    if (localStorage.getItem("role") != "guide") {
      window.location.href = "/tours.html";
    }
  }
}

function logout() {
  fetch("http://ec2-34-222-20-217.us-west-2.compute.amazonaws.com:8080/logout", {
    method: "POST",
  })
    .then((res) => {
      data = res.status;
      return data;
    })
    .then((data) => {
      if (data == 200) {
        localStorage.clear();
        window.alert("Logout Successful");
        window.location.href = "/login.html";
      }
    });
}

function addTours() {
  let id = localStorage.getItem("id");
  fetch(`http://ec2-34-222-20-217.us-west-2.compute.amazonaws.com:8080/tours/${id}`)
    .then((res) => {
      return res.json();
    })
    .then((data) => {
      addToursToTable(data);
    });
}

function update_tour() {
  let tid = event.target.value;
  localStorage.setItem("tid", tid);
  console.log(tid);
  window.location.href = "/update.html";
}
function delete_tour() {
  
  let tid = event.target.value;
  console.log(tid)
  fetch(`http://ec2-34-222-20-217.us-west-2.compute.amazonaws.com:8080/tour/${tid}`, {
    method: "DELETE",
  })
    .then((res) => {
      return (data = res.json());
    })
    .then((data) => {
      window.location.href = "/mytours.html";
    });
}

function addToursToTable(data) {
  let num_tours = data.tours;

  i = 0;
  while (i < num_tours.length) {
    let tour = num_tours[i];

    let route_name = tour[0];
    let route_id = tour[1];
    let guide_id = tour[2];
    let day = tour[3];
    let price = tour[4];
    let tid = tour[5];
    
    let row = document.createElement("tr");
    let idCell = document.createElement("td");
    let routeCell = document.createElement("td");
    let guideCell = document.createElement("td");
    let dayCell = document.createElement("td");
    let priceCell = document.createElement("td");
    let updateButton = document.createElement("button");
    let buttonCell = document.createElement("td");

    updateButton.name = "update";
    updateButton.innerHTML = "Update";
    updateButton.value = tid;
    updateButton.id = tid;
    updateButton.className = "button";
    updateButton.style = "margin-bottom: 10px";
    updateButton.onclick = update_tour;

    let deleteButton = document.createElement("button");
    deleteButton.id = "delete";
    deleteButton.innerHTML = "Delete";
    deleteButton.value = tid;
    deleteButton.className = "button";

    deleteButton.onclick = delete_tour;

    localStorage.setItem(route_id, tour);
    buttonCell.appendChild(updateButton);
    buttonCell.appendChild(deleteButton);
    idCell.innerHTML = route_name;
    priceCell.innerHTML = "$" + parseFloat(price / 100).toFixed(2);
    routeCell.innerHTML = route_id;
    guideCell.innerHTML = guide_id;
    if (day == 1) {
      dayCell.innerHTML = "Monday";
    }
    if (day == 2) {
      dayCell.innerHTML = "Tuesday";
    }
    if (day == 3) {
      dayCell.innerHTML = "Wednesday";
    }
    if (day == 4) {
      dayCell.innerHTML = "Thursday";
    }
    if (day == 5) {
      dayCell.innerHTML = "Friday";
    }
    if (day == 6) {
      dayCell.innerHTML = "Saturday";
    }
    if (day == 7) {
      dayCell.innerHTML = "Sunday";
    }
    row.appendChild(idCell);
    row.appendChild(routeCell);
    row.appendChild(dayCell);
    row.appendChild(priceCell);
    row.appendChild(buttonCell);
    tourElement.appendChild(row);

    i++;
  }
}
