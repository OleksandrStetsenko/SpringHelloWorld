package home.stetsenko.util;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringHelper {

    public static GenericXmlApplicationContext getContext(String s) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load(s);
        context.refresh();

        return context;
    }

}
