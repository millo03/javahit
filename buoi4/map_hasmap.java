package buoi4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class map_hasmap {
    public static void main(String[] args) {
        // khi baos Map<kiểu giá tri Key, kiểu gtri > Tên_map= new Hasmap<kiểu giá tri Key, kiểu gtri >();
        Map<Integer, String> map = new HashMap<Integer, String>();
        //thêm phần tử cho map
        map.put(1, "A");
        map.put(2,"B");
        map.put(3,"C");
        // hien  thi key
        System.out.println(map.get(2));// hiển thị ra B
        // lấy hơn tập hợp key
        Set <Integer> keySet= map.keySet();// tar về tập hợp key trong map
        for (Integer i: keySet){
            System.out.println(i +" : " + map.get(i) );
        }
        // hiển thị cách khác
        System.out.println("Hiển thị bằng Map.Entry<>");
        for (Map.Entry<Integer, String> s : map.entrySet()){
            System.out.print(s.getKey() + " : ");
            System.out.println(s.getValue());
        }
        // xóa 1 phàn tử trong map
        System.out.println("Xóa phần tử key = 1");
        map.remove(1);// xóa phần tử key = 1 trong map
        Set <Integer> keySet2= map.keySet();// tar về tập hợp key trong map
        for (Integer i: keySet2){
            System.out.println(i +" : " + map.get(i) );
        }
        // xóa all phần tử trong mảng
        System.out.println("Xóa all phần tử trong mảng");
        map.clear();


    }
}
