package org.tyaa.demo.java2023.actions;

import org.tyaa.demo.java2023.actions.simple.ISimpleAction;

public class Math {
    public static double calc(double x, double y, ISimpleAction simpleAction) {
        System.out.print("Calculation... ");
        return simpleAction.action(x, y);
    }
}
