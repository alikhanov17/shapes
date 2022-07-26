package com.company;

import java.util.Scanner;

import static java.lang.System.in;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("[1] circle:");
        System.out.println("[2] rectangle:");
        double a = scanner.nextDouble();
        if (a == 1) {
            System.out.println("radiusni kiriting: ");
            double r = scanner.nextInt();
            Circle circle = new Circle(r);
            circle.area();
        }
        if (a == 2) {
            System.out.println("uzunligini kiriting:");
            double length = scanner.nextDouble();
            System.out.println("boyini kiriting: ");
            double breath = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(length, breath);
            rectangle.area();
        }


    }
}