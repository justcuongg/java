import java.util.Scanner;

public class slide74chuong2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, sum =0;

        do 
        {
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            System.out.printf("Nhap phan tu thu %d cua mang: ", i+1);
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++)
            if(A[i] % 2 == 0)
                sum = sum + A[i];

        System.out.println("Ket qua la: " + sum);
        sc.close();
    }
}
