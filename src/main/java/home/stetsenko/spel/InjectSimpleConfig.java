package home.stetsenko.spel;

import home.stetsenko.util.Constants;
import org.springframework.stereotype.Component;

//use @Component instead of @Service for config, but it is the same
@Component("injectSimpleConfig")
public class InjectSimpleConfig {

    private String name = Constants.SPEL_USERNAME;
    private int age = Constants.SPEL_AGE;
    private boolean programmer = true;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }
}
