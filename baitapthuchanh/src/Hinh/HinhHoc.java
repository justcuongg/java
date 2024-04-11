package Hinh;

public class HinhHoc {
    
    public final float PI = 3.14f;

    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public HinhHoc() {
        ten = "Hinh";
    }

    public void xuatTen() {
        System.out.println("Ten: " + ten);
    }

    public void inChuVi() {
        System.out.println("Chu vi: " + chuVi);
    }

    public void inDienTich() {
        System.out.println("Dien tich: " + dienTich);
    }

    public void inTheTich() {
        System.out.println("The tich: " + theTich);
    }
    
}