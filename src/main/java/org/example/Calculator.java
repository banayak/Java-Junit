package org.example;

public class Calculator {
    static double add(int val1, int val2) {
        /*return DoubleStream.of(operands).sum();*/
        return val1 + val2;
    }

    static double multiply(int val1, int val2) {
        return val1 * val2;
    }

    public static void main(String[] args) {
        int n =10;
        int sum =0;
        for (int i=0 ;i< n ; i++ ){
            for (int j=0 ; j < n ; j++){
                sum = sum+ j;
            }
        }
    }
}


