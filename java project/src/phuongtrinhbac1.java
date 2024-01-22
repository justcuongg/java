import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hsA, hsB;
        System.out.print("Nhap he so a: ");
        hsA = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        hsB = sc.nextDouble();
        System.out.println("Phuong trinh co dang la " + hsA + "x + " + hsB + " = 0");

        if(hsA == 0) {
            if(hsB == 0) System.out.println("Phuong trinh co dang 0 = 0 (luon dung)");
            else System.out.println("Phuong trinh khong ton tai do a phai khac 0 ");
            }
            else System.out.println("Phuong trinh cua nghiem la x = " + -hsB/hsA);
        sc.close();
    }
}
