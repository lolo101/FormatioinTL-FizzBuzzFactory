import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class FizzBuzzIter2Test
{
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 6, 8})
    void should_return_input_number(int n) {
        assertEquals(String.valueOf(n),
            new FizzBuzzIter1(n).convert2());
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 14, 21})
    void should_return_fizz_when_divisible_by_7_and_not_by_11(int n) {
        assertEquals("Fizz",
            new FizzBuzzIter1(n).convert2());
    }

    @ParameterizedTest
    @ValueSource(ints = {11, 22, 33})
    void should_return_buzz_when_divisible_by_11_and_not_by_7(int n) {
        assertEquals("Buzz",
            new FizzBuzzIter1(n).convert2());
    }

    @ParameterizedTest
    @ValueSource(ints = {77, 154})
    void should_return_FizzBuzz_when_divisible_by_7_and_11(int n) {
        assertEquals("FizzBuzz",
            new FizzBuzzIter1(n).convert2());
    }
}
