package org.tyaa.demo.java2023.models;

public class Line implements IShape {
    public Point start;
    public Point end;

    public void goToAbsoluteStart() {
        try {
            start.setX(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        start.y = 0;
    }

    @Override
    public String toString() {
        return String.format("Line(%s,%s)", start, end);
    }
}
