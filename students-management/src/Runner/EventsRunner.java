package Runner;

import  com.xwork.studentsapp.Calendar;
import com.xwork.studentsapp.Events;
import java.util.Scanner;

public class EventsRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Scanner scanner = new Scanner(System.in);  // get input at run time
        System.out.println("Enter the no of the events ");    //size
        int size = scanner.nextInt();

        Calendar calendar = new Calendar(size);

        for (int index = 0; index < size; index++) {
            Events event = new Events();
            System.out.println("Enter the event id");
            event.setEventId(scanner.nextInt());

            System.out.println("Enter the start date of the event");
            event.setStartDate(scanner.next());

            System.out.println("Enter the end date of the event");
            event.setEndDate(scanner.next());

            System.out.println("Enter who is going to conduct the event");
            event.setWho(scanner.next());

            System.out.println("Enter the event description");
            event.setDescription(scanner.next());

            System.out.println("Enter the event type");
            event.setEventType(scanner.next());

            System.out.println("Is all day event");
            event.setAllDayEvent(scanner.nextBoolean());

            calendar.addEvent(event);

        }
        String input = null;

        do {
            System.out.println("Press 1 to get the event id");
            System.out.println("Press 2 to get the event type");
            System.out.println("Press 3 to know who is conducting the event");

            int options = scanner.nextInt();

            switch (options) {
                case 1:
                    calendar.getAllEvents();
                    break;

                case 2:
                    System.out.println("enter the existing person name");
                    String who = scanner.next();
                    break;

                case 3:
                    System.out.println("enter the new start date");
                    String startDate = scanner.next();
                    break;

                default:
                    System.out.println("please provide valid options");
                    break;
            }

            System.out.println("Do you want to continue Yes/No");

            input = scanner.next();

        } while (input.equalsIgnoreCase("Yes"));

        System.out.println("Thank you for your cooperation");

        System.out.println("main ended");

    }
}



