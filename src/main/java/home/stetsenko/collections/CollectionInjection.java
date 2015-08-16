package home.stetsenko.collections;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.annotation.Resource;

@Service(value = "injectionCollection")
public class CollectionInjection {

    private static final Logger LOGGER = Logger.getLogger(CollectionInjection.class);

    //if you write @Autowired annotation, then Spring collect all beans from context and
    //put they into new collection. This is unexpected result. So, use @Resource annotation
    @Resource(name = "map")
    private Map<String, Object> map;

    @Resource(name = "props")
    private Properties props;

    @Resource(name = "set")
    private Set set;

    @Resource(name = "list")
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
