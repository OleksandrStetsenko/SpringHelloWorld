package home.stetsenko.hello;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider provider = null;
    private static final Logger LOGGER = Logger.getLogger(StandardOutMessageRenderer.class);

    @Override
    public void render() {
        if (provider == null) {
            throw new RuntimeException("Set provider!");
        } else {
            LOGGER.info(provider.getMessage());
        }
    }

    //this is setter injection
    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return provider;
    }
}

