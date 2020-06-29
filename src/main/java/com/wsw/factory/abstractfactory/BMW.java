package com.wsw.factory.abstractfactory;

public abstract class BMW {


    private Engine engine;
    private Condition condition;

    public BMW() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
