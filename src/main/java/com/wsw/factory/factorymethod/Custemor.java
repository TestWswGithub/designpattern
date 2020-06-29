package com.wsw.factory.factorymethod;

public class Custemor {


    public static void main(String[] args) {

        BMWFactory factory = new BMW520Factory();

        BMW bmw = factory.createBmw();
    }
}
