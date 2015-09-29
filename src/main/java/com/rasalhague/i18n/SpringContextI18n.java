package com.rasalhague.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class SpringContextI18n implements MessageSourceAware {

    private static final Logger logger = LoggerFactory.getLogger(SpringContextI18n.class);

    @Override
    public void setMessageSource(MessageSource messageSource) {
        logger.info("------------ USING Locale.ENGLISH through Spring ------------");
        logger.info(messageSource.getMessage("greetings", new Object[]{"%username%"}, Locale.ENGLISH));
        logger.info(messageSource.getMessage("inquiry", new Object[]{"%username%"}, Locale.ENGLISH));
        logger.info(messageSource.getMessage("farewell", new Object[]{"%username%"}, Locale.ENGLISH));

        logger.info("------------ USING Locale.FRANCE through Spring ------------");
        logger.info(messageSource.getMessage("greetings", new Object[]{"%username%"}, Locale.FRANCE));
        logger.info(messageSource.getMessage("inquiry", new Object[]{"%username%"}, Locale.FRANCE));
        logger.info(messageSource.getMessage("farewell", new Object[]{"%username%"}, Locale.FRANCE));
    }
}
