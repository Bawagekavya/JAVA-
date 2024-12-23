package com.xwork.studentsapp;


public class Calendar{

    Events event[]= null;

    public Calendar(int size){

        event = new Events[size];
    }

    int index;
    public boolean addEvent(Events event){
        boolean isAdded = false;

        if(event.getEventId() >0
                && event.getWho() !=null
                && event.getEventType() != null
                && index < this.event.length)
        {
            this.event[0] = event;
            isAdded = true;
        }else
            if(index >= this.event.length){
                System.out.println("cannot add event ");
            }else
                System.out.println("Invalid event date");

            return isAdded;
    }

    public void getAllEvents(){
        for (Events event : event){
            if(event != null) {
                System.out.println(event);
            }

        }
    }
}
