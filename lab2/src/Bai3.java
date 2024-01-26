package lab2.src;

import java.util.Scanner;

public class Bai3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int age;
        String name;

        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        
        if(age < 16)
            System.out.println("Ban " + name + " o do tuoi vi thanh nien");
        else if(age >= 16 && age < 18)
            System.out.println("Ban " + name + " o do tuoi truong thanh");
        else 
            System.out.println("Ban " + name + " da gia");

        sc.close();
    }
}
