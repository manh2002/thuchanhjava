import java.util.Scanner;
public class AppBai5 {
    public static void main(String[] args) throws Exception {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
          System.out.println("Nhap so nguyen tu ban phim : ");
          n = sc.nextInt();
          sum += n;
        }while (sum<100); // khi nhap so tren 100 ngung nhap vao tu ban phim 
        System.out.println("Tong cac so nguyen la:  " + sum);

    }
}
