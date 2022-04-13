package main;

import Shapes.HinhTron;

public class App71 {
    public static void main(String[]agrs){
        //khởi tạo đối tượng HinhTron từ lớp HinhTron
        HinhTron hinhTron = new HinhTron();
        //set bán kính cho hình tròn qua phương thức setter
        hinhTron.setBanKinh(10);
        //các tính toán khác
        float ChuVi = hinhTron.tinhChuVi();
        float DienTich =hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron:" + ChuVi +"Va Dien tich"+DienTich);
    }
    
}
