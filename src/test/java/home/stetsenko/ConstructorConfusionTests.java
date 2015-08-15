package home.stetsenko;

import home.stetsenko.util.Constants;
import home.stetsenko.util.SpringHelper;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class ConstructorConfusionTests {

    @Test
    public void testXML() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-xml.xml");

        ConstructorConfusion constructorConfusion = context.getBean("constructorConfusion",
                ConstructorConfusion.class);

        String value = constructorConfusion.getSomeValue();
        assertEquals(Constants.ANNOTATION_CONFUSION_INT, value);
    }

    @Test
    public void testAnnotation() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-annotation.xml");

        ConstructorConfusion constructorConfusion = context.getBean("constructorConfusion",
                ConstructorConfusion.class);

        String value = constructorConfusion.getSomeValue();
        assertEquals(Constants.XML_CONFUSION_STRING, value);
    }

}
