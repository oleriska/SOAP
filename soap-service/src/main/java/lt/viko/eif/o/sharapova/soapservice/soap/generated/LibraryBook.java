
package lt.viko.eif.o.sharapova.soapservice.soap.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Library_Book complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Library_Book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Book_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Book_Author_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Book_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Book_Edition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Book_Release_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Library_Book", propOrder = {
    "bookID",
    "bookAuthorID",
    "bookTitle",
    "bookEdition",
    "bookReleaseDate"
})
public class LibraryBook {

    @XmlElement(name = "Book_ID")
    protected int bookID;
    @XmlElement(name = "Book_Author_ID")
    protected int bookAuthorID;
    @XmlElement(name = "Book_Title", required = true)
    protected String bookTitle;
    @XmlElement(name = "Book_Edition")
    protected int bookEdition;
    @XmlElement(name = "Book_Release_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookReleaseDate;

    public LibraryBook() {
    }

    public LibraryBook(int bookID, int bookAuthorID, String bookTitle, int bookEdition, XMLGregorianCalendar bookReleaseDate) {
        this.bookID = bookID;
        this.bookAuthorID = bookAuthorID;
        this.bookTitle = bookTitle;
        this.bookEdition = bookEdition;
        this.bookReleaseDate = bookReleaseDate;
    }

    /**
     * Gets the value of the bookID property.
     * 
     */
    public int getBookID() {
        return bookID;
    }

    /**
     * Sets the value of the bookID property.
     * 
     */
    public void setBookID(int value) {
        this.bookID = value;
    }

    /**
     * Gets the value of the bookAuthorID property.
     * 
     */
    public int getBookAuthorID() {
        return bookAuthorID;
    }

    /**
     * Sets the value of the bookAuthorID property.
     * 
     */
    public void setBookAuthorID(int value) {
        this.bookAuthorID = value;
    }

    /**
     * Gets the value of the bookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the value of the bookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    /**
     * Gets the value of the bookEdition property.
     * 
     */
    public int getBookEdition() {
        return bookEdition;
    }

    /**
     * Sets the value of the bookEdition property.
     * 
     */
    public void setBookEdition(int value) {
        this.bookEdition = value;
    }

    /**
     * Gets the value of the bookReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookReleaseDate() {
        return bookReleaseDate;
    }

    /**
     * Sets the value of the bookReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookReleaseDate(XMLGregorianCalendar value) {
        this.bookReleaseDate = value;
    }

}
