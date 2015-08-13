package home.stetsenko;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("app-context-annotation.xml");
        context.refresh();

        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }
}
