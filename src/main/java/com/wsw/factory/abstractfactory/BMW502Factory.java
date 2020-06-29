package com.wsw.factory.abstractfactory;

public class BMW502Factory implements CarFactory {
    @Override
    public Engine getEngine() {
        return new _520Engine();
    }

    @Override
    public Condition getAirCondition() {
        return new _520Condition();
    }


    @Override
    public BMW createBmw() {
        BMW502 bmw502 = new BMW502();
        bmw502.setCondition(getAirCondition());
        bmw502.setEngine(getEngine());
        return bmw502;
    }
    private static class BMW502 extends BMW{



    }
}
