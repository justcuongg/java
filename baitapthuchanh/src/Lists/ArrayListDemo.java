package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import Student.Student;

public class ArrayListDemo {

    private ArrayList<Student> students;

    public ArrayListDemo() {
        students = new ArrayList<>();
    }

    public void inputStudents(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            Student student = new Student();
            student.inputInfo();
            students.add(student);
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println("-----------");
        }
    }

    // Phương thức thêm mới thông tin một đối tượng Student
    public void addStudent() {
        Student student = new Student();
        student.addInfo();
        students.add(student);
    }

    // Phương thức sửa thông tin của một đối tượng Student
    public void updateStudent(int index, String newFullName, int newAge) {
        if (index >= 0 && index < students.size()) {
            Student student = students.get(index);
            student.updateInfo(newFullName, newAge);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so Student: ");
        int n = sc.nextInt();
        demo.inputStudents(n);

        System.out.println("Thong tin Student:");
        demo.displayStudents();

        System.out.println("Them student:");
        demo.addStudent();
        demo.displayStudents();

        System.out.print("Nhap chi so cua Student can sua: ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter new full name: ");
        String newFullName = sc.nextLine();
        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();
        demo.updateStudent(index, newFullName, newAge);

        System.out.println("Updated student information:");
        demo.displayStudents();
    }
}
