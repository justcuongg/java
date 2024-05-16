import java.util.LinkedList;
import java.util.Scanner;

public class slide41chuong4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        System.out.print("Nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();

        if((index < 0) || (index > (linkedList.size() - 1)))
            System.out.println("Chi so can lay phai lon hon 0 va nho hon " + (linkedList.size() - 1));
        else {
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedlist la: " + node);
        }

        String firstNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();

        System.out.println("Phan tu dau tien la: " + firstNode + " Phan tu cuoi cung la: " + lastNode);
        sc.close();
    }
}
