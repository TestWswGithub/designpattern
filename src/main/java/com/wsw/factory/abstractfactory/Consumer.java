package com.wsw.factory.abstractfactory;

public class Consumer {
    public static void main(String[] args) {


        BMW bmw = new BMW502Factory().createBmw();


    }
}
