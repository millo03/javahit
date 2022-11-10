package buoi4;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        char []a = (name.toLowerCase(Locale.ROOT)).toCharArray();
        Map<Character, Integer> mp= new HashMap<Character, Integer>();
        for (char x : a){
            Integer dem =0;
            for ( int i =0; i < a.length; i++) {
                if (x == a[i]) {
                    dem++;
                }
            }
            mp.put(x,dem);
        }
        for (Map.Entry<Character, Integer> s: mp.entrySet()){
            if(s.getKey() !=' ') {
                System.out.print(s.getKey() + " : ");
                System.out.println(s.getValue());
            }
        }
    }

}

