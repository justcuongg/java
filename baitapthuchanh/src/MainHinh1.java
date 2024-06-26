import Hinh.HinhTron;
import Hinh.HinhTru;
import Hinh.HinhChuNhat;
import Hinh.HinhVuong;

public class MainHinh1 {
    public static void main(String[] args) {
        
        HinhTron hinhtron = new HinhTron();
        hinhtron.xuatTen();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inChuVi();
        hinhtron.inDienTich();
        
        HinhTru hinhtru = new HinhTru();
        hinhtru.xuatTen();
        hinhtru.nhapChieuCao();
        hinhtru.tinhTheTich();
        hinhtru.inTheTich();

        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.xuatTen();;
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inChuVi();
        hinhchunhat.inDienTich();

        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inChuVi();
        hinhvuong.inDienTich();
    }
}
