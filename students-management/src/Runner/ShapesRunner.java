package Runner;

import com.xwork.studentsapp.Shapes;

import java.util.Scanner;

public class ShapesRunner {

    public static void main(String[] args) {

        System.out.println("main started");
        Shapes shapes = new Shapes();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the shape name");
        String name = scanner.next();
        shapes.setShapeName(name);

        System.out.println("enter the shape area");
        double area = scanner.nextDouble();
        shapes.setArea(area);

        System.out.println("enter the shape length");
        int length = scanner.nextInt();
        shapes.setLength(length);

        System.out.println(shapes.toString());

        System.out.println("main ended");
    }
}
