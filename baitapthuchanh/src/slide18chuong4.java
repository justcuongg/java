import java.util.ArrayList;

public class slide18chuong4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrListInt = new ArrayList<>();

        arrListInt.add(0);
        arrListInt.add(7);
        arrListInt.add(1);
        arrListInt.add(9);

        System.out.println("Cac phan tu co trong arrListInt la: ");

        for(int number : arrListInt) {
            System.out.println(number + "\t");
        }
    }
}