<%@ page contentType="text/html" pageEncoding="utf-8" %>


    <!DOCTYPE html>
    <html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>

    <body>
        <section id="consultar-orador" class="mt-5 text-center">
            <h2 class="mt-5">Conferencia de Buenos Aires</h2>
            <h4>Consultar Orador</h4>
            <form action="verorador" method="get">
                <div class="container">
                    <div class="row justify-content-center mt-3 mb-2">
                        <div class="col-10 col-sm-6">
                            <input type="text" name="Id" class="form-control" placeholder="Id Orador" aria-label="Id">
                        </div>
                    </div>
                    <div class="row justify-content-center mb-2">
                        <div id="consultar" class="d-grid col-5 col-sm-3">
                            <button class="btn btn-success txt-large" id="btn-consultar" type="submit">Ver</button>
                        </div>
                        <div id="volver" class="d-grid col-5 col-sm-3">
                            <a class="btn btn-success" href="index.html" role="button">Volver al inicio</a>
                        </div>
                    </div>
                </div>
            </form>
            <!--<section>
            <h2>Buscar por ID</h2>
            <form action="vercliente" method="get">
                <div>
                    <label>Id Cliente</label>
                    <input name="id" type="text" />
                </div>
                <input type="submit" value="Ver" />
            </form>
        </section>-->
        </Section>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    </body>

    </html>