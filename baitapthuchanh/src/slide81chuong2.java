import java.util.Scanner;

public class slide81chuong2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int row, col;

        do
        {
            System.out.print("Nhap vao so dong cua ma tran: ");
            row = sc.nextInt();
        } while (row <= 0);

        do
        {
            System.out.print("Nhap vao so cot cua ma tran: ");
            col = sc.nextInt();
        } while (col <= 0);

        double A[][] = new double[row][col];

        for(int i = 0 ; i < row ; i++)
            for(int j = 0 ; j < col ; j++)
        {
            System.out.printf("Nhap vao A[%d][%d]: ", i + 1, j + 1);
            A[i][j] = sc.nextDouble();
        }

        double max = A[0][0];

        for(int i = 0 ; i < row ; i++)
            for(int j = 0 ; j < col ; j++)
                if(max < A[i][j])
                    max = A[i][j];
                    
        System.out.println("Phan tu lon nhat ma tran la: " + max);
        sc.close();
    } 
}
