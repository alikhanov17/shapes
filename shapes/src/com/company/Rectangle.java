package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println(length*breadth);
    }



}
