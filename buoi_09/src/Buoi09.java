/*
 * Lớp và đối tượng (tt)
 *  - Giải quyết bài toán lớp Tam Giác (nâng cao).
 *      Xây dựng lớp Tam Giác nâng cao, các thông tin của lớp Tam Giác sẽ là 3 toạ độ điểm A, B, C trên hệ trục Oxy.
 * 
 * Đệ quy
 *  - Giải quyết bài toán dãy Fibonacci.
 *      Tính số fibo thứ n sử dụng For và Recursion.
 */

public class Buoi09 {

    public static void main(String[] args) {

        // Lớp và đối tượng (tt)

        // Diem2D diem1 = new Diem2D("M", 1, 3);
        // Diem2D diem2 = new Diem2D("N", 1, 5);
        // Diem2D diem3 = new Diem2D("P", 1, 7);

        // TamGiac tg = new TamGiac(diem1, diem2, diem3);
        // tg.inThongTinRaManHinh(true);

        // Đệ quy

        // for (int i = 0; i <= 100; i++) {
        //     System.out.printf("F(%d) = %d\n", i, fiboVongLap(i));
        // }

        // -2,147,483,648 to 2,147,483,647
        // F(45) = 1134903170
        // F(46) = 1836311903
        // F(47) = 2971215073

        // System.out.println(fiboDeQuy(1000000));

        System.out.println(1 / 0);

    }
    
    public static long fiboVongLap(int n) {
        if (n > 1) {
            long x = 0; // Khởi tạo ban đầu đại diện cho F(0) và xét theo công thức là F(n - 2)
            long y = 1; // Khởi tạo ban đầu đại diện cho F(1) và xét theo công thức là F(n - 1)

            while(n > 1) {
                long next = x + y;
                x = y;
                y = next;

                n--;
            }

            return y;
        }

        return n;
    }

    public static int fiboDeQuy(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fiboDeQuy(n - 1) + fiboDeQuy(n - 2);
        }
    }

}
