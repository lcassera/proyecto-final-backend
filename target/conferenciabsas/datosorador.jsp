<%@ page contentType="text/html" pageEncoding="utf-8" %>

    <!DOCTYPE html>
    <html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informacion Registro</title>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>

    <body>
        <section id="consultar-orador" class="mt-5 text-center">
            <h2 class="mt-5">Conferencia de Buenos Aires</h2>
            <h4>Datos del Orador ID ${c.getId()}</h4>
            <table class="table table-success table-striped">
                <thead>
                    <tr>
                        <th scope="col">Nombre</th>
                        <th scope="col">Apellido</th>
                        <th scope="col">Contacto</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>${c.getNombre()}</td>
                        <td>${c.getApellido()}</td>
                        <td>${c.getContacto()}</td>
                    </tr>
                </tbody>
            </table>
            <div class="row justify-content-center mb-2">
                <div id="consular" class="d-grid col-5 col-sm-3">
                    <a class="btn btn-success" href="buscarId.jsp" role="button">Nueva Consulta</a>
                </div>
                <div id="volver" class="d-grid col-5 col-sm-3">
                    <a class="btn btn-success" href="index.html" role="button">Volver al inicio</a>
                </div>
            </div>
        </section>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    </body>

    </html>
   