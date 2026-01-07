public class SinhVien {

    public String maSoSV;
    public String ten;
    public int tuoi;

    public SinhVien(String maSoSV, String ten, int tuoi) {
        this.maSoSV = maSoSV;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public SinhVien(SinhVien sv) { // Là một bí danh của hàm saoChep
        this(sv.maSoSV, sv.ten, sv.tuoi);
    }

    public void inThongTinRaManHinh() {
        System.out.println("Ma so SV: " + this.maSoSV);
        System.out.println("Ten: " + this.ten);
        System.out.println("Tuoi: " + this.tuoi);
    }

    public SinhVien saoChep() {
        SinhVien sinhVienMoi = new SinhVien(this.maSoSV, this.ten, this.tuoi);
        return sinhVienMoi;
    }
    
}
