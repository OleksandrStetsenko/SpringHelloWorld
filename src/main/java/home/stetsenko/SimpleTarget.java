package home.stetsenko;

import org.apache.log4j.Logger;

//for hierarchical app contexts
public class SimpleTarget {

    private static final Logger LOGGER = Logger.getLogger(SimpleTarget.class);
    private  String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
