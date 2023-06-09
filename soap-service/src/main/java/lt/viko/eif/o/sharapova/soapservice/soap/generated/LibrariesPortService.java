
package lt.viko.eif.o.sharapova.soapservice.soap.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LibrariesPortService", targetNamespace = "http://spring.io/guides/gs-producing-web-service", wsdlLocation = "http://localhost:8080/ws/libraries.wsdl")
public class LibrariesPortService
    extends Service
{

    private final static URL LIBRARIESPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException LIBRARIESPORTSERVICE_EXCEPTION;
    private final static QName LIBRARIESPORTSERVICE_QNAME = new QName("http://spring.io/guides/gs-producing-web-service", "LibrariesPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/libraries.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIBRARIESPORTSERVICE_WSDL_LOCATION = url;
        LIBRARIESPORTSERVICE_EXCEPTION = e;
    }

    public LibrariesPortService() {
        super(__getWsdlLocation(), LIBRARIESPORTSERVICE_QNAME);
    }

    public LibrariesPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIBRARIESPORTSERVICE_QNAME, features);
    }

    public LibrariesPortService(URL wsdlLocation) {
        super(wsdlLocation, LIBRARIESPORTSERVICE_QNAME);
    }

    public LibrariesPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIBRARIESPORTSERVICE_QNAME, features);
    }

    public LibrariesPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibrariesPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LibrariesPort
     */
    @WebEndpoint(name = "LibrariesPortSoap11")
    public LibrariesPort getLibrariesPortSoap11() {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "LibrariesPortSoap11"), LibrariesPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LibrariesPort
     */
    @WebEndpoint(name = "LibrariesPortSoap11")
    public LibrariesPort getLibrariesPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "LibrariesPortSoap11"), LibrariesPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIBRARIESPORTSERVICE_EXCEPTION!= null) {
            throw LIBRARIESPORTSERVICE_EXCEPTION;
        }
        return LIBRARIESPORTSERVICE_WSDL_LOCATION;
    }

}
