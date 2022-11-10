package buoi4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // dịnh dang làm tròn đén dố thứ 3
        DecimalFormat df= new DecimalFormat("#.###");// lưu ý giữa # dấu chấm
        Scanner sc= new Scanner(System.in);
        String chuoi = sc.nextLine();
        char[] a = chuoi.toCharArray();
        int dem=0, sum=0;
        for(int i=0; i< a.length; i++){
            if('0' <= a[i] && '9' >= a[i] ){
                sum += (a[i]-'0');
                dem++;
            }
        }
        if(dem == 0) System.out.println("False");
        else System.out.println("True\n "+ df.format( 1.0*sum/dem));
    }
}
