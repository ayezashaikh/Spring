package com.practice.springpractice.dep.injection;

public class TestConstructorInjection {

    public static void main(String[] args) {
        IEngine engine = new TataEngine();
        Car car = new Car(engine);
        car.startCar();

    }
}
