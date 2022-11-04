package buoi2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[50];
        int i=0, k = 0;
        while ( n > 0){
            a[i] = n % 10;
            i++;
            n = n/10;
        }
        for (int j =0; j< i; j ++){
            if(soChinhPhuong(a[j]) !=0){
                System.out.println( a[j]+ "  ");
                k=1;
            }
        }
        if(k==0) System.out.println("no");
    }
        public static int soChinhPhuong(int n){
        double t= Math.sqrt(n);
             if (Math.sqrt(n) == Math.round(t)){
                 return n;
             }else return 0;
        }
}
