package main;
import java.util.Scanner;
import shapes.HinhChuNhat;
import shapes.HinhTron;
public class App20 {
    public static void  main(String args[]){
        HinhTron ht = new HinhTron();
        HinhChuNhat hcn = new HinhChuNhat();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.TinhDienTich();
        ht.InChuVi();
        ht.InDienTich();
        hcn.NhapChieuDai();
        hcn.NhapChieuRong();
        hcn.TinhChuVi();
        hcn.TinhDienTich();
        hcn.InChuVi();
        hcn.InDienTich();
    }
}