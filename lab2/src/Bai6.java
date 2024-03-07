import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, gt = 1;

        do 
        {
            System.out.print("Nhap so nguyen duong: ");
            n =sc.nextInt();
        } while (n <= 0);

        while(n > 0)
        {
            gt = gt * n;
            n--;
        }

        System.out.printf("Giai thua la: %d", gt);
        sc.close();
    }
}
