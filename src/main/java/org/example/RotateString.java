package org.example;

public class RotateString {

    private static int counter = 0;

    public static void main(String[] args) {

        System.out.println(rotateString("abcde", "eabcd")); // true
        counter =0;
        System.out.println(rotateString("mightandmagic", "andmagicmigth")); // false
    }

    private static boolean rotateString(String inputString, String goal) {
        if (inputString.length() != goal.length()) {
            return false;
        }
        if (inputString.isEmpty()) { // Empty strings are considered rotations of each other
            return false;
        }
        return rotateStringRecursive(inputString, goal, 0);
    }

    private static boolean rotateStringRecursive(String input, String goal, int k) {
        System.out.println("Step "+counter++ +" input String ::"+input);
        if (input.equals(goal)) { // abcde ,cdeab || mightandmagic,andmagicmigth
            return true;
        }
        if (k == input.length()) {
            System.out.println("Here ..");
            return false;
        }

        // step 1 : bcdea
        //step 2: cdeab
        return rotateStringRecursive(input.substring(1) + input.charAt(0)/*input.substring(0,2)*/, goal, k + 1);
    }

}
