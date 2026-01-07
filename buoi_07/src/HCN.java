public class HCN {

    public String mauSac;
    public int chieuRong;
    public int chieuDai;

    public HCN(String mauSac, int chieuRong, int chieuDai) { // Hàm khởi tạo đầy đủ tham số (fully params constructor)
        System.out.println("Ham khoi tao so 1 duoc goi");
        this.mauSac = mauSac;
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public HCN(int chieuRong, int chieuDai) {  // Hàm khởi tạo 2 tham số (partial params constructor)
        this("Unknown color", chieuRong, chieuDai);
        System.out.println("Ham khoi tao so 2 duoc goi");
        // this.mauSac = "Unknown color";
        // this.chieuRong = chieuRong;
        // this.chieuDai = chieuDai;
    }

    public HCN(String mauSac) {
        this(mauSac, -1, -1);
        System.out.println("Ham khoi tao so 3 duoc goi");
    }

    public void inThongTinRaManHinh() {
        System.out.println("Mau sac: " + this.mauSac);
        System.out.println("Chieu rong: " + this.chieuRong);
        System.out.println("Chieu dai: " + this.chieuDai);
    }

    public void inThongTinRaManHinh(boolean inRaDayDu) {
        this.inThongTinRaManHinh();
        if (inRaDayDu) {
            System.out.println("C = " + this.tinhChuVi());
            System.out.println("S = " + this.tinhDienTich());
        }
    }

    public int tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public int tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

}
