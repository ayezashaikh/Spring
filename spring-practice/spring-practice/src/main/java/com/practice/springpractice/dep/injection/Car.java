package com.practice.springpractice.dep.injection;

public class Car {

    private IEngine engine;


    public Car(){

    }

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void startCar(){
        System.out.println("Car is started");
        engine.start();
    }
}
