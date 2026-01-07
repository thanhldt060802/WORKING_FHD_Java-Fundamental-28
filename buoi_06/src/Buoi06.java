import java.lang.Math;

public class Buoi06 {
    
    public static void main(String[] args) {

        // 1.E48

        // int a = 30;
        // int b = 35;
        // int carry = 0;

        // do {
        //     carry = a & b;

        //     int aNew = a ^ b;
        //     int bNew = carry << 1;

        //     a = aNew;
        //     b = bNew;
        // } while (carry != 0);

        // System.out.println(a);
        // System.out.println(b);

        // 3 (011), 5 (101)
        /*
         * a = 3 (011)
         * b = 5 (101)
         * carry = a & b = 001 => 1 != 0
         * 
         * LẦN 1
         * sum = a ^ b = 110 = 6
         * a = sum => 6
         * b = carry << 1 = 010 => 2
         * 
         * -----
         * 
         * a = 6 (110)
         * b = 2 (010)
         * carry = a & b = 010 => 2 != 0
         * 
         * LẦN 2
         * sum = a ^ b = 100 = 4
         * a = sum => 4
         * b = carry << 1 = 100 => 4
         * 
         * -----
         * 
         * a = 4 (100)
         * b = 4 (100)
         * carry = a & b = 100 => 4 != 0
         * 
         * LẦN 3
         * sum = a ^ b = 000 = 0
         * a = sum => 0
         * b = carry << 1 = 1000 => 8
         * 
         * -----
         * 
         * a = 0 (0000)
         * b = 8 (1000)
         * carry = a & b = 0000 => 0 == 0
         * 
         * LẦN 4
         * ...
         */

        /*
         * a = 20 (010100)
         * b = 25 (011001)
         * carry = a & b = 010000 => 16 != 0
         * 
         * LẦN 1
         * sum = a ^ b = 001101 = 13
         * a = sum => 13
         * b = carry << 1 = 100000 => 32
         * 
         * -----
         * 
         * a = 13 (001101)
         * b = 32 (100000)
         * carry = a & b = 000000 = 0
         * 
         * LẦN 2
         * sum = a ^ b = 101101 = 45
         * a = sum => 45
         * b = carry << 1 = 0000000 => 0
         */

        // 1.D38

        double r = 3.14;
        double pi = Math.PI;
        double S1 = pi * Math.pow(r, 2);
        double S2 = pi * r * r;
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(0.1 + 0.1 + 0.1);

    }

}
