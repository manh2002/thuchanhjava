import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App86 {
public static void main (String[] args){
    // khai báo 1 hashmap có tên là  hashmap
    // kiểu dữ liệu của key và value là string
    HashMap< String, String> manh = new HashMap<>();

    // thêm value vào trong hashmap với key tương ứng
    //sử dụng phương thức put
    //đổi số thứ nhất trong put lafv  key có kiểu string
    manh.put("CSLT", " cơ sở lập trình" );
    manh.put("C++", "C++");
    manh.put("C#", "C sharp");
    manh.put("PHP", "PHP");
    manh.put("Java", "Java");

    // tạo 1 set có tên là setHashMap
    //chứa toàn bộ các entry ( vừa key vừa value) cuae hash map
    Set<Map.Entry<String, String>> setHashMap= manh.entrySet();

    System.out.println(" Các entry có trong  setHachMap: ");
    System.out.println(setHashMap);
}
}
