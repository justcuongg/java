public class gettersetterchuong3 {

    class ToaDo {
        
        private int x;
        private int y;
    
        public int getX() {
            return x;
        }
    
        public void setX(int x) {
            this.x = x;
        }
    
        public int getY() {
            return y;
        }
    
        public void setY(int y) {
            this.y = y;
        }
    }
    
    class HinhTron {
            
        private final float PI = 3.14f;
        private float BK;
    
        public float getBK() {
             return BK;
        }
    
        public void setBK(float BK) {
            this.BK = BK;
        }
    
        public float tinhCV() {
            return PI * BK * 2;
        }
    
        public float tinhDT() {
            return PI * BK * BK;
        }
    }
    
    class SinhVien {
    
        private String ten;
        private String tuoi;
    
        public String getTen() {
            return ten;
        }
    
        public void setTen(String ten) {
    
            if(ten == null || ten.isEmpty()) 
                this.ten = "Khong biet";
            else 
                this.ten = ten;
        }
    
        public String getTuoi() {
            if(Integer.valueOf(tuoi) != -1)
                return tuoi;
            else 
                return "Tuoi khong hop le";
        }
    
        public void setTuoi(int tuoi) {
    
            if(tuoi > 18) 
                this.tuoi = String.valueOf(tuoi);
            else 
                this.tuoi = String.valueOf(-1);
        }
    }
    
    public static void main(String[] args) {
            
        ToaDo td = new gettersetterchuong3().new ToaDo();
        HinhTron ht = new gettersetterchuong3().new HinhTron();
        SinhVien sv1 = new gettersetterchuong3().new SinhVien();
        SinhVien sv2 = new gettersetterchuong3().new SinhVien();
    
        td.setX(3);
        td.setY(4);
        System.out.println("Toa do: (" + td.getX() + ";" + td.getY() + ")");
    
        ht.setBK(7);
        float cv = ht.tinhCV();
        float dt = ht.tinhDT();
        System.out.println("Chu vi hinh tron: " + cv + " dien tich: " + dt);
        
        sv1.setTen("");
        sv1.setTuoi(13);
    
        sv2.setTen("Nam");
        sv2.setTuoi(20);
    
        System.out.println("SV1 co ten: " + sv1.getTen() + " - " + sv1.getTuoi() + " tuoi");
        System.out.println("SV2 co ten: " + sv2.getTen() + " - " + sv2.getTuoi() + " tuoi");
    }
}

