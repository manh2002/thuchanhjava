import java.util.Scanner;
public class App30 {
   public static void main(String[] args) throws Exception { 
        int n, sodu, tong = 0;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Nhap vao so nguyen duong bat ky: ");
  n = scanner.nextInt();
    while (n > 0) {
        sodu = n % 10;
        n = n / 10;
        tong += sodu;
    }
 System.out.println("Tong cac chu so = " + tong);

}
    }
