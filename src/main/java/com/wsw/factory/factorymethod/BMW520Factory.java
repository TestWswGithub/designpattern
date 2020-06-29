package com.wsw.factory.factorymethod;

public class BMW520Factory implements BMWFactory {
    @Override
    public BMW createBmw() {
        return new BMW520();
    }
}
