package org.tyaa.demo.java2023;

import static java.lang.System.out;

import org.tyaa.demo.java2023.actions.Math;
import org.tyaa.demo.java2023.actions.simple.ISimpleAction;
import org.tyaa.demo.java2023.actions.simple.Minus;
import org.tyaa.demo.java2023.actions.simple.Sum;
import org.tyaa.demo.java2023.models.*;

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

        /* Point p1 = new Point();
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
        } */

        // Knight k1 = new Knight();
        // k1.name = "k-1";
        /* Knight k1 = new Knight("k-1", new Axe());
        // k1.doAction();
        k1.setWeapon(new Sword());
        // k1.doAction();

        Knight k2 = new Knight("k-2", new Axe());

        List<Knight> knights = new ArrayList<>();
        knights.add(k1);
        knights.add(k2);

        for (Knight k : knights) {
            out.println(k.name);
            k.doAction();
            out.println();
        } */
        /* Point p3 = new Point();
        p3.x(200).y(300);

        Point p4 = new Point(100, 200);

        Point p5 = Point.builder().y(120).x(300);*/

        // out.println((new DemoClass()).sqr(5.0));
        // out.println((new DemoClass()).sqr(5d));
        // out.println((new DemoClass()).sqrt(25d));

        // Math.calc(2, 3);
        // out.println(Math.calc(2, 3));
        double result = Math.calc(2, 3, new Sum());
        out.println(result);

        result = Math.calc(2, 3, new Minus());
        out.println(result);

        result = Math.calc(2, 3, new ISimpleAction() {
            @Override
            public double action(double a, double b) {
                return a * b;
            }
        });
        out.println(result);

        /* result = Math.calc(2, 3, (x1, y1) -> { return x1 / y1; });
        out.println(result); */

        result = Math.calc(2, 3, (x1, y1) -> x1 / y1);
        out.println(result);

        // по образцу добавить здесь код, который будет рассчитывать длину гипотенузы
        // по длинам двух катетов и выводить результат в консоль

        out.println(java.lang.Math.max(100500, 900100));
    }
}