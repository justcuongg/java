import java.util.Scanner;
import java.util.TreeSet;

public class slide69chuong4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        int number;

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        System.out.println("Cac phan tu trong treeSetInt la: ");
        System.out.println(treeSetInteger);
        System.out.print("Nhap phan tu can them: ");
        number = sc.nextInt();

        if(!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("Sau them: ");
            System.out.println(treeSetInteger);
        }
        else 
            System.out.println("Them khong thanh cong");
    }
}