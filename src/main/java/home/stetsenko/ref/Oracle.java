package home.stetsenko.ref;

import home.stetsenko.util.Constants;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("oracle")
public class Oracle {

    private static final Logger LOGGER = Logger.getLogger(Oracle.class);

    public String defineMeaningOfLife() {
        return Constants.USE_INTERNET;
    }

}
