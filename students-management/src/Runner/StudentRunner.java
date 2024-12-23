package Runner;

import com.xwork.studentsapp.Student;

import java.util.Scanner;

public class StudentRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Student student = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name");
        String name = scanner.next();
        student.setName(name);

        System.out.println("enter the student age");
        int age = scanner.nextInt();
        student.setAge(age);

        System.out.println("enter the student roll no");
        double rollno = scanner.nextDouble();
        student.setRollNo(rollno);

        System.out.println(student.toString());

        System.out.println("main ended");
    }
}
