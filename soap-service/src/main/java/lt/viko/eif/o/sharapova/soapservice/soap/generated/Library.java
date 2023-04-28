
package lt.viko.eif.o.sharapova.soapservice.soap.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Library complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Library">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Library_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Books" type="{http://spring.io/guides/gs-producing-web-service}Books"/>
 *         &lt;element name="Loans" type="{http://spring.io/guides/gs-producing-web-service}Loans"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Library", propOrder = {
    "libraryName",
    "books",
    "loans"
})
public class Library {

    @XmlElement(name = "Library_Name", required = true)
    protected String libraryName;
    @XmlElement(name = "Books", required = true)
    protected Books books;
    @XmlElement(name = "Loans", required = true)
    protected Loans loans;

    /**
     * Gets the value of the libraryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the value of the libraryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryName(String value) {
        this.libraryName = value;
    }

    /**
     * Gets the value of the books property.
     * 
     * @return
     *     possible object is
     *     {@link Books }
     *     
     */
    public Books getBooks() {
        return books;
    }

    /**
     * Sets the value of the books property.
     * 
     * @param value
     *     allowed object is
     *     {@link Books }
     *     
     */
    public void setBooks(Books value) {
        this.books = value;
    }

    /**
     * Gets the value of the loans property.
     * 
     * @return
     *     possible object is
     *     {@link Loans }
     *     
     */
    public Loans getLoans() {
        return loans;
    }

    /**
     * Sets the value of the loans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loans }
     *     
     */
    public void setLoans(Loans value) {
        this.loans = value;
    }

}
