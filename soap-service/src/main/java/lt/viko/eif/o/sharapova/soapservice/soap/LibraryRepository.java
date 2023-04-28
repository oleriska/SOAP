package lt.viko.eif.o.sharapova.soapservice.soap;

import jakarta.annotation.PostConstruct;
import lt.viko.eif.o.sharapova.soapservice.soap.generated.Library;
import lt.viko.eif.o.sharapova.soapservice.soap.generated.LibraryBook;
import lt.viko.eif.o.sharapova.soapservice.soap.utils.TemplateLibraryFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.*;

/**
 * Library repository that stores a predefined {@link Library} instances and defines
 * a number of methods needed to work with these libraries.
 */
@Component
public class LibraryRepository {
    private static final Map<String, Library> libraries = new HashMap<>();

    /**
     * Adds a template Library object to Map of libraries after the bean creation of this repository.
     */
    @PostConstruct
    public void initData() {
        Library library = TemplateLibraryFactory.getTemplateLibraryInstance();
        libraries.put(library.getLibraryName(), library);
    }

    /**
     * Searches the library by specified name.
     *
     * @param name name of the library to search for
     * @return library object if it's not a null value
     */
    public Library findLibraryByName(String name) {
        Assert.notNull(name, "The library's name must not be null");
        return libraries.get(name);
    }

    /**
     * Searches for libraries that have specified book.
     *
     * @param bookName name of the book to search libraries for
     * @return list of libraries that store this book
     */
    public List<Library> findLibrariesByBook(String bookName) {
        Assert.notNull(bookName, "The book's name must not be null");
        List<Library> targetLibraries = new ArrayList<>();

        libraries.forEach((libraryName, library) -> {
            if (hasSpecifiedBook(library, bookName)) {
                targetLibraries.add(library);
            }
        });

        return targetLibraries;
    }

    /**
     * Helper method that check whether there is such a book in the cpecified library
     *
     * @param library library to check
     * @param bookName name of the book to search for
     * @return true if the library contains the specified book, false otherwise
     */
    private boolean hasSpecifiedBook(Library library, String bookName) {
        Optional<LibraryBook> targetLibrary = library.getBooks().getLibraryBook().stream().filter(book -> book.getBookTitle().equalsIgnoreCase(bookName)).findFirst();
        return targetLibrary.isPresent();
    }
}
