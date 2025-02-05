import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class FizzBuzzIter1Test {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8})
    void should_return_input_number(int n) {
        assertEquals(String.valueOf(n),
            new FizzBuzzIter1(n).convert1());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 33, 333})
    void should_return_fizz_when_divisible_by_3_and_not_by_5(int n) {
        assertEquals("Fizz",
            new FizzBuzzIter1(n).convert1());
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 25})
    void should_return_buzz_when_divisible_by_5_and_not_by_3(int n) {
        assertEquals("Buzz",
            new FizzBuzzIter1(n).convert1());
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void should_return_FizzBuzz_when_divisible_by_5_and_3(int n) {
        assertEquals("FizzBuzz",
            new FizzBuzzIter1(n).convert1());
    }
}
