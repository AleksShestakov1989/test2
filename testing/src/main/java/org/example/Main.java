package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] temp = new int[3];
        temp[0] = 10;
        temp[1] = 15;
        temp[2] = 20;

        int sum = 0;
        for (int tt:temp
        ) {
            sum+=tt;
        }
        System.out.println(sum);

    }
}