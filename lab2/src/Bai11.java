import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        do 
        {
            System.out.print("Nhap so phan tu cua day: ");
            n = sc.nextInt();
        } while(n <= 0);

        double A[] = new double[n];

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("Nhap vao phan tu thu " + (i+1) + " cua mang: ");
            A[i] = sc.nextDouble();
        }

        System.out.println("Mang da nhap la");

        for(int i = 0 ; i < n ; i++)
            System.out.printf("%f \t",A[i]);

        for(int i = 0 ; i < n - 1 ; i++)
            for(int j = i + 1 ; j < n ; j++)
                if(A[i] > A[j])
                {
                    A[i] = A[i] + A[j];
                    A[j] = A[i] - A[j];
                    A[i] = A[i] - A[j];
                }

        System.out.println();
        System.out.println("Mang da sap xep: ");

        for(int i = 0 ; i < n ; i++)
                System.out.printf("%f \t",A[i]);

        sc.close();
    }
    
}
