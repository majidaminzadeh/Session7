package com.tosan.example3;

public class Session7_3 {
    public static void main(String[] args) {
        int count = 10;
        long countLong = count;
        long longCount2 = 1000000000000l;
        int intCount = (int) longCount2;
        System.out.println("intCount is "+intCount);
        System.out.println("integer Count is " + count);
        System.out.println("Long Count is " + countLong);
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        GrandChild1 grandChild1 = new GrandChild1();
        parent = child1; // upcasting
        parent.func();
        parent = child2; // upcasting
        parent = grandChild1; // upcasting
        child1 = (Child1) parent; // permitted downcasting but has exception at runtime
        child2 = (Child2) parent; // permitted downcasting but has exception at runtime
//        child1 = (Child1) child2; // not permitted casting
        child1 = grandChild1; // upcasting
        grandChild1 = (GrandChild1) child1; // permitted downcasting but has exception at runtime


        Parent parent1 = new Child1();
        Child1 child11 = (Child1) parent1; // permitted downcast without error at runtime
    }
}
