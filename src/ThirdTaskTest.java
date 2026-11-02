import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ThirdTaskTest {
    @ParameterizedTest
    @MethodSource("testDigitsArgs")
    void testMoney(int expected, String in) {
        Assertions.assertEquals(expected, ThirdTask.digits(in);
    }

    static Stream<Arguments> testDigitsArgs() {
        return Stream.of(
                Arguments.of(0, "abc"),
                Arguments.of(3, "a1b23"),
                Arguments.of(4, "2024"),
                Arguments.of(0, "")
        );
    }
}