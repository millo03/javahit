package buoi3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []a= new int[n];
        for(int i=0; i < n; i++){
            a[i]= sc.nextInt();
        }
        for(int i=0; i < 10; i++){
            int dem=0;
            for (int x: a) {
                if(i == x ) {
                    dem++;
                 }
            }
            if(dem != 0) {
                System.out.println( i + " : " + dem);
            }
        }

    }
}
