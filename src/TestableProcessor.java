import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chamz on 2017-03-14.
 */
public class TestableProcessor {

    public static void process(String clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        int passed = 0;
        int failed = 0;
        Object object = Class.forName(clazz).newInstance();
        for (Method method : Class.forName(clazz).getMethods()) {
            if (method.isAnnotationPresent(Testable.class)) {
                try {
                    method.invoke(object);
                    ++passed;
                }catch (IllegalAccessException | InvocationTargetException ex) {
                    System.out.println("method " + method.getName() + " execute error: < " + ex.getCause() + ">");
                    ex.printStackTrace(System.out);
                    ++failed;
                }
            }
        }
        System.out.println("共运行" + (failed + passed) + "个方法，成功" + passed + "个，失败" + failed + "个");
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        TestableProcessor.process("TestCase");
    }
}
