package Nguoi;

public class MainNguoi {
    public static void main(String[] args) {
        
    
    EmployeeFullTime ft = new EmployeeFullTime();
        ft.xuatLoai();
        ft.nhapID();
        ft.nhapten();
        ft.nhapChucVu();
        ft.tinhLuong();
        ft.inID();
        ft.inTen();
        ft.inLuong();

        EmployeePartTime pt = new EmployeePartTime();
        pt.xuatLoai();
        pt.nhapID();
        pt.nhapten();
        pt.nhapSoGioLam();
        pt.tinhLuong();
        pt.inID();
        pt.inTen();
        pt.inLuong();
    }
}
