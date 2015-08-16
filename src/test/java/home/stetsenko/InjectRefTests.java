package home.stetsenko;

import home.stetsenko.ref.InjectRef;
import home.stetsenko.ref.Oracle;
import home.stetsenko.util.Constants;
import home.stetsenko.util.SpringHelper;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class InjectRefTests {

    @Test
    public void testXML() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-xml.xml");

        InjectRef injectRef = context.getBean("injectRef", InjectRef.class);
        Oracle oracle = injectRef.getOracle();
        assertEquals(Constants.USE_INTERNET, oracle.defineMeaningOfLife());
    }

    @Test
    public void testAnnotation() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-annotation.xml");

        InjectRef injectRef = context.getBean("injectRef", InjectRef.class);
        Oracle oracle = injectRef.getOracle();
        assertEquals(Constants.USE_INTERNET, oracle.defineMeaningOfLife());
    }
}
