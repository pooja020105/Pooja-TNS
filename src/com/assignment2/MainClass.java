package com.assignment2;

import java.util.Scanner;

class Circle {
    double radius;
    String colour;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter colour: ");
        colour = sc.nextLine();
    }

    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
