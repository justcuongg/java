import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String chuoi;
        int hoa = 0, thuong = 0, so = 0;

        System.out.print("Nhap chuoi: ");
        chuoi = sc.nextLine();

        for(int i = 0 ; i < chuoi.length() ; i++)
        {
            if(chuoi.charAt(i) >= 48 && chuoi.charAt(i) <=57)
                so++;
            else if(chuoi.charAt(i) >= 65 && chuoi.charAt(i) <= 90)
                hoa++;
            else if(chuoi.charAt(i) >= 97 && chuoi.charAt(i) <= 122)
                thuong++;
        }   

        System.out.println("Co " + so + " so");
        System.out.println("Co " + thuong + " ky tu thuong");
        System.out.println("Co " + hoa + " ky tu hoa");
        
        sc.close();
    }
}
