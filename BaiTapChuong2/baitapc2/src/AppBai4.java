import java.util.Scanner;
public class AppBai4 {
    public static void main(String[] args) throws Exception {
        int thang;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thang: ");
        thang = sc.nextInt();
        switch(thang){
            case 1: System.out.println("Thang 1");
            case 2: System.out.println("Thang 2");
            case 3: System.out.println("Thang 3");
            case 4: System.out.println("Thang 4");
            case 5: System.out.println("Thang 5");
            case 6: System.out.println("Thang 6");
            case 7: System.out.println("Thang 7");
            case 8: System.out.println("Thang 8");
            case 9: System.out.println("Thang 9");
            case 10: System.out.println("Thang 10");
            case 11: System.out.println("Thang 11");
            case 12: System.out.println("Thang 12");
            break;
            default: System.out.println("Thang khong hop le!");
        
        }
    }
}
