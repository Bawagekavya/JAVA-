package Runner;

import com.xwork.studentsapp.University;
import javafx.scene.transform.Scale;

import java.util.Scanner;

public class UniversityRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        University university = new University();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the university name");
        String name = scanner.next();
        university.setName(name);

        System.out.println("enter the no of students");
        int students = scanner.nextInt();
        university.setStudents(students);

        System.out.println("enter the university address");
        String address = scanner.next();
        university.setAddress(address);

        System.out.println(university.toString());

        System.out.println("main ended");

    }
}
