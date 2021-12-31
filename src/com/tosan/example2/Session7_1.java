package com.tosan.example2;

public class Session7_1 {
    public static void main(String[] args) {
        Calendar calendar = new ShamsiCalendar();
        doSomething(calendar);
    }

    private static void doSomething(Calendar calendar) {
        calendar.getDay();
        calendar.getMonth();
    }
}
