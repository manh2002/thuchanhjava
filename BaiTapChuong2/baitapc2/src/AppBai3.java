import java.util.Scanner;
public class AppBai3 {
    public static void main(String[] args) throws Exception {
        double nam;
        String ten;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 ten bat ky:");
        ten = sc.nextLine();
        System.out.println("Nhap vao nam sinh bat ky:");
        nam = sc.nextDouble();
        double age=2022-nam;
        if(age<16)
          System.out.println("Ban "+ten+" o do tuoi vi thanh nien");
        if(age>=16&&age<18)
          System.out.println("Ban "+ten+" o do tuoi truong thanh");
        if(age>=18)
          System.out.println("Ban "+ten+" o do tuoi gia ");
      }
}
