package com.library.app;
import com.library.books.Library;
import com.library.staff.Librarian;
public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
        library.setLibraryName("City Central Library");
        library.setTotalBooks(12000);

        Librarian librarian = new Librarian();
        librarian.setLibrarianName("Mr. Verma");
        librarian.setYearsOfExperience(8);

        library.showLibraryDetails();
        System.out.println();
        librarian.showLibrarianInfo();
	}

}
