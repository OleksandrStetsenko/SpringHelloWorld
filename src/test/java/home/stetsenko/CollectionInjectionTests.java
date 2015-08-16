package home.stetsenko;

import home.stetsenko.collections.CollectionInjection;
import home.stetsenko.ref.Oracle;
import home.stetsenko.util.Constants;
import home.stetsenko.util.SpringHelper;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CollectionInjectionTests {

    @Test
    public void testXML() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-xml.xml");
        CollectionInjection injectionCollection = context.getBean("injectionCollection", CollectionInjection.class);
        Map<String, Object> actualMap = injectionCollection.getMap();
        Map<String, Object> expectedMap = new HashMap<String, Object>();
        expectedMap.put("someValue", Constants.HELLO_WORLD);
        expectedMap.put("someBean", context.getBean("oracle", Oracle.class));

        assertEquals(expectedMap, actualMap);
    }

    @Test
    public void testAnnotations() {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-annotation.xml");
        CollectionInjection injectionCollection = context.getBean("injectionCollection", CollectionInjection.class);
        Map<String, Object> actualMap = injectionCollection.getMap();
        Map<String, Object> expectedMap = new HashMap<String, Object>();
        expectedMap.put("someValue", Constants.HELLO_WORLD);
        expectedMap.put("someBean", context.getBean("oracle", Oracle.class));

        assertEquals(expectedMap, actualMap);
    }

}
