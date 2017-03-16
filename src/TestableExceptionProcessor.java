/**
 * Created by chamz on 2017-03-15.
 */
public class TestableExceptionProcessor {
    public static void process(String clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        int passed = 0;
        int failed = 0;
        Object object = Class.forName(clazz).newInstance();

    }


}
