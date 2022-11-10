package buoi4;

import java.util.HashSet;
import java.util.Set;

public class hashset_cat_chuoi_split {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        // Thêm phần tử vào sét
        // săp sếp các thứ tự, ko thể dùng for, được lưu 1 lần
        set.add("B");
        set.add("a");
        set.add("d");
        set.add("e");
        set.add("j");
        // hiên thị
        for(String a: set){
            System.out.println(a);
        }
        // có xóa
        set.remove("A");
        set.clear();// xóa toàn bộ


        // cắt chuỗi

        String n1 = "aaaa bb ccc dddd eeee";
        String[] n2= n1.split(" ");
        for(String x: n2){
            System.out.println(x);
        }
    }
}
