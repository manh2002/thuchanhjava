package shapes;
import java.util.Scanner;
public class SinhVien {
  String MaSinhVien;
  String HoTen;
  Boolean GioiTinh;
  String DiaChi;
  String NgaySinh;
  public void NhapThongTin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma sinh vien: ");
    MaSinhVien = sc.nextLine();
    System.out.println("Nhap ho ten: ");
    HoTen = sc.nextLine();
    System.out.println("Nhap dia chi: ");
    DiaChi = sc.nextLine();
    System.out.println("Nhap ngay sinh: ");
    NgaySinh = sc.nextLine();
    System.out.println("Nhap gioi tinh: ");
    GioiTinh = sc.nextBoolean();
  }
  public void InThongTin(){
    System.out.println("MSV: " + MaSinhVien);
    System.out.println("Ho va ten: " + HoTen);
    if(GioiTinh=true)
    System.out.println("Gioi tinh: Nam");
    else System.out.println("Gioi tinh: Nu");
    System.out.println("Dia chi: " + DiaChi);
    System.out.println("Ngay sinh: " + NgaySinh);
  }
}