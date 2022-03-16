package shapes;
import java.util.Scanner;
public class HinhTron{
    
       final float PI = 3.14f;
         float r;
         float chuvi;
         float dientich;

      public void NhapBanKinh() {
        System.out.println("nhap ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r= sc.nextFloat();
      }
      public void TinhChuVi() {
        chuvi = 2*PI*r;
      }
      public void InChuVi(){
        System.out.println("Chu vi hinh tron la:"+ chuvi);
      }
      public void TinhDienTich(){
        dientich = PI*r*r;
      }
      public void InDienTich(){
        System.out.println("Dien tich hanh tron la:" +dientich);
      }
      }
    
  