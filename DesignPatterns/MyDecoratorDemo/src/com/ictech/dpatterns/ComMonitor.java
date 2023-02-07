package com.ictech.dpatterns;

public class ComMonitor extends ComputerDecorator{

    Computer comMonitor;
    public ComMonitor(Computer com) {
        comMonitor = com;
    }

    @Override
    public String description() {
        return comMonitor.description()+" And A Monitor";
    }
}
