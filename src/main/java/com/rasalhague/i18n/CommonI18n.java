package com.rasalhague.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Locale;
import java.util.ResourceBundle;

@Service
public class CommonI18n {
    private static final Logger logger = LoggerFactory.getLogger(CommonI18n.class);

    @PostConstruct
    private void commonI18n() {
//        Locale currentLocale = new Locale("en", "US");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", Locale.ENGLISH);
//        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", Locale.FRANCE);

        logger.info(messages.getString("greetings"));
        logger.info(messages.getString("inquiry"));
        logger.info(messages.getString("farewell"));
    }
}
