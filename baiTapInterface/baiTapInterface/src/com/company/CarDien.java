package com.company;

public class CarDien implements Car,AutoDriver{
    @Override
    public void cheDo() {
        System.out.println("chế đội tự lái");
    }

    @Override
    public void dongCo() {
        System.out.println("động cơ điện");
    }
}
