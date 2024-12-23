package Runner;

import com.xwork.studentsapp.Car;

import java.util.Scanner;

public class CarRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Car car = new Car();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the car brand");
        String brand = scanner.next();
        car.setBrand(brand);

        System.out.println("enter the car speed");
        int speed = scanner.nextInt();
        car.setSpeed(speed);

        System.out.println("enter the car color");
        String color = scanner.next();
        car.setColor(color);


        System.out.println(car.toString());

        System.out.println("main ended");
    }
}
