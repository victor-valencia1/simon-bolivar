package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/banner.jsp");
    _jspx_dependants.add("/nav.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Inicio</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow'\r\n");
      out.write("              rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Fjalla+One'\r\n");
      out.write("              rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            window.jQuery\r\n");
      out.write("                    || document\r\n");
      out.write("                    .write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"js/modernizr.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilos.css\" type=\"text/css\">\r\n");
      out.write("<title>banner</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"contbanner\">\r\n");
      out.write("<div id=\"banner\">\r\n");
      out.write("<img src=\"imagenes/banner.jpg\" >\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <title>Nav</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow'\r\n");
      out.write("              rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Fjalla+One'\r\n");
      out.write("              rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/modal.css\">\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            window.jQuery\r\n");
      out.write("                    || document.write(\r\n");
      out.write("                            '<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"js/modernizr.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--======================================== Boton ir arriba ========================================-->\r\n");
      out.write("        <i class=\"btn-up fa fa-arrow-circle-o-up hidden-xs\"></i>\r\n");
      out.write("        <!--======================================== Navegación ========================================-->\r\n");
      out.write("        <header class=\"full-reset header\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--======================================== Links de navegación ========================================-->\r\n");
      out.write("            <nav class=\"navbar navbar-inverse\" style=\"background-color: #090b55;\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">I.E SIMÓN BOLÍVAR</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("                        <li><a href=\"institucion.jsp\">Institución</a></li>\r\n");
      out.write("                        <li><a href=\"Secretaria.jsp\">Secretaría</a></li>\r\n");
      out.write("                        <li><a href=\"estudiantes.jsp\">Estudiantes</a></li>\r\n");
      out.write("                        <li><a href=\"galeria.jsp\">Galería</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\r\n");
      out.write("                        <button\r\n");
      out.write("                            onclick=\"document.getElementById('id01').style.display = 'block'\"\r\n");
      out.write("                            style=\"width: auto;\">Login</button>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"id01\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("                            <form class=\"modal-content animate\" action=\"Autenticacion\">\r\n");
      out.write("                                <div class=\"imgcontainer\">\r\n");
      out.write("                                    <span\r\n");
      out.write("                                        onclick=\"document.getElementById('id01').style.display = 'none'\"\r\n");
      out.write("                                        class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"container2\">\r\n");
      out.write("                                    <label for=\"uname\"><b style=\"color: black\">Usuario</b></label> \r\n");
      out.write("                                    <input style=\"color: black\" type=\"text\" placeholder=\"Enter Username\"\r\n");
      out.write("                                           name=\"uname\" required> <label for=\"psw\"><b\r\n");
      out.write("                                            style=\"color: black\">Contraseña</b></label> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <input style=\"color: black\"\r\n");
      out.write("                                           type=\"password\" placeholder=\"Enter Password\" name=\"psw\"\r\n");
      out.write("                                           required>\r\n");
      out.write("\r\n");
      out.write("                                    <button type=\"submit\">Login</button>\r\n");
      out.write("                                    <label> <input style=\"color: black\" type=\"checkbox\"\r\n");
      out.write("                                                   checked=\"checked\" name=\"remember\"><b\r\n");
      out.write("                                                   style=\"color: black\"> Recordar</b>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"container2\" style=\"background-color: #f1f1f1\">\r\n");
      out.write("                                    <button type=\"button\"\r\n");
      out.write("                                            onclick=\"document.getElementById('id01').style.display = 'none'\"\r\n");
      out.write("                                            class=\"cancelbtn\">Cancel</button>\r\n");
      out.write("                                    <span class=\"psw\"> <b style=\"color: black\"> Recordar\r\n");
      out.write("                                            <a href=\"#\"><b style=\"color: black\">contraseña?</b></a>\r\n");
      out.write("                                        </b></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <script>\r\n");
      out.write("                            // Get the modal\r\n");
      out.write("                            var modal = document.getElementById('id01');\r\n");
      out.write("\r\n");
      out.write("                            // When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("                            window.onclick = function (event) {\r\n");
      out.write("                                if (event.target == modal) {\r\n");
      out.write("                                    modal.style.display = \"none\";\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                        </script>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <!--======================================== Boton menu mobil ========================================-->\r\n");
      out.write("            <a href=\"#\"\r\n");
      out.write("               class=\" hidden-sm hidden-md hidden-lg pull-right button-menu-mobile show-close-menu-m\"><i\r\n");
      out.write("                    class=\"fa fa-ellipsis-v\"></i></a>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        <!--======================================== Logo & principios ========================================-->\r\n");
      out.write("        <section class=\"full-reset font-cover\"\r\n");
      out.write("                 style=\"background-image: url(WebContent/imagenes/logo.png);\">\r\n");
      out.write("            <div class=\"full-reset\"\r\n");
      out.write("                 style=\"height: 100%; background-color: rgba(255, 255, 255, .6); padding: 60px 0;\">\r\n");
      out.write("                <h1 class=\"text-center titles\">Principios</h1>\r\n");
      out.write("                <figure class=\"Logo-Ins-Index\">\r\n");
      out.write("                    <img src=\"imagenes/logo.png\" alt=\"Logo\" class=\"img-responsive\">\r\n");
      out.write("                </figure>\r\n");
      out.write("                <p class=\"lead text-center\">\"La formación en la I.E. Simón\r\n");
      out.write("                    Bolívar de Itagüí está basada en los principios del derecho a: la\r\n");
      out.write("                    vida, la libertad con responsabilidad y la propiedad como resultado\r\n");
      out.write("                    de la individualidad y la dignidad, el autogobierno y el carácter,\r\n");
      out.write("                    contribuyendo a una educación con calidad humana y comprometida con\r\n");
      out.write("                    el cambio social.\"</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <div class=\"divider-general\"></div>\r\n");
      out.write("        <!--======================================== Video corto & carrusel========================================-->\r\n");
      out.write("        <section class=\"full-reset\"\r\n");
      out.write("                 style=\"background-color: rgb(242, 242, 242); padding: 40px 0;\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h2 class=\"text-center titles\">Eventos de la institución</h2>\r\n");
      out.write("                <br> <br>\r\n");
      out.write("                <!--======================================== Carrusel ========================================-->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6 col-sm-push-6\">\r\n");
      out.write("                        <h3 class=\"text-center titles\">Fotos Eventos</h3>\r\n");
      out.write("                        <p class=\"lead\">\r\n");
      out.write("                            Algunos de nuestros eventos en la institucion, tales como el\r\n");
      out.write("                            proyecto del dia libre, semana de la literatura y el lenguaje y\r\n");
      out.write("                            posecion del gobierno escolar. <a\r\n");
      out.write("                                href=\"http://ins-sensunte.net/imagenes/espacio_ins/Flash01/index.html\"\r\n");
      out.write("                                class=\"open-link-newTab\">Has click aqui para ver las fotos</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <i class=\"fa fa-picture-o icon-index hidden-xs hidden-sm\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6 col-sm-pull-6\">\r\n");
      out.write("                        <div id=\"slider-ins\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                            <!-- Indicadores -->\r\n");
      out.write("                            <ol class=\"carousel-indicators\">\r\n");
      out.write("                                <li data-target=\"#slider-ins\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                                <li data-target=\"#slider-ins\" data-slide-to=\"1\"></li>\r\n");
      out.write("                                <li data-target=\"#slider-ins\" data-slide-to=\"2\"></li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Imagenes -->\r\n");
      out.write("                            <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Primera imagen -->\r\n");
      out.write("                                <div class=\"item active\">\r\n");
      out.write("                                    <img src=\"imagenes/1.jpg\" alt=\"Default\">\r\n");
      out.write("                                    <div class=\"carousel-caption\">Proyecto del dia libre</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Segunda imagen -->\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <img src=\"imagenes/2.jpg\" alt=\"Default\">\r\n");
      out.write("                                    <div class=\"carousel-caption\">Semana del lenguaje y la\r\n");
      out.write("                                        literatura</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Tercera imagen -->\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <img src=\"imagenes/3.png\" alt=\"Default\">\r\n");
      out.write("                                    <div class=\"carousel-caption\">Posesion del gobierno\r\n");
      out.write("                                        escolar</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Controles -->\r\n");
      out.write("                            <a class=\"left carousel-control\" href=\"#slider-ins\" role=\"button\"\r\n");
      out.write("                               data-slide=\"prev\"> <span\r\n");
      out.write("                                    class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                <span class=\"sr-only\">Anterior</span>\r\n");
      out.write("                            </a> <a class=\"right carousel-control\" href=\"#slider-ins\"\r\n");
      out.write("                                    role=\"button\" data-slide=\"next\"> <span\r\n");
      out.write("                                    class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                <span class=\"sr-only\">Siguiente</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"divider-general\"></div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <!--======================================== Video ========================================-->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6\">\r\n");
      out.write("                        <h3 class=\"text-center titles\">Himno Escolar</h3>\r\n");
      out.write("                        <p class=\"lead\">\r\n");
      out.write("                            El himno fue establecido mediante concurso en noviembre de 1997 y\r\n");
      out.write("                            fue adoptado legalmente por la Institución Educativa en 2003.<br>\r\n");
      out.write("                            Letra: Julián Andrés Montoya A.<br> Música: Maribel Escobar P\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <i class=\"fa fa-film icon-index hidden-xs hidden-sm\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6\">\r\n");
      out.write("                        <video controls>\r\n");
      out.write("                            <source src=\"video/himno.mp4\" type=\"video/mp4\">\r\n");
      out.write("                        </video>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <div class=\"divider-general\"></div>\r\n");
      out.write("        <!--======================================== Acontecer institucional ========================================-->\r\n");
      out.write("        <section class=\"events-ins\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <h2 class=\"text-center titles\">ACONTECER INSTITUCIONAL</h2>\r\n");
      out.write("                <br> <br>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!--======================================== Articulo 1 ========================================-->\r\n");
      out.write("                    <article class=\"col-xs-12 col-sm-6 col-md-4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <img src=\"imagenes/familia.jpg\" alt=\"IMG\"\r\n");
      out.write("                                 class=\"img-responsive img-rounded\">\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">Dia de la familia</h3>\r\n");
      out.write("                                <p class=\"text-justify\"></p>\r\n");
      out.write("                                <p class=\"text-center\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\" role=\"button\">Ver\r\n");
      out.write("                                        imágenes</a>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("                    <!--======================================== Articulo 2 ========================================-->\r\n");
      out.write("                    <article class=\"col-xs-12 col-sm-6 col-md-4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <img src=\"imagenes/dia_del_estudiante.png\" alt=\"IMG\"\r\n");
      out.write("                                 class=\"img-responsive img-rounded\">\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">Dia del estudiante</h3>\r\n");
      out.write("                                <p class=\"text-justify\"></p>\r\n");
      out.write("                                <p class=\"text-center\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\" role=\"button\">Ver\r\n");
      out.write("                                        imágenes</a>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("                    <!--======================================== Articulo 3 ========================================-->\r\n");
      out.write("                    <article class=\"col-xs-12 col-sm-6 col-md-4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <img src=\"imagenes/simbolos.jpg\" alt=\"IMG\"\r\n");
      out.write("                                 class=\"img-responsive img-rounded\">\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">Entrega de simbolos</h3>\r\n");
      out.write("                                <p class=\"text-justify\"></p>\r\n");
      out.write("                                <p class=\"text-center\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\" role=\"button\">Ver\r\n");
      out.write("                                        imágenes</a>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <div class=\"divider-general\"></div>\r\n");
      out.write("        <!--======================================== Enlaces importantes ========================================-->\r\n");
      out.write("        <section class=\"text-center important-links-index\">\r\n");
      out.write("            <h2 class=\"titles\">Sitios y enlaces importantes</h2>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"http://www.semitagui.gov.co/\" class=\"open-link-newTab\"> <i\r\n");
      out.write("                    class=\"fa fa-graduation-cap\"></i>\r\n");
      out.write("                <p>Secretaria</p> <a href=\"http://www.sena.edu.co/Paginas/Inicio.aspx\" class=\"open-link-newTab\"> <i\r\n");
      out.write("                        class=\"fa fa-globe\"></i>\r\n");
      out.write("                    <p>SENA</p>\r\n");
      out.write("                </a> <a href=\"http://www.icfes.gov.co/\" class=\"open-link-newTab\"> <i class=\"fa fa-star-o\"></i>\r\n");
      out.write("                    <p>ICFES</p>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        <br>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("<title>footer</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Fjalla+One'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\twindow.jQuery\r\n");
      out.write("\t\t\t|| document\r\n");
      out.write("\t\t\t\t\t.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"js/modernizr.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("\t<footer class=\"full-reset footer\">\r\n");
      out.write("\t\t<div class=\"full-reset\" style=\"padding: 15px 0;\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"titles text-center\">Visitenos en</h4>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\tDirección: Calle 65 No. 46 A 95<br>Itagüí - Antioquia -\r\n");
      out.write("\t\t\t\t\t\t\tColombia\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"titles text-center\">Contactenos</h4>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-center\">Teléfono: 3710522 secretaría ext: 101 -\r\n");
      out.write("\t\t\t\t\t\t\t102. Rectoría 110. Portería: 103 - 104</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"titles subtitles-footer\">Siguenos en</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"list-unstyled links-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#!\" class=\"open-link-newTab\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-facebook\"></i> &nbsp; Facebook</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#!\" class=\"open-link-newTab\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i> &nbsp; Twitter</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#!\" class=\"open-link-newTab\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-google-plus\"></i> &nbsp; Google+</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"full-reset footer-copyright\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-copyright\"></i> Copyright © 2018 <br>® Todos\r\n");
      out.write("\t\t\t\t\t\t\tlos derechos reservados.\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}