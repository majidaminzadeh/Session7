package com.tosan.exmaple4;

public interface MyInterface {
    String title = "";
    void func();
    default void func2(){
        System.out.println("");
    }

    static void staticFunc(){
        System.out.println("Static method");
    }
}
