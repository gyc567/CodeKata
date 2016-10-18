/**
 * Created by eric567 on 1/9/2016.
 */
public class FizzMatcher implements Matcher {

    @Override
    public boolean match(int number) {
        return number % 3 == 0;
    }
}
