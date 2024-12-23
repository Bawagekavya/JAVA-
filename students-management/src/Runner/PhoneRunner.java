package Runner;

import com.xwork.studentsapp.Phone;

import java.util.Scanner;

public class PhoneRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Phone phone = new Phone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the phone brand");
        String brand = scanner.next();
        phone.setBrand(brand);

        System.out.println("enter the phone price");
        double price = scanner.nextDouble();
        phone.setPrice(price);


        System.out.println("enter the phone storage");
        int storage = scanner.nextInt();
        phone.setStorage(storage);

        System.out.println(phone.toString());

        System.out.println("main ended");
    }
}
