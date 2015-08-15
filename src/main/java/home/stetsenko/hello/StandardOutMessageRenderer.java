package home.stetsenko.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider provider = null;

    @Override
    public void render() {
        if (provider == null) {
            throw new RuntimeException("Set provider!");
        } else {
            System.out.println(provider.getMessage());
        }
    }

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

