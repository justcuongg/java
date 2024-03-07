import java.util.Scanner;

public class slide90chuong2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String chuoi;
   
        System.out.print("Nhap vao chuoi ky tu: ");
        chuoi = sc.nextLine();

        for(int i = 0 ; i < chuoi.length() ; i++)
        {
            System.out.println(chuoi.charAt(i));
        }
        sc.close();
    }
}
