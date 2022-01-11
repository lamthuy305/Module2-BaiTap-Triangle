package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        Triangle triangle1 = new Triangle(5,3,4);
//        System.out.println(triangle1);
//        System.out.println(triangle1.getPerimeter());
//        System.out.println(triangle1.getArea());


        System.out.println("Nhập tam giác mới cần tính: ");
        System.out.print("Độ dài cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Độ dài cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Độ dài cạnh 3: ");
        double side3 = scanner.nextDouble();
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            System.out.println("Đây ko phải số đo 3 cạnh của 1 tam giác");
        } else {
            Triangle triangle2 = new Triangle(side1, side2, side3);
            triangle2.setColor("red");
            System.out.println(triangle2);
            System.out.println(triangle2.getPerimeter());
            System.out.println(triangle2.getArea());
        }
    }
}
