//var id_proyecto = new URL(location.href).searchParams.get("id_proyecto");
//var proyecto;

$(document).ready(function () {

    $(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });
    getProyectos(false, "ASC");
    /*getproyecto().then(function () {
        
       // $("#mi-perfil-btn").attr("href","profile.html?username=" + username);
        
        $("#user-costo").html(proyecto.costo.toFixed(2) + "$");

      //  getPeliculas(false, "ASC");

       // $("#ordenar-genero").click(FaseActual);
       
      
    });*/
});

/*async function getUsuario() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletProyectoPedir",
        data: $.param({
            id_proyecto: id_proyecto
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                proyecto = parsedResult;
            } else {
                console.log("Error recuperando los datos del proyecto");
            }
        }
    });

}*/
function getProyectos(ordenar, orden) {

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletProyectoListar",
        data: $.param({
            ordenar: ordenar,
            orden: orden
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                mostrarProyectos(parsedResult);
            } else {
                console.log("Error recuperando los datos de las proyectos");
            }
        }
    });
}

function mostrarProyectos(proyectos) {

    let contenido = "";

    $.each(proyectos, function (index, Proyecto) {

        Proyecto = JSON.parse(Proyecto);
        //let precio;


            contenido += '<tr><th scope="row">' + Proyecto.id_proyecto+ '</th>' +
                    '<td>' + Proyecto.nombre + '</td>' +
                    '<td>' + Proyecto.id_cliente + '</td>' +
                    '<td>' + Proyecto.fecha_registro + '</td>' +
                    '<td>' + Proyecto.fecha_ejecucion + '</td>' +
                    '<td>' + Proyecto.costo + '</td>' +
                    '<td>' + Proyecto.tiempo_estimado + '</td>' +
                    '<td>' + Proyecto.descripcion + '</td>' +
                    '<td>' + Proyecto.id_servicio + '</td>' +
                    '<td>' + Proyecto.id_empleado + '</td>' +
                    '<td>' + Proyecto.estado + '</td>';// +
                    //'<td><input type="checkbox" name="novedad" id="novedad' + pelicula.id + '" disabled ';
       /*     if (Proyecto.novedad) {
                contenido += 'checked';
            }
            contenido += '></td>' +
                    '<td>' + precio + '</td>' +
                    '<td><button onclick="alquilarPelicula(' + pelicula.id + ',' + precio + ');" class="btn btn-success" ';
            if (proyecto.costo < precio) {
                contenido += ' disabled ';
            }*/

           // contenido += '>Reservar</button></td></tr>'

       // }
    });
    $("#peliculas-tbody").html(contenido);
}















/*

$(document).ready(function () {
    
    $("#form-registerEmple").submit(function (event) {

        event.preventDefault();
        registrarEmpleado();
    });
    
    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarEmpleado();
    });

});
*/

/*
function registrarEmpleado() {

    let numero_documento = $("#numero_documento").val();
    let nombre = $("#nombre").val();
    let email = $("#email").val();
    let direccion = $("#direccion").val();
    let telefono = $("#telefono").val();
    let cargo = $("#cargo").val();
    let profesion = $("#profesion").val();
    let estado = 1;
    let id_usuario = 9;


    $.ajax({
         type: "GET",
         dataType: "html",
         url: "./ServletEmpleadoRegistrar",
         data: $.param({
             numero_documento: numero_documento,
             nombre: nombre,
             email: email,
             direccion: direccion,
             telefono: telefono,
             cargo: cargo,
             profesion: profesion,
             estado: estado,
             id_usuario: id_usuario
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let username = parsedResult['username'];
                    document.location.href = "empleados.html?username=" + username;  //Pendiente por direccioanr//
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del empleado");
                }
            }
    });
}

*/