package buoi4;

import com.sun.jdi.Value;

import java.util.Locale;
import java.util.Scanner;

public class ly_thuyet_Math_string {
    public static void main(String[] args) {
        double E = Math.E;
        System.out.println(E);

        String name="Nguyen1 van1 a";
        //String name1 = new String("Ng");
        //cach tim hieu lop string name. nó hiện ra các phương thức để tìm hiểu
        // hiển thi
        // phương thức charAt hiển thi ra chứ N chữ đầu tiên trong string name
        System.out.println(name.charAt(0));
        // indexOf
        System.out.println(name.indexOf( "1"));// in ra chỉ số đầu tiên xuất hiện ở trong chuôi 6
        //lastIndexOf
        System.out.println(name.lastIndexOf("1")); //in ra 11

        // chuyển chuỗi thành chữ hoa
        System.out.println(name.toUpperCase(Locale.ROOT));
        // viet thương
        System.out.println(name.toUpperCase(Locale.ROOT));
        //subString
        String str3="    hello Mọi Người";
        // có 1 index lấy từ index đến hết
        System.out.println(str3.substring(6));
        //lấy từ chỉ số sổ 6 đến giá trị index sau, các giá trị index có thể thay đổi
        System.out.println(str3.substring(6, 9));
        //trim: trả về giá trị ko dấu cách ở đầu và cuối
        System.out.println(str3.trim());// ko thay đoi đôi tương bạn đầu chỉ có td vs cau lẹnh mẹ
        System.out.println(str3);
        //
        String str4="hello , hello , hell";
        System.out.println(str4.replace("hello","hi"));// gtri đầu là gtri muon thay dổi, gtr sau là gtri muon đổi
        System.out.println(str4);// replace ko thay đổi trực tiếp giá trị
        //muốn thay dổi gtr str4 thì cần 1 biến str 5 hứng giá trị str4.replace;
        // so sánh copareTo: phân biệt hoa thường
        String name3= "Nguyen A";
        String name4= "nguyen a";
        // compareToIgnoreCase: sô sánh bỏ qua hoa thường
        // khi đó name3 = mame4;
    }
}
