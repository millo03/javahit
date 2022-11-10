package buoi4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        // xóa dấu cách ở đầu cuối dùng trim
        String s1= s.trim();
        System.out.println(s1);

        char []x= s1.toCharArray();
        int z= x.length;
        System.out.println("x ban dau: ");
        for(char k: x){
            System.out.print(k);
        }
        // tìm vihj trí số và xóa
        for(int i =0; i < x.length; i++){
            if(x[i] >='0' && x[i] <='9' ) {
                //System.out.println(x[i]);
                xoa(x,i,x.length);
           }
        }
        System.out.println("x sau xoa: ");
        for(char k: x){
            System.out.print(k);
        }
    }

    public  static void xoa( char[] x,int vitri, int  z){
        for(int i=vitri-1; i < z-1 ; i++){
            x[i] = x[i+1];
        }
        z = z-1;
    }
}
