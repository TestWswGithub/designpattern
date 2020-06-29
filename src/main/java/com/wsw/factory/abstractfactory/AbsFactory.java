package com.wsw.factory.abstractfactory;


/**
 *
 * 想要制造车辆必须先实现此接口(先生产零件)
 *
 *
 */
public interface AbsFactory {

    Engine getEngine();
    Condition getAirCondition();

}
