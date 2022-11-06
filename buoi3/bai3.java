package buoi3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[n - 1], min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] != min) {
                System.out.println(min + "  ");
                i--;
            } else if (min >= max) break;
            min++;
        }
    }
}

