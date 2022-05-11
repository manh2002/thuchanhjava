import java.net.Socket;
import java.util.HashMap;
import java.util. Scanner;
import java.util.Set;
import java.util.Map;
public class App88 {
    public static void main (String[] args){
        HashMap<String, String> manh = new HashMap<>();
        manh.put("QNg", "Quảng Ngãi");
        manh.put("QN", "Quảng Nam");
        //trong trường hợp này ta  thấy
        //key của hải dương và bắc ninh
        //đều là QN nên chương chình sẽ thêm
        // vào trong hashmapcity<manh> value đứng sau <tức là Quảng Ninh>
        manh.put("QN", "Quảng Ninh");
        manh.put("HCM", "Hồ Chí Minh");
        
        System.out.println("Danh sách các thành phó  trong hashmapcity< manh>");
        Set<Map.Entry< String, String>> setCity = manh.entrySet();
        System.out.println(setCity);

        // lấy thành phó có mã là QNg
        //và hiển thị tên thành phó 
        System.out.println("QNg"+ manh.get("QNg"));

         // lấy thành phó có mã là HN
        //và hiển thị tên thành phó 
        System.out.println("HN"+ manh.get("HN"));
        // để kiểm tra xem 1 value có trong hashmap hay không 
        // chúng ta sẽ dùng phương thức containsValue()
        if(manh.containsKey("Thành Phố Hồ Chí Minh")){
            System.out.println(" Có  Thành Phó HCM trong hashmapcity ");
        }


    }
}
