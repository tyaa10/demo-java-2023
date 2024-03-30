package org.tyaa.demo.java2023.actions.simple;

public class Sum implements ISimpleAction {
    @Override
    public double action(double a, double b) {
        return a + b;
    }
}
