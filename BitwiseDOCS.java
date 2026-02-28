package Java_Programs;

public interface BitwiseDOCS {
    public static void main(String[] args) {

        int a = 10;
        int b = a & 1; // AND Operator. If both bits are 1, then result is 1.
        int c = a | 2; // OR Operator. If any bit is 1, then result is 1.
        int d = a ^ 3; // XOR Operator. If both bits are different, then result is 1.
        int e = ~a; // NOT Operator. 1 -> 0 && 0 -> 1. => Change sign and subtract 1.
        int f = a << 1; // LEFT SHIFT Operator. Shifts bit one position to left. a<<b = a* Math.pow(2,b)
        int g = a >> 2; // RIGHT SHIFT Operator. Shifts bit one position to right. a>>b =
                        // a/Math.pow(2,b). IF a= -ve, (a/pow(2,b)) - 1
        int h = a >>> 2; // UNSIGNED RIGHT SHIFT Operator.

        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("h: " + h);
    }
}
