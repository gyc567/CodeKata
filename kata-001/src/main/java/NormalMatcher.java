/**
 * Created by eric567 on 1/9/2016.
 */
public class NormalMatcher implements Matcher {
    @Override
    public boolean match(int number) {
        return number % 2 == 0 || number % 2 == 1;
    }
}
