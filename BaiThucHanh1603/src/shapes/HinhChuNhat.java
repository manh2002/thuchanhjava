package shapes;
import java.util.Scanner;
public class HinhChuNhat {
    
    final float PI = 3.14f;
    float dai;
    float rong;
    float chuvi;
    float dientich;

 public void NhapChieuDai() {
   System.out.println("nhap chieu dai cua hinh chu nhat: ");
   Scanner sc = new Scanner(System.in);
   dai = sc.nextFloat();
 }
 public void NhapChieuRong(){
     System.out.println("nhap chieu rong cua hinh chu nhat:");
     Scanner sc = new Scanner(System.in);
     rong = sc.nextFloat();
 }
 public void TinhChuVi() {
   chuvi = 2*(dai + rong);
 }
 public void InChuVi(){
   System.out.println("Chu vi hinh chu nhat la:"+ chuvi);
 }
 public void TinhDienTich(){
   dientich = dai * rong;
 }
 public void InDienTich(){
   System.out.println("Dien tich hinh chu nhat la:" +dientich);
 }
}
