import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SecondTaskTest {
    @ParameterizedTest
    @MethodSource("testMoneyArgs")
    void testMoney(int expected, int n, int first, int difference) {
        Assertions.assertEquals(expected, SecondTask.money(n, first, difference));
    }

    static Stream<Arguments> testMoneyArgs() {
        return Stream.of(
                Arguments.of(15, 3, 3, 4),
                Arguments.of(4, 3, 10, -2),
                Arguments.of(80085, 0, 80085, 0)
        );
    }
}