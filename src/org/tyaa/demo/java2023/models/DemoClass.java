package org.tyaa.demo.java2023.models;

public class DemoClass {
    public double sqr(double x) {
        return x * x;
    }
    public double sqrt(double x) {
        // validateSqrtArgument(x);
        Validators.validateSqrtArgument(x);
        return Math.sqrt(x);
    }

    /* private void validateSqrtArgument(double x) {
        if (x < 0) {
            throw new ArithmeticException("an argument must be a positive number or zero");
        }
    } */
    private static class Validators {
        public static void validateSqrtArgument(double x) {
            if (x < 0) {
                throw new ArithmeticException("an argument must be a positive number or zero");
            }
        }
    }
}
