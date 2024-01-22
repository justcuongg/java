import java.util.Scanner;

public class Bai1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double hs1, hs2, tong, hieu, tich, thuong, du;

        System.out.print("Nhap so thu nhat: ");
        hs1 = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        hs2 = sc.nextDouble();

        tong = hs1 + hs2;
        hieu = hs1 - hs2;
        tich = hs1 * hs2;
        thuong = hs1 / hs2;
        du = hs1 % hs2;

        System.out.println("Tong cua hai so la: " + tong);
        System.out.println("Hieu cua hai so la: " + hieu);
        System.out.println("Tich cua hai so la: " + tich);
        System.out.println("Thuong cua hai so la: " + thuong);
        System.out.println("Phan du cua hai so la: " + du);

        if(hs1 > hs2) System.out.println(hs1 + " lon hon " + hs2);
        else if (hs1 == hs2 ) System.out.println(hs1 + " bang " + hs2);
        else System.out.println(hs1 + " nho hon " + hs2);

        sc.close();
    }
}