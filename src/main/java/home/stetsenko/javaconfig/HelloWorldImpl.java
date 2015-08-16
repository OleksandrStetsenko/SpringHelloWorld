package home.stetsenko.javaconfig;

import home.stetsenko.util.Constants;
import org.apache.log4j.Logger;

public class HelloWorldImpl implements HelloWorld {

    private static final Logger LOGGER = Logger.getLogger(HelloWorldImpl.class);

    @Override
    public String sayHello() {
        return Constants.HELLO_WORLD;
    }

}
