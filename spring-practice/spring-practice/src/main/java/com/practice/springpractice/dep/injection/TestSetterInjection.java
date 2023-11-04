package com.practice.springpractice.dep.injection;

public class TestSetterInjection {

    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new TataEngine());

      main(args);
    }
}

class Test{

}

interface  Drive{
//    int id;
//
//     void sum(){
//         System.out.println("this is sum method");
//     }
}