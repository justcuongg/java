import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String chuoi;
        char x;
        int count = 0;

        do
        {
            System.out.print("Nhap chuoi: ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);

        System.out.print("Nhap ky tu: ");
        x = sc.nextLine().charAt(0);

        for(int i = 0 ; i < chuoi.length() ; i++)
            if(x == chuoi.charAt(i))
                count++;
        
        System.out.printf("Ky tu %c xuat hien %d lan", x, count);

        sc.close();
    }
}
