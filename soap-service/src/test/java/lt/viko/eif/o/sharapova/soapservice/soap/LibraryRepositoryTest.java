package lt.viko.eif.o.sharapova.soapservice.soap;

import lt.viko.eif.o.sharapova.soapservice.soap.generated.Library;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryRepositoryTest {

    static LibraryRepository libraryRepository = new LibraryRepository();

    @BeforeAll
    static void initDataInRepository() {
        libraryRepository.initData();
    }

    @Test
    void returnsCanadianLibraryWhenSearchingByName() {
        Library library = libraryRepository.findLibraryByName("The Canadian Library");
        assertEquals("The Canadian Library", library.getLibraryName());
    }

    @Test
    void throwsExceptionIfLibraryNameIsNull() {
        try {
            libraryRepository.findLibraryByName(null);
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "The library's name must not be null");
        }
    }

    @Test
    void returnsOneLibraryWhenSearchingByBookName() {
        List<Library> libraries = libraryRepository.findLibrariesByBook("Atomic Habits");
        assertEquals(1, libraries.size());
    }
}