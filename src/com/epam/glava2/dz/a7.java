package com.epam.glava2.dz;


//Найти число, состоящее только из различных цифр.
// Если таких чисел несколько, найти первое из них.

public class a7 {
    public static void main(String[] args) {
        int n1 = 1000;
        int n2 = n1 * 10 - 1;

        for (int i = n1; i < n2; i++) {
            if (isUnique(String.valueOf(i))) {
                System.out.println(i);
            }
        }
    }

    private static boolean isUnique(String st) {
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j))
                    return false;
            }
        }
        return true;
    }
}
