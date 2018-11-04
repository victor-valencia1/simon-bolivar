<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Estudiantes</title>
    </head>
    <body>
        <%@ include file="banner.jsp" %>
        <%@ include file="nav.jsp" %>
        <!--======================================== Boton ir arriba ========================================-->
        <i class="btn-up fa fa-arrow-circle-o-up hidden-xs"></i>
        <!--======================================== contenido de la pagina ========================================-->
        <section class="full-reset"
                 style="background-color: #fff; padding: 20px 0;">
            <div class="container">
                <div class="row">
                    <section class="col-xs-12 col-sm-8 col-md-9 info-section-ins">
                        <p class="lead"></p>
                        <br>
                        <br>
                        <p class="lead">
                            Matricular a los niños y jóvenes, garantizando que la información de los 
                            estudiantes que ingresan a la institución esté completa, ordenada y veraz, que 
                            facilite la trazabilidad del estudiante en cualquier momento, así también rendir 
                            informes que generen confianza tanto en la institución, Secretaría de Educación 
                            y el Sistema de Gestión de Calidad.
                        </p>

                    </section>
                    <!--======================================== Navegacion fija lateral derecha ========================================-->
                    <aside class="hidden-xs scroll-navigation-ins">
                        <figure class="full-reset">
                            <img src="imagenes/logo.png" alt="Logo"
                                 class="img-responsive center-box">
                        </figure>
                        <h4 class="text-center titles">Estudiantes</h4>
                        <ul class="list-unstyled full-reset">
                            <li data-href="#b-general">General</li>
                            <li data-href="#b-asistente">Asistencia Administrativa</li>

                        </ul>
                    </aside>
                </div>
            </div>
        </section>
    </body>
</html>