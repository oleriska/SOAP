package lt.viko.eif.o.sharapova.soapservice.jetty;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Represents a Jetty servlet.
 */
public class JettyMainServlet extends HttpServlet {

    /**
     * Defines handler for the specified endpoint and GET HTTP request.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().contains("/static")) {
            servePdfFile(resp);
        } else {
            PrintWriter out = resp.getWriter();
            out.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "\n" +
                    "  <title>National Library</title>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n" +
                    "  <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n" +
                    "  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n" +
                    "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\n" +
                    "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n" +
                    "  <style>\n" +
                    "  body {\n" +
                    "    font: 400 15px/1.8 Lato, sans-serif;\n" +
                    "    color: #777;\n" +
                    "  }\n" +
                    "  h3, h4 {\n" +
                    "    margin: 10px 0 30px 0;\n" +
                    "    letter-spacing: 10px;\n" +
                    "    font-size: 20px;\n" +
                    "    color: #111;\n" +
                    "  }\n" +
                    "  .container {\n" +
                    "    padding: 80px 120px;\n" +
                    "  }\n" +
                    "  .person {\n" +
                    "    border: 10px solid transparent;\n" +
                    "    margin-bottom: 25px;\n" +
                    "    width: 80%;\n" +
                    "    height: 80%;\n" +
                    "    opacity: 0.7;\n" +
                    "  }\n" +
                    "  .person:hover {\n" +
                    "    border-color: #f1f1f1;\n" +
                    "  }\n" +
                    "  .carousel-inner img {\n" +
                    "    -webkit-filter: grayscale(90%);\n" +
                    "    filter: grayscale(90%); /* make all photos black and white */\n" +
                    "    width: 100%; /* Set width to 100% */\n" +
                    "    margin: auto;\n" +
                    "  }\n" +
                    "  .carousel-caption h3 {\n" +
                    "    color: #fff !important;\n" +
                    "  }\n" +
                    "  @media (max-width: 600px) {\n" +
                    "    .carousel-caption {\n" +
                    "      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */\n" +
                    "    }\n" +
                    "  }\n" +
                    "  .bg-1 {\n" +
                    "    background: #2d2d30;\n" +
                    "    color: #bdbdbd;\n" +
                    "  }\n" +
                    "  .bg-1 h3 {color: #fff;}\n" +
                    "  .bg-1 p {font-style: italic;}\n" +
                    "  .list-group-item:first-child {\n" +
                    "    border-top-right-radius: 0;\n" +
                    "    border-top-left-radius: 0;\n" +
                    "  }\n" +
                    "  .list-group-item:last-child {\n" +
                    "    border-bottom-right-radius: 0;\n" +
                    "    border-bottom-left-radius: 0;\n" +
                    "  }\n" +
                    "  .thumbnail {\n" +
                    "    padding: 0 0 15px 0;\n" +
                    "    border: none;\n" +
                    "    border-radius: 0;\n" +
                    "  }\n" +
                    "  .thumbnail p {\n" +
                    "    margin-top: 15px;\n" +
                    "    color: #555;\n" +
                    "  }\n" +
                    "  .btn {\n" +
                    "    padding: 10px 20px;\n" +
                    "    background-color: #333;\n" +
                    "    color: #f1f1f1;\n" +
                    "    border-radius: 0;\n" +
                    "    transition: .2s;\n" +
                    "  }\n" +
                    "  .btn:hover, .btn:focus {\n" +
                    "    border: 1px solid #333;\n" +
                    "    background-color: #fff;\n" +
                    "    color: #000;\n" +
                    "  }\n" +
                    "  .modal-header, h4, .close {\n" +
                    "    background-color: #333;\n" +
                    "    color: #fff !important;\n" +
                    "    text-align: center;\n" +
                    "    font-size: 30px;\n" +
                    "  }\n" +
                    "  .modal-header, .modal-body {\n" +
                    "    padding: 40px 50px;\n" +
                    "  }\n" +
                    "  .nav-tabs li a {\n" +
                    "    color: #777;\n" +
                    "  }\n" +
                    "  #googleMap {\n" +
                    "    width: 100%;\n" +
                    "    height: 400px;\n" +
                    "    -webkit-filter: grayscale(100%);\n" +
                    "    filter: grayscale(100%);\n" +
                    "  }\n" +
                    "  .navbar {\n" +
                    "    font-family: Montserrat, sans-serif;\n" +
                    "    margin-bottom: 0;\n" +
                    "    background-color: #2d2d30;\n" +
                    "    border: 0;\n" +
                    "    font-size: 11px !important;\n" +
                    "    letter-spacing: 4px;\n" +
                    "    opacity: 0.9;\n" +
                    "  }\n" +
                    "  .navbar li a, .navbar .navbar-brand {\n" +
                    "    color: #d5d5d5 !important;\n" +
                    "  }\n" +
                    "  .navbar-nav li a:hover {\n" +
                    "    color: #fff !important;\n" +
                    "  }\n" +
                    "  .navbar-nav li.active a {\n" +
                    "    color: #fff !important;\n" +
                    "    background-color: #29292c !important;\n" +
                    "  }\n" +
                    "  .navbar-default .navbar-toggle {\n" +
                    "    border-color: transparent;\n" +
                    "  }\n" +
                    "  .open .dropdown-toggle {\n" +
                    "    color: #fff;\n" +
                    "    background-color: #555 !important;\n" +
                    "  }\n" +
                    "  .dropdown-menu li a {\n" +
                    "    color: #000 !important;\n" +
                    "  }\n" +
                    "  .dropdown-menu li a:hover {\n" +
                    "    background-color: red !important;\n" +
                    "  }\n" +
                    "  footer {\n" +
                    "    background-color: #2d2d30;\n" +
                    "    color: #f5f5f5;\n" +
                    "    padding: 32px;\n" +
                    "  }\n" +
                    "  footer a {\n" +
                    "    color: #f5f5f5;\n" +
                    "  }\n" +
                    "  footer a:hover {\n" +
                    "    color: #777;\n" +
                    "    text-decoration: none;\n" +
                    "  }\n" +
                    "  .form-control {\n" +
                    "    border-radius: 0;\n" +
                    "  }\n" +
                    "  textarea {\n" +
                    "    resize: none;\n" +
                    "  }\n" +
                    "  </style>\n" +
                    "</head>\n" +
                    "<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n" +
                    "\n" +
                    "<nav class=\"navbar navbar-default navbar-fixed-top\">\n" +
                    "  <div class=\"container-fluid\">\n" +
                    "    <div class=\"navbar-header\">\n" +
                    "      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n" +
                    "        <span class=\"icon-bar\"></span>\n" +
                    "        <span class=\"icon-bar\"></span>\n" +
                    "        <span class=\"icon-bar\"></span>\n" +
                    "      </button>\n" +
                    "      <a class=\"navbar-brand\" href=\"#myPage\">National Library</a>\n" +
                    "    </div>\n" +
                    "    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
                    "      <ul class=\"nav navbar-nav navbar-right\">\n" +
                    "        <li><a href=\"#myPage\">HOME</a></li>\n" +
                    "        <li><a href=\"#about\">ABOUT</a></li>\n" +
                    "        <li><a href=\"#services\">SERVICES</a></li>\n" +
                    "        <li><a href=\"#contact\">CONTACT</a></li>\n" +
                    "        <li class=\"dropdown\">\n" +
                    "          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">MORE\n" +
                    "            <span class=\"caret\"></span></a>\n" +
                    "          <ul class=\"dropdown-menu\">\n" +
                    "            <li><a href=\"#\">Resources</a></li>\n" +
                    "            <li><a href=\"#\">Studies</a></li>\n" +
                    "            <li><a href=\"#\">Places</a></li>\n" +
                    "          </ul>\n" +
                    "        </li>\n" +
                    "        <li><a href=\"#\"><span class=\"glyphicon glyphicon-search\"></span></a></li>\n" +
                    "      </ul>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "</nav>\n" +
                    "\n" +
                    "<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n" +
                    "  <!-- Indicators -->\n" +
                    "  <ol class=\"carousel-indicators\">\n" +
                    "    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n" +
                    "    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n" +
                    "    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n" +
                    "  </ol>\n" +
                    "\n" +
                    "  <!-- Wrapper for slides -->\n" +
                    "  <div class=\"carousel-inner\" role=\"listbox\">\n" +
                    "    <div class=\"item active\">\n" +
                    "      <img src=\"https://wallpapercave.com/wp/wp9381391.jpg\" alt=\"Creative Space\" width=\"1000\" height=\"500\">\n" +
                    "      <div class=\"carousel-caption\">\n" +
                    "        <h3>Creative Space</h3>\n" +
                    "        <p>A cozy corner with comfortable chairs and soft lighting!</p>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "\n" +
                    "    <div class=\"item\">\n" +
                    "      <img src=\"https://images.adsttc.com/media/images/5268/3c7c/e8e4/4ee8/e100/0386/large_jpg/WillPryce_TheLibrary_3.jpg?1382562932\" alt=\"Study Room\" width=\"1000\" height=\"500\">\n" +
                    "      <div class=\"carousel-caption\">\n" +
                    "        <h3>Study Room</h3>\n" +
                    "        <p>A quiet and peaceful space equipped with tables, chairs, and plenty of electrical outlets for students!</p>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "\n" +
                    "    <div class=\"item\">\n" +
                    "      <img src=\"https://images.pexels.com/photos/14915734/pexels-photo-14915734.jpeg?cs=srgb&dl=pexels-efrem-efre-14915734.jpg&fm=jpg\" alt=\"Lab\" width=\"1000\" height=\"500\">\n" +
                    "      <div class=\"carousel-caption\">\n" +
                    "        <h3>Digital Media Lab</h3>\n" +
                    "        <p>A cutting-edge space equipped with computers, software, and multimedia equipment!</p>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "\n" +
                    "  <!-- Left and right controls -->\n" +
                    "  <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n" +
                    "    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n" +
                    "    <span class=\"sr-only\">Previous</span>\n" +
                    "  </a>\n" +
                    "  <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n" +
                    "    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n" +
                    "    <span class=\"sr-only\">Next</span>\n" +
                    "  </a>\n" +
                    "</div>\n" +
                    "\n" +
                    "<!-- Container (The about Section) -->\n" +
                    "<div id=\"about\" class=\"container text-center\">\n" +
                    "  <h1>Welcome to our library!</h1>\n" +
                    "  <p><em>Open a book, open your mind</em></p>\n" +
                    "  <p>Welcome to our library, a haven of knowledge and imagination.\n" +
                    "\n" +
                    "    Here, you can escape into the world of books and explore the boundless realms of literature.\n" +
                    "    Our vast collection of books, ranging from classic to contemporary, is sure to captivate your mind and ignite your curiosity. Our library offers a peaceful and serene atmosphere, perfect for reading, studying, or simply getting lost in your thoughts. With our friendly and knowledgeable staff, you are guaranteed to find the book you're looking for, or perhaps even discover a new favorite.\n" +
                    "    Come visit us and experience the magic of books firsthand.</p>\n" +
                    "  <br>\n" +
                    "  <h1>Trending books today!</h1>\n" +
                    "  <div class=\"row\">\n" +
                    "    <div class=\"col-sm-4\">\n" +
                    "\n" +
                    "      <a href=\"#demo\" data-toggle=\"collapse\">\n" +
                    "        <img src=\"https://res.cloudinary.com/bloomsbury-atlas/image/upload/w_568,c_scale/jackets/9781619634473.jpg\" alt=\"Name\" width=\"255\" height=\"450\">\n" +
                    "      </a>\n" +
                    "      <p class=\"text-center\"><strong>A Court of Mist and Fury</strong></p><br>\n" +
                    "      <div id=\"demo\" class=\"collapse\">\n" +
                    "        <p>Sarah J. Maas</p>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "\n" +
                    "\n" +
                    "    <div class=\"col-sm-4\">\n" +
                    "\n" +
                    "      <a href=\"#demo2\" data-toggle=\"collapse\">\n" +
                    "        <img src=\"https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1529044298l/39280444.jpg\"  alt=\"Name\" width=\"255\" height=\"450\">\n" +
                    "      </a>\n" +
                    "      <p class=\"text-center\"><strong>Speak</strong></p><br>\n" +
                    "      <div id=\"demo2\" class=\"collapse\">\n" +
                    "        <p>Laurie Halse Anderson</p>\n" +
                    "\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "    <div class=\"col-sm-4\">\n" +
                    "\n" +
                    "      <a href=\"#demo3\" data-toggle=\"collapse\">\n" +
                    "        <img src=\"https://m.media-amazon.com/images/I/81vZjIsKiLL._AC_UF1000,1000_QL80_.jpg\" alt=\"Random Name\" width=\"255\" height=\"450\">\n" +
                    "      </a>\n" +
                    "      <p class=\"text-center\"><strong>The Cruel Prince</strong></p><br>\n" +
                    "      <div id=\"demo3\" class=\"collapse\">\n" +
                    "        <p>Holly Black</p>\n" +
                    "\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "</div>\n" +
                    "\n" +
                    "<!-- Container (service Section) -->\n" +
                    "<div id=\"services\" class=\"bg-1\">\n" +
                    "  <div class=\"container\">\n" +
                    "    <h3 class=\"text-center\">BECOME A MEMBER</h3>\n" +
                    "    <p class=\"text-center\">Join the library community and expand your knowledge horizons!</p>\n" +
                    "    <p></p>\n" +
                    "    <p>As a member of our library, you'll have access to our extensive collections of books,\n" +
                    "      journals, magazines, newspapers, and multimedia resources in various formats, both in print and online.\n" +
                    "      We also offer a range of specialized services to help you maximize the value of your academic pursuits and enhance your scholarly output.\n" +
                    "\n" +
                    "    </p>\n" +
                    "    <h3 class=\"text-center\">WE ARE PROUD OF OUR COLLECTION OF BRITISH BOOKS. EXPLORE IT!</h3>\n" +
                    "    <p class=\"text-center\"><a href='/pdf/static'> View PDF </a></p>\n" +
                    "    <p class=\"text-center\"> Click to view PDF document of selected British Classics Books </p>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "    <div class=\"row text-center\">\n" +
                    "      <div class=\"col-sm-4\">\n" +
                    "        <div class=\"thumbnail\">\n" +
                    "          <img src=\"https://m.media-amazon.com/images/I/91zU70Aw9IS.jpg\" alt=\"1\" width=\"400\" height=\"300\">\n" +
                    "          <p><strong>Charlotte Brontë</strong></p>\n" +
                    "          <p>Jane Eyre</p>\n" +
                    "          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">Get a book</button>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "      <div class=\"col-sm-4\">\n" +
                    "        <div class=\"thumbnail\">\n" +
                    "          <img src=\"https://m.media-amazon.com/images/I/718emUlQwnS._AC_UF1000,1000_QL80_.jpg\" alt=\"2\" width=\"400\" height=\"300\">\n" +
                    "          <p><strong>Jane Austen</strong></p>\n" +
                    "          <p>Sense and Sensibility</p>\n" +
                    "          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">Get a book</button>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "      <div class=\"col-sm-4\">\n" +
                    "        <div class=\"thumbnail\">\n" +
                    "          <img src=\"https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781476788128/the-picture-of-dorian-gray-9781476788128_hr.jpg\" alt=\"3\" width=\"400\" height=\"300\">\n" +
                    "          <p><strong>Oscar Wilde</strong></p>\n" +
                    "          <p>The Picture of Dorian Gray</p>\n" +
                    "          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">Get a book</button>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "\n" +
                    "  </div>\n" +
                    "\n" +
                    "\n" +
                    "  <!-- Modal -->\n" +
                    "  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n" +
                    "    <div class=\"modal-dialog\">\n" +
                    "\n" +
                    "      <!-- Modal content-->\n" +
                    "      <div class=\"modal-content\">\n" +
                    "        <div class=\"modal-header\">\n" +
                    "          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">×</button>\n" +
                    "          <h4><span class=\"glyphicon glyphicon-lock\"></span> Reservation</h4>\n" +
                    "        </div>\n" +
                    "        <div class=\"modal-body\">\n" +
                    "          <form role=\"form\">\n" +
                    "            <div class=\"form-group\">\n" +
                    "              <label for=\"psw\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Number of books </label>\n" +
                    "              <input type=\"number\" class=\"form-control\" id=\"psw\" placeholder=\"How many?\">\n" +
                    "            </div>\n" +
                    "            <div class=\"form-group\">\n" +
                    "              <label for=\"usrname\"><span class=\"glyphicon glyphicon-user\"></span> Your loan number</label>\n" +
                    "              <input type=\"text\" class=\"form-control\" id=\"usrname\" placeholder=\"Enter number\">\n" +
                    "            </div>\n" +
                    "            <button type=\"submit\" class=\"btn btn-block\"> Reserve\n" +
                    "              <span class=\"glyphicon glyphicon-ok\"></span>\n" +
                    "            </button>\n" +
                    "          </form>\n" +
                    "        </div>\n" +
                    "        <div class=\"modal-footer\">\n" +
                    "          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left\" data-dismiss=\"modal\">\n" +
                    "            <span class=\"glyphicon glyphicon-remove\"></span> Cancel\n" +
                    "          </button>\n" +
                    "          <p>Need <a href=\"#\">help?</a></p>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "</div>\n" +
                    "\n" +
                    "<!-- Container (Contact Section) -->\n" +
                    "<div id=\"contact\" class=\"container\">\n" +
                    "  <h3 class=\"text-center\">Contact</h3>\n" +
                    "  <p class=\"text-center\"><em>Write us</em></p>\n" +
                    "\n" +
                    "  <div class=\"row\">\n" +
                    "    <div class=\"col-md-4\">\n" +
                    "      <p>Questions?</p>\n" +
                    "      <p><span class=\"glyphicon glyphicon-map-marker\"></span> Chicago, US</p>\n" +
                    "      <p><span class=\"glyphicon glyphicon-phone\"></span> Phone: +00 6256161611</p>\n" +
                    "      <p><span class=\"glyphicon glyphicon-envelope\"></span> Email: thebestlibraryever@library.com</p>\n" +
                    "    </div>\n" +
                    "    <div class=\"col-md-8\">\n" +
                    "      <div class=\"row\">\n" +
                    "        <div class=\"col-sm-6 form-group\">\n" +
                    "          <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\" type=\"text\" required>\n" +
                    "        </div>\n" +
                    "        <div class=\"col-sm-6 form-group\">\n" +
                    "          <input class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\" type=\"email\" required>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "      <textarea class=\"form-control\" id=\"comments\" name=\"comments\" placeholder=\"Comment\" rows=\"5\"></textarea>\n" +
                    "      <br>\n" +
                    "      <div class=\"row\">\n" +
                    "        <div class=\"col-md-12 form-group\">\n" +
                    "          <button class=\"btn pull-right\" type=\"submit\">Send</button>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "  <br>\n" +
                    "  <h3 class=\"text-center\">OPENING HOURS: Mon-Sat: 9.00-21.00</h3>\n" +
                    "\n" +
                    "\n" +
                    "<!-- Footer -->\n" +
                    "\n" +
                    "\n" +
                    "<script>\n" +
                    "\n" +
                    "</script>\n" +
                    "\n" +
                    "</div>\n" +
                    "</body>\n" +
                    "</html>");

        }
    }

    /**
     * Helper methods that server a PDF file to client.
     */
    private void servePdfFile(HttpServletResponse response) throws IOException {
        response.sendRedirect("/pdf/");
    }

}
