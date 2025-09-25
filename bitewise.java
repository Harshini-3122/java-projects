public class bitewise {
    public static void main(String[] args){
        int a = 10;
        int b = 15;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a>>1);
        System.out.println(a<<1);

        //Example program
        int x = 5;   // 0101 in binary
        int y = 3;   // 0011 in binary
        System.out.println("=== Bitwise Operators Demo ===");
        System.out.println("x = " + x + " (binary 0101)");
        System.out.println("y = " + y + " (binary 0011)");

        // Bitwise AND
        System.out.println("x & y = " + (x & y));   // 0101 & 0011 = 0001 → 1

        // Bitwise OR
        System.out.println("x | y = " + (x | y));   // 0101 | 0011 = 0111 → 7

        // Bitwise XOR
        System.out.println("x ^ y = " + (x ^ y));   // 0101 ^ 0011 = 0110 → 6

        // Bitwise Complement
        System.out.println("~x = " + (~x));      // ~0101 = ...1010 (2’s complement) → -6

        // Left Shift
        System.out.println("x << 1 = " + (x << 1));  // 0101 << 1 = 1010 → 10

        // Right Shift
        System.out.println("x >> 1 = " + (x >> 1));  // 0101 >> 1 = 0010 → 2

        // Unsigned Right Shift
        System.out.println("x >>> 1 = " + (x >>> 1)); // 0101 >>> 1 = 0010 → 2
        }
    }

