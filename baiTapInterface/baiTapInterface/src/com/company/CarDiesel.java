package com.company;

public class CarDiesel implements Car, ManualDriver {
    @Override
    public void dongCo() {
        System.out.println("động cơ Diesel");
    }

    @Override
    public void cheDoLai() {
        System.out.println("chế độ người lái");
    }
}
