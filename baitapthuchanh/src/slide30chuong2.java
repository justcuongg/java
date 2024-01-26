package baitapthuchanh.src;

import java.util.Scanner;

public class slide30chuong2 {
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        do
        {
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        } while(n <= 0);

        while(n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Tong cac chu so la: " + sum);

        sc.close();
    }
}