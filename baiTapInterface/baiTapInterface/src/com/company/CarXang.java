package com.company;

public class CarXang implements Car, ManualDriver {


    @Override
    public void dongCo() {
        System.out.println("động cơ xăng");
    }

    @Override
    public void cheDoLai() {
        System.out.println("chế độ người lái");
    }
}
