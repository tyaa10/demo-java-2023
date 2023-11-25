package org.tyaa.demo.java2023;

import static java.lang.System.out;

import org.tyaa.demo.java2023.models.Point;

public class Main {
    public static void main(String[] args) /* throws Exception */ {
        // System.out.println("Hello world!");
        Point p1 = new Point();
        // p1.x = -100;
        // out.println(p1.x);
        // out.println(p1.y);
        // int z;
        // out.println(z);
        try {
            p1.setX(-100);
            out.println(p1.getX());
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }
}