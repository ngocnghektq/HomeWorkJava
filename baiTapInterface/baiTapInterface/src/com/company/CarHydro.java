package com.company;

public class CarHydro implements Car, AutoDriver {
    @Override
    public void cheDo() {
        System.out.println("chế độ tự lái");
    }

    @Override
    public void dongCo() {
        System.out.println("động cơ hydro");
    }
}
