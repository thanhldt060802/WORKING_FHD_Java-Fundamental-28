public class TamGiac {

    public int canhA;
    public int canhB;
    public int canhC;

    public TamGiac(int canhA, int canhB, int canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public void inThongTinRaManHinh() {
        System.out.println("Canh a: " + this.canhA);
        System.out.println("Canh b: " + this.canhB);
        System.out.println("Canh c: " + this.canhC);
        System.out.println("Hop le: " + this.kiemTraTamGiacHopLe());
    }

    public void inThongTinRaManHinh(boolean inDayDu) {
        this.inThongTinRaManHinh();
        if (inDayDu) {
            System.out.println("C = " + this.tinhChuVi());
            System.out.println("S = " + this.tinhDienTich());
        }
    }

    public int tinhChuVi() {
        if (this.kiemTraTamGiacHopLe()) {
            return this.canhA + this.canhB + this.canhC;
        }

        return -1;
    }

    public double tinhDienTich() {
        if (this.kiemTraTamGiacHopLe()) {
            double p = this.tinhChuVi() / 2.0;
            return Math.sqrt(p * (p - this.canhA) * (p - this.canhB) * (p - this.canhC));
        }

        return -1;
    }

    public boolean kiemTraTamGiacHopLe() {
        return this.canhA + this.canhB > this.canhC &&
        this.canhB + this.canhC > this.canhA &&
        this.canhC + this.canhA > this.canhB;
    }
    
}
