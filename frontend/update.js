let updateBtn = document.getElementById("update-Button");
let logoutBtn = document.getElementById("logout");
let touridValue = localStorage.getItem("tid");
let dayInput = document.getElementById("days");
let priceInput = document.getElementById("price");
let radioBtn = document.getElementsByClassName("inactive");
logoutBtn.addEventListener("click", logout);

// document.addEventListener("DOMContentLoaded", loginstatus)

// let tid = localStorage.getItem("tid")

updateBtn.addEventListener("click", update);

// function loginstatus() {
//     console.log()
//     if (localStorage.getItem("role") == "user") {
//       window.location.href = "/tours.html";
//     }
//   }

function update() {
  let active = document.getElementsByName("inactive");
  for (i = 0; i < active.length; i++) {
    if (active[i].checked) {
      let ex = active[i].value;
      sessionStorage.setItem("active", ex);
      break;
    }
  }

  let act = sessionStorage.getItem("active");

  
  fetch("http://ec2-34-222-20-217.us-west-2.compute.amazonaws.com:8080/tour", {
    method: "PUT",
    credentials: "include",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      tour_id: touridValue,
      day: dayInput.value,
      price: priceInput.value * 100,
      inactive: act,
    }),
  })
    .then((res) => {
      return (data = res.json());
    })
    .then((data) => {
      console.log(data);

      if (data.outcome == true) {
        localStorage.removeItem("tid");
        alert("Tour Updated");
        window.location.href = "/mytours.html";
      } else {
        alert("Something went wrong");
      }
    });
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
