package home.stetsenko.javaconfig;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    private static final Logger LOGGER = Logger.getLogger(JavaConfig.class);

    @Bean(name = "helloBean")
    public HelloWorld getHelloWorld() {
        return new HelloWorldImpl();
    }

}
