package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringLearnApplication {

    // Step 1: Logger setup
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void displayDate() {
        LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            Date date = format.parse("31/12/2018");
            LOGGER.debug("Parsed Date: {}", date);
        } catch (Exception e) {
            LOGGER.error("Error parsing date: {}", e.getMessage());
        }

        LOGGER.info("END");
    }

    public static void main(String[] args) {
        LOGGER.info("Application START");
        displayDate();  // Call the method to test output
        LOGGER.info("Application END");
    }
}
