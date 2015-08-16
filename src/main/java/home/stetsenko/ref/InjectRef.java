package home.stetsenko.ref;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("injectRef")
public class InjectRef {

    private static final Logger LOGGER = Logger.getLogger(InjectRef.class);
    private Oracle oracle;

    public Oracle getOracle() {
        return oracle;
    }

    @Autowired
    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }
}
