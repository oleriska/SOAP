package lt.viko.eif.o.sharapova.soapservice.soap.utils;

import lt.viko.eif.o.sharapova.soapservice.soap.generated.*;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import java.util.List;

/**
 * Factory intended to produce a predefined template {@link Library} object.
 */
public class TemplateLibraryFactory {

    /**
     * Produces a template {@link Library} object.
     *
     * @return {@link Library} object
     */
    public static Library getTemplateLibraryInstance() {

        Library library = new Library();
        Books books = new Books();
        Loans loans = new Loans();

        List<LibraryBook> listOfBooks = books.getLibraryBook();
        List<LibraryLoan> listOfLoans = loans.getLibraryLoan();

        listOfBooks.addAll(0, List.of(new LibraryBook(1, 1, "Java Core | Volume 1", 9,
                DatatypeFactory.newDefaultInstance().newXMLGregorianCalendarDate(2016, 2, 10, DatatypeConstants.FIELD_UNDEFINED)),
                new LibraryBook(2, 1, "Java Core | Volume 2", 9,
                        DatatypeFactory.newDefaultInstance().newXMLGregorianCalendarDate(2017, 3, 7, DatatypeConstants.FIELD_UNDEFINED)),
                new LibraryBook(3, 2, "Atomic Habits", 3,
                        DatatypeFactory.newDefaultInstance().newXMLGregorianCalendarDate(2018, 7, 7, DatatypeConstants.FIELD_UNDEFINED)),
                new LibraryBook(4, 3, "Thinking, Fast and Slow", 2,
                        DatatypeFactory.newDefaultInstance().newXMLGregorianCalendarDate(2022, 2, 10, DatatypeConstants.FIELD_UNDEFINED))));

        listOfLoans.addAll(0, List.of(new LibraryLoan(1, 2, 1,
                DatatypeFactory.newDefaultInstance().newXMLGregorianCalendarDate(2023, 3, 3, DatatypeConstants.FIELD_UNDEFINED),
                DatatypeFactory.newDefaultInstance().newXMLGregorianCalendarDate(2023, 3, 10, DatatypeConstants.FIELD_UNDEFINED)),
                new LibraryLoan(2, 3, 4,
                        DatatypeFactory.newDefaultInstance().newXMLGregorianCalendarDate(2023, 3, 10, DatatypeConstants.FIELD_UNDEFINED),
                        DatatypeFactory.newDefaultInstance().newXMLGregorianCalendarDate(2023, 3, 12, DatatypeConstants.FIELD_UNDEFINED))));

        library.setLibraryName("The Canadian Library");
        library.setBooks(books);
        library.setLoans(loans);

        return library;
    }
}
