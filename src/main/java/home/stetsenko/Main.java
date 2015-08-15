package home.stetsenko;

import home.stetsenko.hello.MessageRenderer;
import home.stetsenko.util.SpringHelper;
import org.apache.log4j.Logger;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        GenericXmlApplicationContext context = SpringHelper.getContext("app-context-xml.xml");

        //renderer
        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();

        //constructor confusion
        ConstructorConfusion constructorConfusion = context.getBean("constructorConfusion", ConstructorConfusion.class);
        LOGGER.info(constructorConfusion.getSomeValue());
    }

}
