package Nguoi;

import java.util.Scanner;

public class Employee extends Person {

    public String ID;
    public long tongluong;

    public Employee() {
        loai = "Nhan vien";
    }
    
    public void nhapID() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        ID = sc.nextLine();
    }

    public void inID() {
        System.out.println("ID: " + ID);
    }

    public void inLuong() {
        System.out.println("Luong: " + tongluong);
    }
}