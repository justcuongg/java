package baitapthuchanh.src;

import java.util.Scanner;

public class slide35chuong2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b;

        System.out.print("Nhap vao so thu nhat: ");
        a = sc.nextDouble();
        System.out.print("Nhap vao so thu hai: ");
        b = sc.nextDouble();

        if(a > b) 
            System.out.println("So nho nhat trong hai so la: " + b);
        else if (a == b)
            System.out.println("Hai so bang nhau");
        else 
            System.out.println("So nho nhat trong hai so la: " + a);
        
        sc.close();
    }
}
