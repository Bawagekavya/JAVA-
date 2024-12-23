package Runner;

import com.xwork.studentsapp.Hospital;
import javafx.scene.transform.Scale;

import java.util.Scanner;

public class HospitalRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Hospital hospital = new Hospital();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the hospital name");
        String name = scanner.next();
        hospital.setName(name);

        System.out.println("enter the no of beds");
        int beds = scanner.nextInt();
        hospital.setBeds(beds);

        System.out.println("enter the no of  doctors");
        int address = scanner.nextInt();
        hospital.setDoctors(address);

        System.out.println(hospital.toString());

        System.out.println("main ended");
    }
}
