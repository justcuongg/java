import java.util.ArrayList;
import java.util.Scanner;

public class slide23chuong4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrListInt = new ArrayList<>();
        int n;

        System.out.print("Nhap so phan tu cua arrListInt: ");
        n = sc.nextInt();

        for(int i = 0 ; i < n ; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ": ");
            arrListInt.add(sc.nextInt());
        }

        int max = arrListInt.get(0);

        for(int i = 1 ; i < arrListInt.size() ; i++) 
            if(arrListInt.get(i).compareTo(max) > 0)
                max = arrListInt.get(i);

        System.out.println("Phan tu lon nhat la: " + max);

        sc.close();
    }
}