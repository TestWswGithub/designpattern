package com.wsw.factory.simplefactory;

public class Factory {


    public BMW createBmw(int type){

        if (type==520) return new BMW520();
        if (type==320) return new BMW320();
        return null;
    }

    /**
     *
     * 此为简单工厂
     *
     * 如果此时新生产了型号为1000的宝马车，则需要修改createBmw方法，不符合开闭原则。
     *
     * 因此进一步普遍化为工厂方法。
     *
     *
     * @param args
     */
    public static void main(String[] args) {


        new Factory().createBmw(320);

    }


}
