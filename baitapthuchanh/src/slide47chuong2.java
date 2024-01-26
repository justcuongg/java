package baitapthuchanh.src;

import java.util.Scanner;

public class slide47chuong2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        
        do 
        {
            System.out.print("Nhap vao mot so: ");
            n = sc.nextInt();
            sum += n;
        } while (sum <=100);

        System.out.println("Tong cac so ban vua nhap la: " + sum);
        sc.close();
    }
}
