import java.util.Scanner;

public class Quanlysv {
    public static void main(String[] args) {
        
        Student sv = new Quanlysv(). new Student();

        sv.NhapThongTin();
        sv.XuatThongTin();
    }

    class Student {

        String ten;
        String gioitinh;
        String lop;
        String quequan;
        int tuoi;
        float chieucao;
        float cannang;
        float diema, diemb, diemc;

        void NhapThongTin() {

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ten: ");
            ten = sc.nextLine();
            System.out.print("Nhap gioi tinh: ");
            gioitinh = sc.nextLine();
            System.out.print("Nhap lop: ");
            lop = sc.nextLine();
            System.err.print("Nhap que quan: ");
            quequan = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            tuoi = sc.nextInt();
            System.out.print("Nhap chieu cao: ");
            chieucao = sc.nextFloat();
            System.out.print("Nhap can nang: ");
            cannang = sc.nextFloat();
            System.out.print("Nhap diem a: ");
            diema = sc.nextFloat();
            System.out.print("Nhap diem b: ");
            diemb = sc.nextFloat();
            System.out.print("Nhap diem c: ");
            diemc = sc.nextFloat();   
            sc.close();
        }

        void XuatThongTin() {

            System.out.println("Thong tin sinh vien: ");
            System.out.println("Ten: " + ten);
            System.err.println("Gioi tinh: " + gioitinh);
            System.out.println("Lop: " + lop);
            System.out.println("Que quan: " + quequan);
            System.out.println("Tuoi: " + tuoi);
            System.out.println("Chieu cao: " + chieucao);
            System.out.println("Can nang: " + cannang);
            System.out.println("Diem tong ket: " + ((diema * 0.6) + (diemb * 0.3) + (diemc * 0.1)));
        }
    }
}