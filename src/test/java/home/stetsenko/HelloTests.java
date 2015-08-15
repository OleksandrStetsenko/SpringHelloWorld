package home.stetsenko;

import home.stetsenko.hello.MessageProvider;
import home.stetsenko.hello.MessageRenderer;
import home.stetsenko.util.SpringHelper;
import home.stetsenko.util.Constants;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HelloTests {

    @Test
    public void testXML() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-xml.xml");

        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        MessageProvider provider = renderer.getMessageProvider();
        assertNotNull(provider);
        String message = provider.getMessage();
        assertNotNull(message);
        assertEquals(Constants.XML_CONSTRUCTOR_MESSAGE, message);
    }

    @Test
    public void testAnnotation() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-annotation.xml");

        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        MessageProvider provider = renderer.getMessageProvider();
        assertNotNull(provider);
        String message = provider.getMessage();
        assertNotNull(message);
        assertEquals(Constants.ANNOTATION_CONSTRUCTOR_MESSAGE, message);
    }

}
