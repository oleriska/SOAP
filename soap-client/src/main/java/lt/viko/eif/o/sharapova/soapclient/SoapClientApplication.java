package lt.viko.eif.o.sharapova.soapclient;

import lt.viko.eif.o.sharapova.soapclient.generated.*;

public class SoapClientApplication {

    public static void main(String[] args) {
        LibrariesPortService service = new LibrariesPortService();
        LibrariesPort port = service.getLibrariesPortSoap11();
        GetLibraryByNameRequest request = new GetLibraryByNameRequest();
        request.setName("The Canadian Library");
        GetLibraryByNameResponse response = port.getLibraryByName(request);

        Library library = response.getLibrary();

        System.out.println("Library name: " + library.getLibraryName());
        System.out.println("Books:\n" + library.getBooks().getLibraryBook());
        System.out.println("Loans:\n" + library.getLoans().getLibraryLoan());
    }
}
