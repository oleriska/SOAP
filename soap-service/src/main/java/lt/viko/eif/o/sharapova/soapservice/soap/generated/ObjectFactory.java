
package lt.viko.eif.o.sharapova.soapservice.soap.generated;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.o.sharapova.soapservice.soap.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Library_QNAME = new QName("http://spring.io/guides/gs-producing-web-service", "library");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.o.sharapova.soapservice.soap.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link GetLibrariesByBookRequest }
     * 
     */
    public GetLibrariesByBookRequest createGetLibrariesByBookRequest() {
        return new GetLibrariesByBookRequest();
    }

    /**
     * Create an instance of {@link GetLibraryByNameRequest }
     * 
     */
    public GetLibraryByNameRequest createGetLibraryByNameRequest() {
        return new GetLibraryByNameRequest();
    }

    /**
     * Create an instance of {@link GetLibraryByNameResponse }
     * 
     */
    public GetLibraryByNameResponse createGetLibraryByNameResponse() {
        return new GetLibraryByNameResponse();
    }

    /**
     * Create an instance of {@link GetLibrariesByBookResponse }
     * 
     */
    public GetLibrariesByBookResponse createGetLibrariesByBookResponse() {
        return new GetLibrariesByBookResponse();
    }

    /**
     * Create an instance of {@link Loans }
     * 
     */
    public Loans createLoans() {
        return new Loans();
    }

    /**
     * Create an instance of {@link LibraryBook }
     * 
     */
    public LibraryBook createLibraryBook() {
        return new LibraryBook();
    }

    /**
     * Create an instance of {@link LibraryLoan }
     * 
     */
    public LibraryLoan createLibraryLoan() {
        return new LibraryLoan();
    }

    /**
     * Create an instance of {@link Books }
     * 
     */
    public Books createBooks() {
        return new Books();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Library }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://spring.io/guides/gs-producing-web-service", name = "library")
    public JAXBElement<Library> createLibrary(Library value) {
        return new JAXBElement<Library>(_Library_QNAME, Library.class, null, value);
    }

}
