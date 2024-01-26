import java.util.Scanner;

public class Bai2 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Nhap so: ");
        n = sc.nextInt();

        if(n % 2 == 0) System.out.println("So ban nhap la so chan");
        else System.out.println("So ban nhap la so le");
        sc.close();
    }
}
