package Nguoi;

import java.util.Scanner;

public class Person {
    
    public String loai;
    public String name;

    public Person() {
        loai = "Person";
    }

    public void xuatLoai() {
        System.out.println("Loai: " + loai);
    }

    public void nhapten() {
        System.out.print("Nhap ten: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }

    public void inTen() {
        System.out.println("Ten " + name);
    }
}