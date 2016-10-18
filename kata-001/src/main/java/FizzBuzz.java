public class FizzBuzz {
    public final static int it=0;

    /**
     * This method accepts the numbers from 1 to 100 and returns them as a String.
     * But for multiples of three it returns the String "Fizz" instead of the number and for the
     * multiples of five it returns the String "BuzzMatcher". For numbers which are multiples of both
     * three and five the method returns the String "FizzBuzz".
     *
     * @param number a number from 1 to 100
     * @return a String representing the number or the Strings "Fizz", "BuzzMatcher" and "FizzBuzz"
     * as described above
     * @throws IllegalArgumentException if the number is not in the 1-100 range.
     */
    public String toFizzBuzzString(int number) {
        if (new FizzBuzzMatcher().match(number))
            return "FizzBuzz";
        if (new FizzMatcher().match(number))
            return "Fizz";
        if (new BuzzMatcher().match(number))
            return "Buzz";
        if (new NormalMatcher().match(number))
            return "" + number;



        return "";
    }



}
