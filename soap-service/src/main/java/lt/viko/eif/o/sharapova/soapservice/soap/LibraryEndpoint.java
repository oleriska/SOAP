package lt.viko.eif.o.sharapova.soapservice.soap;

import lt.viko.eif.o.sharapova.soapservice.soap.generated.GetLibrariesByBookRequest;
import lt.viko.eif.o.sharapova.soapservice.soap.generated.GetLibrariesByBookResponse;
import lt.viko.eif.o.sharapova.soapservice.soap.generated.GetLibraryByNameRequest;
import lt.viko.eif.o.sharapova.soapservice.soap.generated.GetLibraryByNameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Defines endpoints of the SOAP Library service in the predefined namespace.
 */
@Endpoint
public class LibraryEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private final LibraryRepository libraryRepository;

    @Autowired
    public LibraryEndpoint(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    /**
     * SOAP endpoint intended to return a Library object with specified name in XML format.
     *
     * @param request request that contains XML body
     * @return Library object in XML format or empty response if there is no such library
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLibraryByNameRequest")
    @ResponsePayload
    public GetLibraryByNameResponse getLibraryByName(@RequestPayload GetLibraryByNameRequest request) {
        GetLibraryByNameResponse response = new GetLibraryByNameResponse();
        response.setLibrary(libraryRepository.findLibraryByName(request.getName()));

        return response;
    }

    /**
     * SOAP endpoint intended to return list of Libraries that have a specified book.
     *
     * @param request request that contains XML body
     * @return List of Library objects in XML format or empty response if there is no such libraries
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLibrariesByBookRequest")
    @ResponsePayload
    public GetLibrariesByBookResponse getLibrariesByBook(@RequestPayload GetLibrariesByBookRequest request) {
        GetLibrariesByBookResponse response = new GetLibrariesByBookResponse();
        response.getLibrary().addAll(libraryRepository.findLibrariesByBook(request.getBook()));

        return response;
    }
}
