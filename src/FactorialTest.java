import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @ParameterizedTest
    @MethodSource("testFactorialLongArgs")
    void testFactorialLong(long expected, long n) {
        Assertions.assertEquals(expected, Factorial.fact(n));
    }

    static Stream<Arguments> testFactorialLongArgs() {
        return Stream.of(
                Arguments.of(1L, 0L),
                Arguments.of(1L, 1L),
                Arguments.of(2L, 2L),
                Arguments.of(2_432_902_008_176_640_000L, 20L)
        );
    }

    @ParameterizedTest
    @MethodSource("testFactorialBigIntegerArgs")
    void testFactorialBigInteger(BigInteger expected, BigInteger n) {
        Assertions.assertEquals(expected, Factorial.fact(n));
    }

    static Stream<Arguments> testFactorialBigIntegerArgs() {
        return Stream.of(
                Arguments.of(BigInteger.ONE, BigInteger.ZERO),
                Arguments.of(BigInteger.ONE, BigInteger.ONE),
                Arguments.of(BigInteger.TWO, BigInteger.TWO),
                Arguments.of(BigInteger.valueOf(2_432_902_008_176_640_000L), BigInteger.valueOf(20L))
        );
    }
}