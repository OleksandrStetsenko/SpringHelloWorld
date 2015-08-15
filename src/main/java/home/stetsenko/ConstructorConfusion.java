package home.stetsenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusion {

    private String someValue;


    //bad style using @Value. Just for example
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
