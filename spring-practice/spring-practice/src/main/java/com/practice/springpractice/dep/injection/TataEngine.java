package com.practice.springpractice.dep.injection;

public class TataEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Engine is started is started");
    }
}
