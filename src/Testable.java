import java.lang.annotation.*;

/**
 * Created by chamz on 2017-03-14.
 */
@Inherited
@Target({ElementType.ANNOTATION_TYPE,ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Testable {

}
