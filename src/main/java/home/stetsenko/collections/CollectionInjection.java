package home.stetsenko.collections;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {

    private static final Logger LOGGER = Logger.getLogger(CollectionInjection.class);

    private Map<String, Object> map;
    private Properties props;
    private Set set;
    private List list;

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public Properties getProps() {
        return props;
    }

    public Set getSet() {
        return set;
    }

    public List getList() {
        return list;
    }
}
