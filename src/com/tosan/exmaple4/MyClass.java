package com.tosan.exmaple4;

public class MyClass implements MyInterface{
    public void func() {

    }

    @Override
    public void func2() {
        MyInterface.super.func2();
    }
}
