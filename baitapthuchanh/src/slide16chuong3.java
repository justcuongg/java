import java.util.Scanner;

public class slide16chuong3 {
    
    class HinhTron {

        final float PI = 3.14f;
        float r;
        float cv;
        float dt;

        void nhapBanKinh() {

            System.out.print("Nhap ban kinh: ");
            Scanner sc = new Scanner(System.in);
            r = sc.nextFloat();
            sc.close();
        }

        void tinhChuVi() {
            cv = 2 * PI * r;
        }

        void tinhDienTich() {
            dt = PI * r * r;
        }

        void inChuVi() {
            System.out.println("Chu vi la: " + cv);
        }

        void inDienTich() {
            System.out.println("Dien tich la: " + dt);
        }
    }

    public static void main(String[] args) {
        
        HinhTron hinhtron = new slide16chuong3(). new HinhTron();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inChuVi();
        hinhtron.inDienTich();
    }
}
