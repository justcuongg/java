package Hinh;

import java.util.Scanner;

public class HinhTru extends HinhTron {

    public float chieuCao;

    public HinhTru() {
        ten = "Hinh tru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        chieuCao = sc.nextFloat();
        
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}

