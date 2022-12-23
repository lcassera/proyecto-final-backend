<%@ page contentType="text/html" pageEncoding="utf-8" %>


    <!DOCTYPE html>
    <html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>

    <body>
        <section id="error" class="mt-5 text-center">
            <h2 class="mt-5">Conferencia de Buenos Aires</h2>
            <h4>Datos del Orador</h4>
            <div class="container">
                <div class="row justify-content-center mt-3">
                    <div class="col-10 col-sm-6">
                        <div class="alert alert-success" role="alert">
                            El id consultado no existe
                        </div>
                    </div>
                </div>
                
                <div class="row justify-content-center mb-2">
                    <div id="consular" class="d-grid col-6 col-sm-3">
                        <a class="btn btn-success" href="buscarId.jsp" role="button">Nueva Consulta</a>
                    </div>
                    <div id="volver" class="d-grid col-6 col-sm-3">
                        <a class="btn btn-success" href="index.html" role="button">Volver al inicio</a>
                    </div>
                </div>
            </div>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    </body>

    </html>