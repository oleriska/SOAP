package lt.viko.eif.o.sharapova.soapservice.jetty;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Represents a Jetty servlet.
 */
public class JettyPDFStaticServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pdfFileName = "./src/main/resources/pdf/library.pdf";
        File pdfFile = new File(pdfFileName);
        resp.setContentType("application/pdf");
        resp.setHeader("Content-Disposition", "inline; filename=" + pdfFileName);
        resp.setContentLength((int) pdfFile.length());

        try (FileInputStream fis = new FileInputStream(pdfFileName)) {
            OutputStream outputStream = resp.getOutputStream();
            int bytes;
            while ((bytes = fis.read()) != -1) {
                outputStream.write(bytes);
            }
        }
    }
}
