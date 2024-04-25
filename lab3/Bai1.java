public class Bai1 {

    class Configs {

        public static final int SEP = 1;
        public static final int LINH = 2;

        public static final long LUONG_SEP = 1000;
        public static final long LUONG_LINH = 500;
        public static final long LUONG_NGAY = 10;
        public static final long LUONG_GIO = 1;
    }

    class NhanVien {

        protected String ten;
        protected long luong;

        public NhanVien() {

        }

        public NhanVien(String ten) {
            this.ten = ten;
        }

        protected String loaiNhanVien() {
            return "";
        }

        public void xuatThongTin() {
            System.out.println("Nhan vien: " + ten);
            System.out.println("Loai nhan vien: " + loaiNhanVien());
            System.out.println("Luong: " + luong);
        }
    }

    class NhanVienFullTime extends NhanVien {

        private int ngayLamThem;
        private int loaiChucVu;

        public NhanVienFullTime(String ten) {
            this.ten = ten;
        }

        public NhanVienFullTime(String ten, int ngayLamThem) {
            this.ten = ten;
            this.ngayLamThem = ngayLamThem;
        }

        public void setLoaiChucVu(int loaiChucVu) {
            this.loaiChucVu = loaiChucVu;
        }

        public String loaiNhanVien() {
            return "Nhan vien fulltime";
        }

        public void tinhLuong() {
            if(loaiChucVu == Configs.SEP)
                luong = Configs.LUONG_SEP + (ngayLamThem * Configs.LUONG_NGAY);
            else 
                luong = Configs.LUONG_LINH + (ngayLamThem * Configs.LUONG_NGAY);
        }
    }

    class NhanVienPartTime extends NhanVien {

        private int gioLam;

        public NhanVienPartTime(String ten, int gioLam) {

            this.ten = ten;
            this.gioLam = gioLam;
        }

        public String loaiNhanVien() {
            return "Nhan vien parttime";
        }

        public void tinhLuong() {
            luong = Configs.LUONG_GIO * gioLam;
        }
    }

    public static void main(String[] args) {
        
        NhanVienFullTime sep = new Bai1(). new NhanVienFullTime("Tran Van Sep");
        sep.setLoaiChucVu(Configs.SEP);
        NhanVienFullTime linh1 = new Bai1(). new NhanVienFullTime("Nguyen Van Linh");
        NhanVienFullTime linh2 = new Bai1(). new NhanVienFullTime("Le Thi Linh", 3);
        NhanVienPartTime thoiVu = new Bai1(). new NhanVienPartTime("Phan Thi Thoi Vu", 240);

        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();

        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
} 

