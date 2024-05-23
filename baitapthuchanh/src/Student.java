import java.util.Scanner;

public class Student {
    
    private String fullName;
    private int age;

    public Student() {}

    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        fullName = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }

    public void addInfo() {
        inputInfo();
    }

    public void updateInfo(String newFullName, int newAge) {
        this.fullName = newFullName;
        this.age = newAge;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}