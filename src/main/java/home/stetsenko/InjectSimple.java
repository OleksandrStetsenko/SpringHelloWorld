package home.stetsenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {

    //Autowired in field instead of method. Both variants are available
    @Autowired
    private String name;

    //Hardcoded value. Bad style. But how create bean for simple types?
    @Value("27")
    private int age;

    //Hardcoded value. Bad style
    @Value("true")
    private boolean programmer;

    public void setName(String name) {
        this.name = name;
    }

    //autowired in setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "InjectSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", programmer=" + programmer +
                '}';
    }
}
