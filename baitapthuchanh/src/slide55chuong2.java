import java.util.Scanner;

public class slide55chuong2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cac so chia het cho 5 trong pham vi tu 0 den 20 la: ");
        
        for(int i = 0 ; i <= 20 ; i++)
            if(i % 5 == 0)
             System.out.print(i + "\t");

        sc.close();
        
    }
}
