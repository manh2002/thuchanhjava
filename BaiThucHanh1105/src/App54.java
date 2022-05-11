import java.util.Scanner;
import java.util.HashSet;
public class App54 {
    public static void main(String[] args) throws Exception {
        int number;
        HashSet<Integer> manh= new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // them cac phan tu vao hashSetinteger
        manh.add(0);
        manh.add(3);
        manh.add(1);
        manh.add(4);
        manh.add(2);
        manh.add(8);

        //hien thi cac phan tu trong hashsetInteger
        System.out.println("Cac phan tu trong hashSetInteger:");
        System.out.println(manh);
        System.out.println("Nhap cac phan tu can them");
        number = sc.nextInt();
        //them mot phan tu moi vao Hashsetinteger
        //neu phan tu do da ton tai thi thong bao da ton tai nguoc lai thi them vao
        if(!manh.contains(number)){
            manh.add(number);
            System.out.println("Them Thanh Cong");
            System.out.println("Cac phan tu trong hashsetInteger sau khi them la:");
            System.out.println(manh);
        }else{
            System.out.println("Phan Tu"+ number + " da ton tai");
        }
    }
}
