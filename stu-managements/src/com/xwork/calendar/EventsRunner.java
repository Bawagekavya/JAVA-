package com.xwork.calendar;

import java.util.Scanner;

public class EventsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of events to be added");
        int size = scanner.nextInt();

        Calendar calendar = new Calendar(size);
        int i = 0;
        while (i < size){
//        for (int index = 0 ; index < size ; index++) {
            System.out.println("---------------------------");
            Events event = new Events();
            System.out.println("Enter Event Id: ");
            event.setEventId(scanner.nextInt());
            System.out.println("Enter name: ");
            event.setWho( scanner.next());// Chris
            System.out.println("Enter Event type: ");
            // Read enum input as string and convert to enum type
            event.setEventType(scanner.next().toUpperCase());; // "HOLIDAY"
            System.out.println("Enter Event start date: ");
            event.setStartDate(scanner.next());//"19-11-2024"
            System.out.println("Enter Event end date: ");
            event.setEndDate(scanner.next());//"21-11-2024"
            System.out.println("Enter Event Description: ");
            scanner.nextLine();
            event.setDescription(scanner.nextLine());//Christmas Eve celebration
            System.out.println("is it all day event: ");
            event.setAllDayEvent(scanner.nextBoolean());
            //add event to array
            calendar.addEvent(event);
            System.out.println("event added");
            i++;
        }
//        calendar.getAllEvents();

        System.out.println("------------ Search Events -------------------");
        String input = null;
        do{
            System.out.println("Press 1 to get all events");
            System.out.println("Press 2 to find all day event based on event type");
            System.out.println("Press 3 to update event start date");
            System.out.println("Enter your choice");
            int options = scanner.nextInt();
            switch (options){
                case 1: calendar.getAllEvents();
                    break;
                case 2:
                    System.out.println("Now Enter Event type to know who are on full day leave");
                    boolean allDay = calendar.getAllDayEventByEventType(scanner.next().toUpperCase());;
                    System.out.println(allDay);
                    break;

                case 3:
                    System.out.println("Enter person name to update start date:");
                    String who = scanner.next();
                    System.out.println("Enter date you want update");
                    String sDate = scanner.next();
                    calendar.updateStartDateByWho(who,sDate);
                    break;

                default:
                    System.out.println("Invalid option. Please enter a valid choice.");
                    break;
            }
            // Get user input to continue or exit
            System.out.println("Do you want to continue? (yes/no):");
            input = scanner.next(); // limited to this do only that's why we declare outside do loop
        } while (input.equalsIgnoreCase("yes"));

        System.out.println("Thanks for Using Google Calendar...");

//        System.out.println("************ Search Events ************");
//        System.out.println("________ getEventById __________");
//        calendar.getEventById(1);
//        calendar.getEventById(5);

//        System.out.println("__________ getEventByWho ________");
//        calendar.getEventByWho("Chris");
//        calendar.getEventByWho("Apoorva");
//
//        System.out.println("__________ getEventByEventType ________");
//        calendar.getEventByEventType(EventType.TRAVEL);
//
//        System.out.println("__________ getEventByStartDate ________");
//        calendar.getEventByStartDate("20-11-2024");
//        calendar.getEventByStartDate("21-11-2024");
//
//        System.out.println("__________ getEventByEndDate ________");
//        calendar.getEventByEndDate("21-11-2024");
//        calendar.getEventByEndDate("28-11-2024");
//
//        System.out.println("__________ getWhoByStartDate ________");
//        calendar.getWhoByStartDate("20-11-2024");
//
//        System.out.println("__________ getWhoByEndDate ________");
//        calendar.getWhoByEndDate("25-11-2024");
//
//        System.out.println("__________ getEventTypeById ________");
//        calendar.getEventTypeById(1);
//
//        System.out.println("__________ getAllDayEventByEventType ________");
//        calendar.getAllDayEventByEventType(EventType.BIRTHDAY);
//
//        //Update
//        System.out.println("__________ updateStartDateByWho ________");
//        calendar.updateStartDateByWho("Chris","20-11-2024");
//
//        System.out.println("__________ updateStartAndEndDateByWho ________");
//        calendar.updateStartAndEndDateByWho("Karan","22-11-2024", "28-11-2024");
//
//        //Delete
//        System.out.println("__________ deleteEventById ________");
//        calendar.deleteEventById(4);
//
//        System.out.println("************ All Events ********************");
//        calendar.getAllEvents();

    }
    }

//        System.out.println("main started");
//
//        Scanner scanner = new Scanner(System.in);  // get input at run time
//        System.out.println("Enter the no of the events ");    //size
//        int size = scanner.nextInt();
//
//        Calendar calendar = new Calendar(size);
//
//        for (int index = 0; index < size; index++) {
//            Events event = new Events();
//            System.out.println("Enter the event id");
//            event.setEventId(scanner.nextInt());
//
//            System.out.println("Enter the start date of the event");
//            event.setStartDate(scanner.next());
//
//            System.out.println("Enter the end date of the event");
////            event.setEndDate(scanner.next());
//
//            System.out.println("Enter who is going to conduct the event");
//            event.setWho(scanner.next());
//
//            System.out.println("Enter the event description");
//            event.setDescription(scanner.next());
//
//            System.out.println("Enter the event type");
//            event.setEventType(scanner.next());
//
//            System.out.println("Is all day event");
//            event.setAllDayEvent(scanner.nextBoolean());
//
//            calendar.addEvent(event);
//
//        }
//        String input = null;

//        do {
//            System.out.println("Press 1 to get the event id");
//            System.out.println("Press 2 to get the event type");
//            System.out.println("Press 3 to know who is conducting the event");
//
//            int options = scanner.nextInt();
//
//            switch (options) {
//                case 1:
//                    calendar.getAllEvents();
//                    break;
//
//                case 2:
//                    System.out.println("enter the existing person name");
//                    String who = scanner.next();
//                    break;
//
//                case 3:
//                    System.out.println("enter the new start date");
//                    String startDate = scanner.next();
//                    break;

//                default:
//                    System.out.println("please provide valid options");
//                    break;
//            }
//
//            System.out.println("Do you want to continue Yes/No");
//
//            input = scanner.next();
//
//        } while (input.equalsIgnoreCase("Yes"));
//
//        System.out.println("Thank you for your cooperation");
//
//        System.out.println("main ended");
//
//    }



