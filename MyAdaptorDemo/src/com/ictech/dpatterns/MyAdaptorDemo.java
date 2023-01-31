package com.ictech.dpatterns;

public class MyAdaptorDemo {
    public static void main(String[] args) {

//        SimpleNameClass sn = new SimpleNameClass();
//        sn.setname("Niraj Dilshan");
//        System.out.println("Name : " + sn.getname());

//        ComplexNameClass cn = new ComplexNameClass();
//        cn.setfname("Niraj");
//        cn.setlname("Dlshan");
//        System.out.println("Name : " + cn.getfname() + " " + cn.getlname());

        SimpleNameClass sn = new SimpleNameClass();
        sn.setname("Niraj Dilshan");

        SimpleToComplexAdaptor scAdaptor = new SimpleToComplexAdaptor(sn);

        System.out.println("First Name : "+ scAdaptor.getfname());
        System.out.println("last Name : "+ scAdaptor.getlname());

    }
}
