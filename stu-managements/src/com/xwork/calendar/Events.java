package com.xwork.calendar;


public class Events {

    private int eventId;
    private String startDate;
    private String endDate;
    private String who;
    private String description;
    private EventType eventType;
    private boolean allDayEvent;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public boolean isAllDayEvent() {
        return allDayEvent;
    }

    public void setAllDayEvent(boolean allDayEvent) {
        this.allDayEvent = allDayEvent;
    }



    @Override
    public String toString() {
        return "Events{" +
                "eventId=" + eventId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", who='" + who + '\'' +
                ", description='" + description + '\'' +
                ", eventType=" + eventType +
                ", allDayEvent=" + allDayEvent +
                '}';
    }
}


