package home.stetsenko;

import home.stetsenko.util.Constants;
import home.stetsenko.util.SpringHelper;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class InjectSimpleTests {

    @Test
    public void testXML() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-xml.xml");

        InjectSimple injectSimple = context.getBean("injectSimple",
                InjectSimple.class);

        String value = injectSimple.getName();
        assertEquals(Constants.JOHN_SMITH, value);
    }

    @Test
    public void testAnnotation() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-annotation.xml");

        InjectSimple injectSimple = context.getBean("injectSimple",
                InjectSimple.class);

        String value = injectSimple.getName();
        assertEquals(Constants.OLEKSANDR_STETSENKO, value);
    }

}
