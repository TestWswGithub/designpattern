package com.wsw.factory.abstractfactory;

public class BMW302Factory implements CarFactory {
    @Override
    public Engine getEngine() {
        return new _320Engine();
    }

    @Override
    public Condition getAirCondition() {
        return new _520Condition();
    }

    /**
     *
     * 每个工厂可以再使用工厂方法创建自己类型的对象
     *
     * @return
     */

    @Override
    public BMW createBmw() {

        BMW302 bmw302 = new BMW302();
        bmw302.setCondition(getAirCondition());
        bmw302.setEngine(getEngine());


        return bmw302;
    }
    private static class BMW302 extends BMW{



    }
}
