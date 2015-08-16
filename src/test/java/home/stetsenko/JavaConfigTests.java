package home.stetsenko;

import home.stetsenko.javaconfig.HelloWorld;
import home.stetsenko.javaconfig.JavaConfig;
import home.stetsenko.util.Constants;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class JavaConfigTests {

    @Test
    public void testJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        HelloWorld helloBean = context.getBean("helloBean", HelloWorld.class);
        assertEquals(Constants.HELLO_WORLD, helloBean.sayHello());
    }

}
