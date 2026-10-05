import java.math.BigInteger;

public class Factorial {
    static BigInteger fact(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) < 1) return BigInteger.ONE;
        return fact(n.subtract(BigInteger.ONE)).multiply(n);
    }

    static long fact(long n) {
        if (n <= 1) return 1;
        return fact(n - 1) * n;
    }
}
