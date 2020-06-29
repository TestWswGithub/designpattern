package com.wsw.factory.factorymethod;

public class BMW320Factory implements BMWFactory {
    @Override
    public BMW createBmw() {
        return new BMW320();
    }
}
