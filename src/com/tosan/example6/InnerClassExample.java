package com.tosan.example6;

public class InnerClassExample {
    private String title;
    private StaticClass staticClass;
    private NonStaticClass nonStaticClass;

    public String getTitle() {
        return title;
    }

    public static void print(){
        Person person = new PersonNew(){
            public void print(){
                System.out.println("inner method print");
            }
            public void print1(){

            }
        };
        person.print();
    }

    public static class StaticClass{
        public void print(){
            System.out.println("Inner static Class");
        }
    }
    public class NonStaticClass{
        public void print(){
            System.out.println("Inner non static Class");
        }
    }
}
