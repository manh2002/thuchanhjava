package main;

import Shapes.SinhVien;

public class App72 {
    public static void main(String[]args){
        //khởi tạo đối tg
        SinhVien sinhvien1 =new SinhVien();
        SinhVien sinhvien2 =new SinhVien();
        //set thông tin
        sinhvien1.setTen(" ");
        sinhvien1.setTuoi(23);

        sinhvien2.setTen("NGO DUC MANH");
        sinhvien2.setTuoi(20);
        //in thong tin
        System.out.println("Sinh Vien 1 co ten: "+ sinhvien1.getTen()+"tuoi"+ sinhvien1.getTuoi());
        System.out.println("Sinh vien 2 co ten: "+ sinhvien2.getTen()+"tuoi"+ sinhvien2.getTuoi());
    }
}
