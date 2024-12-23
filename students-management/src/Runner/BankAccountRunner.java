package Runner;

import com.xwork.studentsapp.BankAccount;

import java.util.Scanner;

public class BankAccountRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();
        System.out.println("Enter the bank name");
        String name = scanner.next();
        bankAccount.setBankName(name);

        System.out.println("enter the bank balance");
        double balance = scanner.nextDouble();
        bankAccount.setBalance(balance);

        System.out.println("enter the bank address");
        String address = scanner.next();
        bankAccount.setAddress(address);

        System.out.println(bankAccount.toString());

        System.out.println("main ended");
    }
}
