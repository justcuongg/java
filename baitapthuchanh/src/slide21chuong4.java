import java.util.ArrayList;

public class slide21chuong4 {
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Gray");

        colors.set(3, "Pink");

        colors.remove(4);

        colors.add(4, "Red");

        System.out.println(colors.get(3));
        System.out.println(colors.size());
        System.out.println(colors.contains("Black"));
        System.out.println(colors);
    }
}