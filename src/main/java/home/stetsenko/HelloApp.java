package home.stetsenko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("app-context-xml.xml");
        //MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("app-context-annotation.xml");
        context.refresh();

        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }
}
