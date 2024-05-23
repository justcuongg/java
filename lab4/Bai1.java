import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrListInt = new ArrayList<>(); 

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            System.out.print("Nhap phan tu thu " + (i+ + 1) + ": ");
            int v = sc.nextInt();
            arrListInt.add(v);
        }

        System.out.println("Gia tri lon nhat: " + timmax(arrListInt));
        System.out.println("Mang truoc xoa: ");
        show(arrListInt);
        xoa(arrListInt);
        System.out.println("Mang sau xoa: ");
        show(arrListInt);
        sort(arrListInt);
        System.out.println("Mang sau sap xep: ");
        show(arrListInt);
    }

    public static void show(ArrayList<Integer> arrListInt) {
        for(int number : arrListInt) 
            System.out.println(number + "\t");
    }

    public static int timmax(ArrayList<Integer> arrListInt) {
        int max = arrListInt.get(0);
        for(int number : arrListInt) 
            if(number > max)
                max = number;
        return max;
    }

    public static void xoa(ArrayList<Integer> arrListInt) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao phan tu can xoa: ");
        int pt = sc.nextInt();

        if(arrListInt.contains(pt)) {
            for(int i = 0 ; i < arrListInt.size() ; i++)
                if(arrListInt.get(i) == pt) 
                    arrListInt.remove(i); 
            System.out.println("Xoa thanh cong"); 
        }
        else 
            System.out.println("Xoa khong thanh cong");
    }

    public static void sort(ArrayList<Integer> arrListInt) {
        for(int i = 0 ; i < arrListInt.size() - 1 ; i++)
            for(int j = i + 1 ; j < arrListInt.size() ; j++) 
                if(arrListInt.get(j) < arrListInt.get(i)) {
                    int tmp = arrListInt.get(i);
                    arrListInt.set(i, arrListInt.get(j));
                    arrListInt.set(j, tmp);
                }
    }
}