package buoi3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []a = new int[n];
        for (int i=0; i< n; i++){
            a[i]= sc.nextInt();
        }
        for(int i = 0; i < n; i++){
                System.out.println(ngto(a[i])+ " ");
        }
    }
    public static int ngto(int n){
        double k = Math.sqrt(n);
        for(int i=2; i <= Math.round(k); i++){
            if( n % i == 0) return 0;
        }
        if(n< 2) return 0;
        return n;
    }
}
