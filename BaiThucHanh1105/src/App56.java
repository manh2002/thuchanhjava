import java.util.Scanner;
import java.util.HashSet;
public class App56 {
    public static void main(String[] args) throws Exception {
        String name;
        HashSet<String> manh= new HashSet<>();
        Scanner sc = new Scanner(System.in);
        // them cac phan tu vao manh
        manh.add("Wilson");
        manh.add("Nike");
        manh.add("VoLvo");
        manh.add("Kia");
        manh.add("Lenovo");
        manh.add("Lenovo");

        //hien thi cac phan tu trong manh
        System.out.println("Cac phan tu trong mang:");
        System.out.println(manh);
        System.out.println("Nhap cac phan tu can xoa");
        name = sc.nextLine();
        //them mot phan tu moi vao manh
        //neu phan tu do da ton tai thi thong bao da ton tai nguoc lai thi them vao
        if(manh.contains(name)){
            manh.remove(name);
            System.out.println("Xoa Thanh Cong");
            System.out.println("Cac phan tu con lai la:");
            System.out.println(manh);
        }else{
            System.out.println("Xoa khong thanh cong");
        }
    }
}
