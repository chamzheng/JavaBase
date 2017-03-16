package com.qianlaofei.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * Created by chamz on 2017-03-14.
 */

@Tag(name = "client")
public class Client {
    @Test
    public void client(){
        new SubClass();
    }

    @Test
    public void client2() throws NoSuchMethodException {
        Annotation[] annotations = this.getClass().getMethod("client2").getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }
    }

    @Test
    public void client3() throws NoSuchMethodException {
        Annotation[] annotations = Client.class.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Tag) {
                Tag tag = (Tag) annotation;
                System.out.println("name: " + tag.name());
                System.out.println("description: " + tag.description());
            }
        }
    }
}

@Testable
class SupperClass{

}

class SubClass extends SupperClass{
    public SubClass() {
        for (Annotation annotation : SubClass.class.getAnnotations()) {
            System.out.println(annotation);
        }
    }
}
