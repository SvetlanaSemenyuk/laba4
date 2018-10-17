package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] m = {9, 3, 2, 1, 5, 7, -9, -8, 6, 4, 5, 1, -5, -11, 4, 15, -16, 11, -5, -7, -9, -1, 3, 20, 21, 25, 30};
        for (int i = 0; i < m.length; i++) {
            int num = m[i];
            for (int j = i - 1; j >= 0; j--) {
                int leftNumber = m[j];
                if (num < leftNumber) {
                    m[j + 1] = leftNumber;
                    m[j] = num;
                } else {
                    break;
                }
            }

        }
        for (Integer n : m) {
            System.out.println(n + ",");
        }
    }
}