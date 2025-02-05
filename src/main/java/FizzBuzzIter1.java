public class FizzBuzzIter1 {

    private final int input;
    private boolean divisibleByFizzNumber;
    private boolean divisibleByBuzzNumber;

    public FizzBuzzIter1(int input) {
        this.input = input;
    }

    public String convert1() {
        boolean divisibleBy3 = isDivisibleBy(3);
        boolean divisibleBy5 = isDivisibleBy(5);
        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz";
        }
        if (divisibleBy3) {
            return "Fizz";
        }
        if (divisibleBy5) {
            return "Buzz";
        }
        return String.valueOf(input);
    }

    public String convert2() {
        divisibleByFizzNumber = isDivisibleBy(7);
        divisibleByBuzzNumber = isDivisibleBy(11);
        if (divisibleByFizzNumber && divisibleByBuzzNumber) {
            return "FizzBuzz";
        }
        if (divisibleByFizzNumber) {
            return "Fizz";
        }
        if (divisibleByBuzzNumber) {
            return "Buzz";
        }
        return String.valueOf(input);
    }

    private boolean isDivisibleBy(int i) {
        return input % i == 0;
    }
}
