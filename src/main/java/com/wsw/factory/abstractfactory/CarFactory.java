package com.wsw.factory.abstractfactory;


/**
 *
 * 想要制造车辆必须先有配件  conditon engine  等零件
 *
 */
public interface CarFactory extends AbsFactory{

    BMW createBmw();


}
