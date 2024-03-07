import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        do 
        {
            System.out.print("Nhap so phan tu cua day: ");
            n = sc.nextInt();
        }  while(n <= 0);

        double A[] = new double[n];

        for(int i = 0 ; i < n ; i++)
        {
            System.out.printf("Nhap phan tu thu %d cua day: ", i + 1);
            A[i] = sc.nextDouble();
        }

        for(int i = 0 ; i < n ; i++)
            sum = sum + A[i];

        System.out.println("Trung binh cong cua day la: " + sum / n);
        sc.close();
    }
}
