package buoi3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0; i< n; i++){
            a[i] = sc.nextInt();
        }
        // sap laij cho mag tanng dan
        for(int i=0; i< n-1; i++){
            sap(a[i],a[i+1]);
        }
        int k = 0;
        for(int i=0; i< n-1; i++){
            int d = a[i+1]- a[i];
            if(d > 1) {
                for( int j=1; j < d; j++){
                    a[i]=a[i]+ 1;
                    System.out.print(a[i] +"  ");
                    k=1;
                }
            }
        }
        if (k == 0) System.out.println("Yes");
    }
    public static void sap(int a, int b){
        if(a > b) {
            int temp= a;
            a = b;
            b = temp;
        }
    }
}
