package home.stetsenko.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloMessageProvider implements MessageProvider {

    private  String message;

    //message will be automatically injected form value of "message" bean from app-context-annotation.xml
    //this is constructor injection
    @Autowired
    public HelloMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
