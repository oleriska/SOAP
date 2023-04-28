package lt.viko.eif.o.sharapova.soapservice.jetty;

import lt.viko.eif.o.sharapova.soapservice.soap.utils.PDFConverterUtil;

/**
 * Runner of the Jetty server.
 */
public class JettyServerRunner {
    public static void main(String[] args) {
        JettyServer server = new JettyServer();
        try {
            PDFConverterUtil.convertToPDF();
            server.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
