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
    
    //let date = $("#fecharegistro").val();
    //let identype = $("#numeroidentificacion").val();
    let names = $("#nombres").val();
    let email = $("#email").val();
    //let adress = $("#direccion").val();
    //let state = $("#estado").val();
    let username = $("#nombreus").val();
    let contrasena = $("#contrasena").val();
    let contrasenaConfirmacion = $("confcontrasena").val();
    

    if (contrasena == contrasenaConfirmacion) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegistrar",
            data: $.param({
                //dat: date,
                //identype: identype,
                names: names,
                email: email,
                //adress: adress,
                //state: state,
                username: username,
                contrasena: contrasena
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
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}



