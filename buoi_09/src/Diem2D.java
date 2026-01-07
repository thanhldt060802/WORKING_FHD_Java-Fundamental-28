public class Diem2D {

    public String ten;
    public int x;
    public int y;

    public Diem2D(String ten, int x, int y) {
        this.ten = ten;
        this.x = x;
        this.y = y;
    }

    public void inThongTinRaManHinh() {
        System.out.println(String.format("%s (%d; %d)", this.ten, this.x, this.y));
    }

    public double tinhKhoangCanh(Diem2D P) { // Tính khoảng cách từ this -> P
        return Math.sqrt(Math.pow(P.x - this.x, 2) + Math.pow(P.y - this.y, 2));
    }
    
}
