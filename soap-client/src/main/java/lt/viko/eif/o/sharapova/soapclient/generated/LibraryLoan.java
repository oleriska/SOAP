
package lt.viko.eif.o.sharapova.soapclient.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Library_Loan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Library_Loan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Loan_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Loan_Student_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Loan_Book_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Loan_From" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Loan_To" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Library_Loan", propOrder = {
    "loanID",
    "loanStudentID",
    "loanBookID",
    "loanFrom",
    "loanTo"
})
public class LibraryLoan {

    @XmlElement(name = "Loan_ID")
    protected int loanID;
    @XmlElement(name = "Loan_Student_ID")
    protected int loanStudentID;
    @XmlElement(name = "Loan_Book_ID")
    protected int loanBookID;
    @XmlElement(name = "Loan_From", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loanFrom;
    @XmlElement(name = "Loan_To", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loanTo;

    /**
     * Gets the value of the loanID property.
     * 
     */
    public int getLoanID() {
        return loanID;
    }

    /**
     * Sets the value of the loanID property.
     * 
     */
    public void setLoanID(int value) {
        this.loanID = value;
    }

    /**
     * Gets the value of the loanStudentID property.
     * 
     */
    public int getLoanStudentID() {
        return loanStudentID;
    }

    /**
     * Sets the value of the loanStudentID property.
     * 
     */
    public void setLoanStudentID(int value) {
        this.loanStudentID = value;
    }

    /**
     * Gets the value of the loanBookID property.
     * 
     */
    public int getLoanBookID() {
        return loanBookID;
    }

    /**
     * Sets the value of the loanBookID property.
     * 
     */
    public void setLoanBookID(int value) {
        this.loanBookID = value;
    }

    /**
     * Gets the value of the loanFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanFrom() {
        return loanFrom;
    }

    /**
     * Sets the value of the loanFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanFrom(XMLGregorianCalendar value) {
        this.loanFrom = value;
    }

    /**
     * Gets the value of the loanTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanTo() {
        return loanTo;
    }

    /**
     * Sets the value of the loanTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanTo(XMLGregorianCalendar value) {
        this.loanTo = value;
    }

    @Override
    public String toString() {
        return "LibraryLoan{" +
                "loanID=" + loanID +
                ", loanStudentID=" + loanStudentID +
                ", loanBookID=" + loanBookID +
                ", loanFrom=" + loanFrom +
                ", loanTo=" + loanTo +
                '}';
    }
}
