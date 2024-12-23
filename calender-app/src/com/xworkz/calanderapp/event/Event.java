package com.xworkz.calanderapp.event;

import com.xworkz.calanderapp.constants.EventType;

public class Event  {
    private int eventId;
    private String Who;
    private String startDate;
    private String endDate;
    private boolean allDayEvent;
    private EventType eventType;
    private String description;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getWho() {
        return Who;
    }

    public void setWho(String who) {
        Who = who;
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

    public boolean isAllDayEvent() {
        return allDayEvent;
    }

    public void setAllDayEvent(boolean allDayEvent) {
        this.allDayEvent = allDayEvent;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event(int eventId, String who, String startDate, String endDate, boolean allDayEvent, EventType eventType, String description) {
        this.eventId = eventId;
        Who = who;
        this.startDate = startDate;
        this.endDate = endDate;
        this.allDayEvent = allDayEvent;
        this.eventType = eventType;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", Who='" + Who + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", allDayEvent=" + allDayEvent +
                ", eventType=" + eventType +
                ", description='" + description + '\'' +
                '}';
    }

    public Event() {

    }
}