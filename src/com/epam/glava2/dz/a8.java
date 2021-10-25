package com.epam.glava2.dz;

// Среди чисел найти число-палиндром.
// Если таких чисел больше одного, найти второе.

public class a8 {
    public static void main(String[] args) {
        int n1 = 1000;
        int n2 = n1 * 10 - 1;

        for (int i = n1; i < n2; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        if (number == reverseInt(number)) {
            return true;
        } else {
            return false;
        }
    }

    public static int reverseInt(int number) {
        int reverseInt = 0;

        while (number != 0) {
            reverseInt = reverseInt * 10 + number % 10;
            number /= 10;
        }
        return reverseInt;
    }
}
