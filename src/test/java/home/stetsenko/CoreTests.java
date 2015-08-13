package home.stetsenko;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CoreTests {

    private static final String XML_CONSTRUCTOR_MESSAGE = "This is constructor message - xml";
    private static final String ANNOTATION_CONSTRUCTOR_MESSAGE = "This is constructor message - annotation";

    @Test
    public void testXML() {
        GenericXmlApplicationContext context = getContext("app-context-xml.xml");

        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        MessageProvider provider = renderer.getMessageProvider();
        assertNotNull(provider);
        String message = provider.getMessage();
        assertNotNull(message);
        assertEquals(message, XML_CONSTRUCTOR_MESSAGE);
    }

    @Test
    public void testAnnotation() {
        GenericXmlApplicationContext context = getContext("app-context-annotation.xml");

        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        MessageProvider provider = renderer.getMessageProvider();
        assertNotNull(provider);
        String message = provider.getMessage();
        assertNotNull(message);
        assertEquals(message, ANNOTATION_CONSTRUCTOR_MESSAGE);
    }

    private GenericXmlApplicationContext getContext(String s) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load(s);
        context.refresh();
        return context;
    }

}
