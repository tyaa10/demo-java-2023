package org.tyaa.demo.java2023.models;

public class Point {
    private int x;
    public int y;

    public void setX(int x) throws Exception {
        if (x > 0)
            this.x = x;
        else throw new Exception("x must be a positive integer");
    }

    public int getX() {
        return this.x;
    }
}
