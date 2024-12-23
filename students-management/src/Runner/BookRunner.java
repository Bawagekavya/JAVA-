package Runner;

import com.xwork.studentsapp.Book;

import java.util.Scanner;

public class BookRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Book book = new Book();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the book name");
        String name = scanner.next();
        book.setName(name);

        System.out.println("Enter the book price");
        int price = scanner.nextInt();
        book.setPrice(price);

        System.out.println("Enter the book author");
        String author = scanner.next();
        book.setauthor(author);

        System.out.println(book.toString());

        System.out.println("main ended");
    }
}
