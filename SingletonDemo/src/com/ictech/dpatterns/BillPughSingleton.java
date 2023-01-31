package com.ictech.dpatterns;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    private static class Helper{
        private static final BillPughSingleton bsp = new BillPughSingleton();

    }

    public static BillPughSingleton getBillPughSingleton(){
        return Helper.bsp;
    }
}
