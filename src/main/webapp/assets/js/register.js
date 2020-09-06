$('document').ready(function () {
    var password = document.getElementById("password");
    var confirmpassword = document.getElementById("confirmpassword");

    function validatePassword() {
        if (password.value != confirmpassword.value){
            confirmpassword.setCustomValidity("Passsword Do Not Match");

        }
        else {
            confirmpassword.setCustomValidity('');
        }
    }
    password.onchange = validatePassword;
    confirmpassword.onkeyup = validatePassword;

});
