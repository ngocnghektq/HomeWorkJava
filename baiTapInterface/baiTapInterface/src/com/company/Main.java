package com.company;

public class Main {

    public static void main(String[] args) {
        CarXang vinfastXang = new CarXang();
        vinfastXang.dongCo();
        vinfastXang.cheDoLai();
        System.out.println("--------");
        CarDien vinfastDien = new CarDien();
        vinfastDien.dongCo();
        vinfastDien.cheDo();
        System.out.println("--------");
        CarDiesel vinfastDiesel = new CarDiesel();
        vinfastDiesel.dongCo();
        vinfastDiesel.cheDoLai();
        System.out.println("--------");
        CarHydro vinfastHydro = new CarHydro();
        vinfastHydro.dongCo();
        vinfastHydro.cheDo();
    }
}
