public class TamGiac {

    public Diem2D diem1;
    public Diem2D diem2;
    public Diem2D diem3;

    public TamGiac(Diem2D diem1, Diem2D diem2, Diem2D diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String tenTamGiac() {
        return this.diem1.ten + this.diem2.ten + this.diem3.ten;
    }

    public double canh1() {
        return this.diem1.tinhKhoangCanh(this.diem2);
    }

    public double canh2() {
        return this.diem2.tinhKhoangCanh(this.diem3);
    }

    public double canh3() {
        return this.diem3.tinhKhoangCanh(this.diem1);
    }

    public void inThongTinRaManHinh() {
        System.out.println("Ten tam giac: " + this.tenTamGiac());
        this.diem1.inThongTinRaManHinh();
        this.diem2.inThongTinRaManHinh();
        this.diem3.inThongTinRaManHinh();

        String format = "%s = %.15f";
        System.out.println(String.format(format, this.diem1.ten + this.diem2.ten, this.canh1()));
        System.out.println(String.format(format, this.diem2.ten + this.diem3.ten, this.canh2()));
        System.out.println(String.format(format, this.diem3.ten + this.diem1.ten, this.canh3()));
    }

    public void inThongTinRaManHinh(boolean inDayDu) {
        this.inThongTinRaManHinh();
        if (inDayDu) {
            System.out.println("C = " + this.tinhChuVi());
            System.out.println("S = " + this.tinhDienTich());
        }
    }

    public double tinhChuVi() {
        if (this.kiemTraTamGiacHopLe()) {
            return this.canh1() + this.canh2() + this.canh3();
        }

        return -1;
    }

    public double tinhDienTich() {
        if (this.kiemTraTamGiacHopLe()) {
            double p = this.tinhChuVi() / 2;
            return Math.sqrt(p * (p - this.canh1()) * (p - this.canh2()) * (p - this.canh3()));
        }

        return -1;
    }
    
    public boolean kiemTraTamGiacHopLe() {
        return this.canh1() + this.canh2() > this.canh3() &&
        this.canh2() + this.canh3() > this.canh1() &&
        this.canh3() + this.canh1() > this.canh2();
    }
    
}
