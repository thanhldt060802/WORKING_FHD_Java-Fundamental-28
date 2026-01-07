/*
 * Lớp và đối tượng (tt)
 *  - Giải quyết bài toán Lớp Tam Giác
 * 
 * Đệ quy
 *  - Giải pháp chia nhỏ bài toán
 *  - Ví dụ:
 *      Giả sử có một hàm F(x) giải quyết bài toán lớn => chi F(x) thành F(x1) và F(x2) để xử lý trên F(x1) và F(x2) từ đó tổng hợp lại.
 *  - Khi triển khai giải pháp đệ quy cần 2 chi tiết quan trọng:
 *      - Điểm dừng của bài toán.
 *      - Công thức/quy tắc chung của bài toán.
 * 
 * * BTVN:
 *  - Xây dựng lớp Tam Giác nâng cao, các thông tin của lớp Tam Giác sẽ là 3 toạ độ điểm A, B, C trên hệ trục Oxy.
 *  - Bài toán fibonacci: tính số fibo thứ n sử dụng For và Recursion.
 * 
 */

public class Buoi08 {

    public static void main(String[] args) {

        // TamGiac tg = new TamGiac(-1, 2, 4);
        // tg.inThongTinRaManHinh(true);

        // System.out.println(tinhTong(0));

        // System.out.println(tinhTongDeQuy(5));

        System.out.println(kiemTraSoLe(5));

    }

    // 1 + 2 + 3 + 4 + 5 + 6 + ...
    // public static int tinhTong(int n) {
    //     int tong = 0;
    //     for (int i = 1; i <= n; i++) {
    //         tong += i;
    //     }
    //     return tong;
    // }

    public static int tinhTongDeQuy(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + tinhTongDeQuy(n - 1);
    }
    /*
     * f(n)
     * Với f(5)
     * 
     * Thứ tự gọi hàm:
     * f(5) => 5 + f(4) => 5 + 4 + f(3) => 5 + 4 + 3 + f(2) => 5 + 4 + 3 + 2 + f(1) => 5 + 4 + 3 + 2 + 1 + 0
     * 
     * // Đệ quy tuyến tính
     *  F(X) => F(X1) => F(X2) => ...
     * 
     * // Đệ quyu nhị phân
     *  F(X) => F(X1) operate F(X2)
     * 
     * // Đệ quy lồng
     *  F(X) => F(X1) in loop
     *  F(X) => F(F(X1))
     * 
     * // Đệ quy tương hỗ
     *  F(X) => F1(X)
     * 
     * // ...
     * 
     */
 
    public static boolean kiemTraSoChan(int n) {
        return n % 2 == 0;
    }

    public static boolean kiemTraSoLe(int n) {
        return !kiemTraSoChan(n);
    }

}
