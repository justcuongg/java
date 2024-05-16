import java.util.HashSet;
import java.util.Scanner;

public class slide56chuong4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSetInt = new HashSet<>();
        int number;

        hashSetInt.add(1);
        hashSetInt.add(7);
        hashSetInt.add(4);
        hashSetInt.add(3);
        hashSetInt.add(5);

        System.out.println("Cac phan tu trong hashSetInt la: ");
        System.out.println(hashSetInt);
        System.out.print("Nhap phan tu can xoa : ");
        number = sc.nextInt();

        if (hashSetInt.contains(number)) {
            System.out.println("Xoa thanh cong");
            System.out.println("Phan tu con lai trong hashSetInt: ");
            System.out.println(hashSetInt);
        }
        else 
            System.out.println("Xoa khong thanh cong");
    }
}
