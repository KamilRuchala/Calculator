package com.example.kamil.calculator;

/**
 * Created by Kamil on 26.06.2016.
 */

public class CalculatorOps
{
    static class Add implements Operation
    {
        @Override
        public double DoOperation(double arg1, double arg2) {
            return arg1 + arg2;
        }
    }

    static class Sub implements Operation
    {
        @Override
        public double DoOperation(double arg1, double arg2) {
            return arg1 - arg2;
        }
    }
}
