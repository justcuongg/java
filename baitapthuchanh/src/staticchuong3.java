import java.util.Scanner;

public class staticchuong3 {

     
    class ToaDo {
    
        public static String thongtin;
        public int x;
        public int y;
    }
    
    class Configs {
    
        public static final int SO_LUONG_HINH_TOI_THIEU = 0;
        public static final int SO_LUONG_HINH_TOI_DA = 5;
    
        public static final float PI = 3.14f;
        public static final float INCH_CM = 2.54f;
        public static final int DON_VI_CM = 1;
        public static final int DON_VI_INC = 2;
        public static int donVi = DON_VI_CM;
    
        public static float ChuyenCentimetSangInch(float cm) {
            float inch = cm / INCH_CM;
            return inch;
        }
    
        public static float ChuyenInchSangCentimet(float inch) {
            float cm = inch * INCH_CM;
            return cm;
        }
    }
    
    class HinhHoc {
    
        public static int dem = 0;
        public HinhHoc() {
            dem++;
        }  
    }
    
    class HinhTron extends HinhHoc {
    
        protected float banKinh;
        private Scanner sc;
    
        public HinhTron() {
            super();
            sc = new Scanner(System.in);
        }
    
        public void nhapBK() {
            System.out.println("Ban dung don vi tinh nao: ");
            System.out.println("\t1 - Centimet");
            System.out.println("\t2 - Inch");
            Configs.donVi = sc.nextInt();
    
            System.out.print("Hay nhap vao ban kinh: ");
            banKinh = sc.nextFloat();
        }
    
        public void inThongTin() {
    
            if(Configs.donVi == Configs.DON_VI_CM) {
                System.out.println("Hinh tron co ban kinh: " + banKinh + " cm");
                System.out.println("Tuong duong: " + Configs.ChuyenCentimetSangInch(banKinh) + " inch");
            }
            else {
                System.out.println("Hinh tron co ban kinh: " + banKinh + " inch");
                System.out.println("Tuong duong: " + Configs.ChuyenInchSangCentimet(banKinh) + " cm");
            }
        }
    }
    
    class HinhChuNhat extends HinhHoc {
    
        public HinhChuNhat() {
            super();
        }
    }
    public static void main(String[] args) {
            
        ToaDo td1 = new staticchuong3().new ToaDo();
        ToaDo td2 = new staticchuong3().new ToaDo();
    
        td1.x = 10;
        td1.y = 10;
    
        td2.x = 5;
        td2.y = 5;
    
        ToaDo.thongtin = "Luu toa do cac hinh hoc";
    
        HinhHoc hh = new staticchuong3().new HinhHoc();
        HinhTron ht1 = new staticchuong3().new HinhTron();
        HinhTron ht2 = new staticchuong3().new HinhTron();
        HinhChuNhat hcn = new staticchuong3().new HinhChuNhat();
    
        System.out.println("Tong: " + HinhHoc.dem);
    
        ht1.nhapBK();
        ht1.inThongTin();
    }
}  

