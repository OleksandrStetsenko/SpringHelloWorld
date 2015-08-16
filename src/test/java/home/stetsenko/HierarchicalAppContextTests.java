package home.stetsenko;

import home.stetsenko.util.Constants;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class HierarchicalAppContextTests {



    @Test
    public void testXML() {
        GenericXmlApplicationContext parentContext = new GenericXmlApplicationContext();
        parentContext.load("parent.xml");
        parentContext.refresh();

        GenericXmlApplicationContext childContext = new GenericXmlApplicationContext();
        childContext.load("child.xml");
        //set parent context
        childContext.setParent(parentContext);
        childContext.refresh();

        SimpleTarget target1 = childContext.getBean("target1", SimpleTarget.class);
        SimpleTarget target2 = childContext.getBean("target2", SimpleTarget.class);
        SimpleTarget target3 = childContext.getBean("target3", SimpleTarget.class);

        assertEquals(Constants.BEAN_IN_PARENT, target1.getValue());
        assertEquals(Constants.BEAN_IN_CHILD, target2.getValue());
        assertEquals(Constants.BEAN_IN_PARENT, target3.getValue());
    }

    @Test
    @Ignore
    public void testAnnotation() {
        //TODO: find how to manage hierarchical beans with annotations
//        GenericXmlApplicationContext parentContext = new GenericXmlApplicationContext();
//        parentContext.load("parent.xml");
//        parentContext.refresh();
//
//        GenericXmlApplicationContext childContext = new GenericXmlApplicationContext();
//        childContext.load("app-context-annotation.xml");
//        //set parent context
//        childContext.setParent(parentContext);
//        childContext.refresh();
//
//        SimpleTarget target1 = childContext.getBean("target1", SimpleTarget.class);
//
//        assertEquals(Constants.BEAN_IN_PARENT, target1.getValue());
    }

}
