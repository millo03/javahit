package buoi2;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -10000000;
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int c= sc.nextInt();
        int d = sc.nextInt();
        int t = Math.max(a,b) > Math.max(c,d) ? 1: 0;
        if (t ==1){
            max= a > b? a: b;
            System.out.println("Max= " + max);
        }
        else if(t == 0 && (a !=b || a != c || a != d)) {
            max = c > d ? c : d;
            System.out.println("Max= " + max);
        }else System.out.println("Không có giá trịn max");
    }
}
