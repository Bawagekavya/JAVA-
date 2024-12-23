package Runner;

import com.xwork.studentsapp.Library;

import java.util.Scanner;

public class LibraryRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Library library = new Library();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the library name ");
        String name = scanner.next();
        library.setName(name);

        System.out.println("enter the no of books");
        int books = scanner.nextInt();
        library.setBooks(books);

        System.out.println("enter the library address ");
        String address = scanner.next();
        library.setAddress(address);

        System.out.println(library.toString());

        System.out.println("main ended");
    }
}
