package buoi4;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name1 = (sc.nextLine()).toLowerCase(Locale.ROOT);

        String name2 = (sc.nextLine()).toLowerCase(Locale.ROOT);
        String[] n1= name1.split(" ");
        String[] n2= name2.split(" ");
        int max=0;
        for(String x :n1){
            for (String y : n2){
                if(x.equals(y)){
                    if(max <= y.length())max= y.length();
                }
            }
        }
        System.out.println(max);
    }
}
