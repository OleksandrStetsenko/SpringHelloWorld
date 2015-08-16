package home.stetsenko;

import home.stetsenko.spel.InjectSimpleSpel;
import home.stetsenko.util.Constants;
import home.stetsenko.util.SpringHelper;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class InjectSpelTests {

    @Test
    public void testXML() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-xml.xml");

        InjectSimpleSpel injectSimpleSpel = context.getBean("injectSimpleSpel",
                InjectSimpleSpel.class);

        assertEquals(Constants.SPEL_USERNAME, injectSimpleSpel.getName());
        assertEquals(Constants.SPEL_AGE + 1, injectSimpleSpel.getAge());
    }

    @Test
    public void testAnnotation() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-annotation.xml");

        InjectSimpleSpel injectSimpleSpel = context.getBean("injectSimpleSpel",
                InjectSimpleSpel.class);

        assertEquals(Constants.SPEL_USERNAME, injectSimpleSpel.getName());
        assertEquals(Constants.SPEL_AGE + 1, injectSimpleSpel.getAge());
    }

}
