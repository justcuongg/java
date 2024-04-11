package Nguoi;

import java.util.Scanner;

public class EmployeePartTime extends Employee {

    private final long luongtheogio = 20000;
    private final long thuong = 200000;
    public int sogiolam;
    
    public EmployeePartTime() {
        loai = "Nhan vien part time";
    }

    public void nhapSoGioLam() {
        Scanner sc = new Scanner(System.in);
        System.out.print("So gio lam: ");
        sogiolam = sc.nextInt();
    }

    public void tinhLuong() {
        if(sogiolam > 100)
            tongluong = (sogiolam * luongtheogio) + thuong;
        else 
            tongluong = sogiolam * luongtheogio;
    }   
}