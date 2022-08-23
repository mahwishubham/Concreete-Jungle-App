// let employeeIdInput = document.getElementById('employee-id-input');
let phoneInput = document.getElementById('phone-input');
let passwordInput = document.getElementById('password-input');
let firstNameInput = document.getElementById('firstname-input');
let lastNameInput = document.getElementById('lastname-input');
let emailInput = document.getElementById('email-input');
let phoneError = document.getElementById('phone-error');
let passwordError = document.getElementById('password-error');
let firstNameError = document.getElementById('firstname-error');
let lastNameError = document.getElementById('lastname-error');
let emailError = document.getElementById('email-error');
let registrationSubmitButton = document.getElementById('register-submit-btn');
let loginErrorMessageDiv = document.getElementById('login-error-message');
// document.addEventListener('loaded', loginstatus)


// function loginstatus() {

//   if (localStorage.getItem("employee_type") == 0) {
//     window.location.href = '/frontEnd/employee.html'
//   }
//   else if (localStorage.getItem("employee_type") == 1) {
//     window.location.href = '/frontEnd/manager.html'
//   }

//   else {
//     sessionStorage.clear()
//   }
// }


function loginstatus() {
  console.log()
  if (localStorage.getItem("role") == "user") {
    window.location.href = "/tours.html";
  } else if (localStorage.getItem("role") == "guide") {
    window.location.href = "/mytours.html";
  } 
}
registrationSubmitButton.addEventListener('click', registerUser)
async function registerUser(event) {
  event.preventDefault();
  let res = await fetch(`http://ec2-34-222-20-217.us-west-2.compute.amazonaws.com:8080/users`, {
    method: 'POST',
    credentials: 'include',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({
      "email": emailInput.value,
      "password": passwordInput.value,
      "first_name": firstNameInput.value,
      "last_name": lastNameInput.value,
      "phone": phoneInput.value
    }),
  })

  // console.log(res)
  // localStorage.clear
  // localStorage.setItem("Registered", true)
  // let data = await res.json();
  // console.log(data.stringify)

  if (res.status == 200) {
    // alert("Account successfully created")
    let data = await res.json();
    localStorage.setItem("user_fname", data.first_name)
    localStorage.setItem("user_lname", data.last_name)
    localStorage.setItem("role", data.role_name)
    localStorage.setItem("id", data.user_id)
    window.location.href = "tours.html"
  }

  else if (res.status == 400) {
    loginErrorMessageDiv.innerHTML = ""
    let data = await res.json();
    let errorElement = document.createElement('p');
    errorElement.innerHTML = data.message;
    errorElement.style.color = 'red';
    errorElement.style.fontWeight = 'bold';
    loginErrorMessageDiv.appendChild(errorElement);

    // let errorMessage = data.message;
    // let errorString = ""
    // for (i = 0; i < errorMessages.length; i++) {
    //   errorString = errorString + errorMessages[i] + "\n"
    // }
    // window.alert(errorString)
  }

};

// const phoneValidation = () => {
//   console.log("detected change", phoneInput.value);

//   const re = /[0-9]{3}[-][0-9]{3}[-][0-9]{4}/;
//   if (!re.exec(phoneInput.value)) {
//     console.log("no match!");
//     phoneError.innerHTML = "Invalid phone format, expected XXX-XXX-XXXX";
//     phoneError.style.color = 'red';
//     phoneError.style.fontWeight = 'bold';
//   } else {
//     phoneError.innerHTML = ""
//   }
// }

// phoneInput.addEventListener('change', phoneValidation(phoneInput.value));

// const emailValidation = (string) => {
//   console.log("detected change", string);
//   const re = /[0-9]{3}[-][0-9]{3}[-][0-9]{4}/;
//   if (!re.exec(string)) {
//     console.log("no match!");
//     phoneError.innerHTML = "Invalid phone format, expected XXX-XXX-XXXX";
//     phoneError.style.color = 'red';
//     phoneError.style.fontWeight = 'bold';
//   } else {
//     phoneError.innerHTML = ""
//   }
// }

// phoneInput.addEventListener('keydown', phoneValidation(phoneInput.value));
