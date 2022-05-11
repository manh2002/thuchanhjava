import java.util.HashMap;

public class App78 {
    public static void main (String[] args){
        // khai báo 1 hashmap ten hashmap1
        //mỗi phần tử trong hashmap bao gồm 2 phần
        // key(Integer) và value(Float)
        HashMap<Integer, Float> hashmap1 = new HashMap<>();

        //khai báo 1 hashmap tên là hasmap2
        //mỗi phần tử trong hashmap2 gồm 2 phần tử
        //có kích thước khởi tạo=10
        HashMap<String, String> hashmap2 =new HashMap<>(10);
        
        // khai báo 1 Hashmap có kích thước  khởi tạo là 4
        // và yếu tố tải = 0,75f( mặc định)
        // chi tiết về kích thước khởi tạo  và yếu tố tải 
        // các bạn xem lại bài hashset
        HashMap<Double, Double> hashmap3= new HashMap<>();
        
        //khai báo 1 hashmap được tạo thanh từ 1 collection
         HashMap<Float, Integer> hashmap4 =  new HashMap<>();
    }
}
