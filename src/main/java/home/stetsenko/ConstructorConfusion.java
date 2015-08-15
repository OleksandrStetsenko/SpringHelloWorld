package home.stetsenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusion {

    private String someValue;


    //Only one constructor can have @Autowired annotation
    //Bad style using @Value. Just for example.
    //Better to create new bean at app-context-annotation.xml like "message" bean
    @Autowired
    public ConstructorConfusion(@Value("90")String someValue) {
        this.someValue = "String: " +  someValue;
    }

    public ConstructorConfusion(int someValue) {
        this.someValue = "int: " +  someValue;
    }

    public String getSomeValue() {
        return someValue;
    }

    @Override
    public String toString() {
        return "ConstructorConfusion{" +
                "someValue='" + someValue + '\'' +
                '}';
    }
}
