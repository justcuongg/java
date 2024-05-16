import java.util.LinkedList;

public class slide38chuong4 {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Vi du phuong thuc addAll()");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA: ");
        showList(listA);

        System.out.println("Vi du phuong thuc retainAll()");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("listA: ");
        showList(listA);

        System.out.println("Vi du phuong thuc removeAll()");
        list.removeAll(listB);
        System.out.println("list: ");
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        
        for(String obj : list)
            System.out.println("\t" + obj + ", ");
        System.out.println();
    }
}
