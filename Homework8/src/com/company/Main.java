package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inHinhTamGiac();
        bai10();
    }


    static void inHinhTamGiac() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Nhập n: ");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            print(i, n);
        }
    }

    static void print(int n, int height) {
        int space = height - n;
        printChar(space, " ");
        printChar(n, "* ");
        System.out.println("\n");
    }

    static void printChar(int n, String ch) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }

    static void bai10() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hight: ");
        int hight = scanner.nextInt();
        System.out.println("nhập width: ");
        int width = scanner.nextInt();
        while ((hight < 0) || (width < 0)) {
            System.out.println("Nhập hight: ");
            hight = scanner.nextInt();
            System.out.println("nhập width: ");
            width = scanner.nextInt();

        }
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
