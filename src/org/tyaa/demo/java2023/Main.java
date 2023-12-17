package org.tyaa.demo.java2023;

import static java.lang.System.out;

import org.tyaa.demo.java2023.models.IShape;
import org.tyaa.demo.java2023.models.Line;
import org.tyaa.demo.java2023.models.Point;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception /* throws Exception */ {
        // System.out.println("Hello world!");
        // Point p1 = new Point();
        // p1.x = -100;
        // out.println(p1.x);
        // out.println(p1.y);
        // int z;
        // out.println(z);
        /* try {
            p1.setX(-100);
            out.println(p1.getX());
        } catch (Exception e) {
            out.println(e.getMessage());
        } */

        /* 2 */

        Point p1 = new Point();
        p1.setX(100);
        p1.y = 100;

        Point p2 = new Point();
        p2.setX(200);
        p2.y = 300;

        Line l1 = new Line();
        l1.start = p1;
        l1.end = p2;

        // out.println(l1);

        List<IShape> shapes = new ArrayList<>();
        shapes.add(p1);
        shapes.add(l1);
        for (IShape shape : shapes) {
            shape.goToAbsoluteStart();
            out.println(shape);
        }
    }
}