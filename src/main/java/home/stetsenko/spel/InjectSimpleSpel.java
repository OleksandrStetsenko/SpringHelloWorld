package home.stetsenko.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpel")
public class InjectSimpleSpel {

    @Value("#{injectSimpleConfig.name}")
    private String name;

    @Value("#{injectSimpleConfig.age + 1}")
    private int age;

    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isProgrammer() {
        return programmer;
    }
}
