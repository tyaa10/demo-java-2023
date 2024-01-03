package org.tyaa.demo.java2023.models;

public class Point implements IShape {
    private int x;
    public int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) throws Exception {
        if (x >= 0)
            this.x = x;
        else throw new Exception("x must be a positive integer");
    }

    public int getX() {
        return this.x;
    }

    public void goToAbsoluteStart() {
        x = 0;
        y = 0;
    }

    public Point x(int x) throws Exception {
        if (x >= 0)
            this.x = x;
        else throw new Exception("x must be a positive integer");
        return this;
    }

    public Point y(int y) throws Exception {
        if (y >= 0)
            this.y = y;
        else throw new Exception("y must be a positive integer");
        return this;
    }

    public static Point builder() {
        return new Point();
    }

    @Override
    public String toString() {
        return String.format("Point(%s,%s)", x, y);
    }
}
