package org.tyaa.demo.java2023.models;

public class Point implements IShape {
    private int x;
    public int y;

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

    @Override
    public String toString() {
        return String.format("Point(%s,%s)", x, y);
    }
}
