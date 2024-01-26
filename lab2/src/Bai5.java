import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        String str = "";
        
        do 
        {
            System.out.print("Nhap vao so nguyen: ");
            n = sc.nextInt();
            sum += n;
            str = str + n + " + ";
        } while (sum <= 100);

        System.out.println(str.substring(0, str.length()-2) + "= " + sum);
        
        sc.close();
    }
}
