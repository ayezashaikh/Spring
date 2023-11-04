package com.practice.springpractice.dep.injection;

import java.lang.reflect.Field;

public class TestFieldInject {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> cl = Class.forName("com.practice.springpractice.dep.injection.Car");
        Field engine = cl.getDeclaredField("engine");
        engine.setAccessible(true);
        Object object = cl.newInstance();
        Car car = (Car) object;
        car.setEngine(new TataEngine());
        car.startCar();
    }
}
