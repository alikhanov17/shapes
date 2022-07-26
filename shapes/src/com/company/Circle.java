package com.company;

public class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println(r * r * 3.14);
    }
}
