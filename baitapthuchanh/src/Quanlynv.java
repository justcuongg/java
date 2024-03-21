import java.util.Scanner;

public class Quanlynv {
    
    public static void main(String[] args) {
        
        Employee nv = new Quanlynv().new Employee();

        nv.NhapTHongTin();
        nv.XuatThongTin();
    }
    class Employee {

        final float luongtheogio = 20000;
        final float thuong = 200000;
        String ten;
        String quequan;
        String chucvu;
        String gioitinh;
        int tuoi;
        float chieucao;
        float cannang;
        int sogiolam;
    

        void NhapTHongTin() {
        
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhap thong tin nhan vien: ");
            System.out.print("Nhap ten: ");
            ten = sc.nextLine();
            System.out.print("Nhap que quan: ");
            quequan = sc.nextLine();
            System.out.print("Nhap chuc vu: ");
            chucvu = sc.nextLine();
            System.out.print("Nhap gioi tinh: ");
            gioitinh = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            tuoi = sc.nextInt();
            System.out.print("Nhap chieu cao: ");
            chieucao = sc.nextFloat();
            System.out.print("Nhap can nang: ");
            cannang = sc.nextFloat();
            System.out.print("Nhap tong so gio lam: ");
            sogiolam = sc.nextInt();
            sc.close();
        }

        void XuatThongTin() {

            System.out.println("Thong tin nhan vien: ");
            System.out.println("Ten: " + ten);
            System.err.println("Gioi tinh: " + gioitinh);
            System.out.println("Que quan: " + quequan);
            System.out.println("Chuc vu: " + chucvu);
            System.out.println("Tuoi: " + tuoi);
            System.out.println("Chieu cao: " + chieucao);
            System.out.println("Can nang: " + cannang);
            if(sogiolam > 40)
                System.out.println("Luong thang: " + ((sogiolam * luongtheogio) + thuong));
            else 
                System.out.println("Luong thang: " + (sogiolam * luongtheogio));
        }
    }
}