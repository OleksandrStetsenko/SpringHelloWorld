package home.stetsenko;


import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello, World";
    }
}
