$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });


});

function autenticarUsuario() {

    let username = $("#usuario").val();
    let contrasena = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin1",
        data: $.param({
            username: username,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let username = parsedResult['username'];
                document.location.href = "menu.html?username=" + username;
            } else {
                    $("#login-error").removeClass("d-none");
            }
        }
    });
}

function registrarUsuario() {
    

    let names = $("#nombres").val();
    let email = $("#email").val();
    let username = $("#nombreus").val();
    let contrasena = $("#contrasena").val();
    let rol = 1;
    let state = 1;
    
   
    $.ajax({
         type: "GET",
         dataType: "html",
         url: "./ServletUsuarioRegistrar1",
         data: $.param({
             names: names,
             email: email,
             username: username,
             contrasena: contrasena,
             rol: rol,
             state: state
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let username = parsedResult['username'];
                    document.location.href = "menu.html?username=" + username;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
    });

}



