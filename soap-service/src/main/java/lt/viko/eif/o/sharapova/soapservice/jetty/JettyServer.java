package lt.viko.eif.o.sharapova.soapservice.jetty;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

/**
 * Jetty server class that servers as a wrapper and configures the actual server on start.
 */
public class JettyServer {
    private Server server;

    /**
     * Starts the Jetty server.
     */
    public void start() throws Exception {
        server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8090);
        server.setConnectors(new Connector[] {connector});

        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);
        servletHandler.addServletWithMapping(JettyPDFStaticServlet.class, "/pdf/static");
        servletHandler.addServletWithMapping(JettyMainServlet.class, "/pdf/*");

        server.start();
    }

    /**
     * Stops the Jetty server.
     */
    public void stop() throws Exception {
        server.stop();
    }
}
