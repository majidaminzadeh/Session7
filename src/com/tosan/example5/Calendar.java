package com.tosan.example5;

public class Calendar {
    private DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }
}
