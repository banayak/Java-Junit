package org.example;

public class RotateStringExample {
    static int  counter = 0;
    public static void main(String[] args) {
        String inputString1 = "mightandmagic";
        int k = 2;
        String rotatedString = rotateString(inputString1, k);
        System.out.println(rotatedString);
        String expectedOutput = "andmagicmigth";
        System.out.println("Counter times::"+counter);
        System.out.println(rotatedString.equals(expectedOutput));
    }

    public static String rotateString(String str, int k) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        counter++;
        k = k % str.length(); // Normalize k to handle rotations greater than string length
        String leftPart = str.substring(k);
        String rightPart = str.substring(0, k);
        return leftPart + rightPart;
    }

}
