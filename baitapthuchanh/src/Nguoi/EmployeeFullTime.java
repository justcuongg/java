package Nguoi;

import java.util.Scanner;

public class EmployeeFullTime extends Employee {
    
    private final long LuongTruongPhong = 15000000;
    private final long LuongNhanVien = 10000000;
    private final long LuongBaoVe = 5000000;

    public int ChucVu;

    public EmployeeFullTime() {
        loai = "Nhan vien full time";
    }

    public void nhapChucVu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuc vu: (1.Truong phong / 2.Nhan vien / 3.Bao ve): ");
        ChucVu = sc.nextInt();
    }

    public void tinhLuong() {
        if(ChucVu == 1)
            tongluong = LuongTruongPhong;
        else if(ChucVu == 2)
            tongluong = LuongNhanVien;
        else if(ChucVu == 3)
            tongluong = LuongBaoVe;
    }
}