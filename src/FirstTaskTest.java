import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FirstTaskTest {
    @ParameterizedTest
    @MethodSource("testDigitsArgs")
    void testDigits(int expected, String string) {
        Assertions.assertEquals(expected, FirstTask.digits(string));
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