package com.cognizant.springlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

        public static void main(String[] args) {
            LOGGER.debug("START of main()");
            // displayCountry();       // existing single bean load
            displayCountries();     // new list of beans
            LOGGER.debug("END of main()");
        }

public static void displayCountry() {
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country country = context.getBean("country", Country.class);
    Country anotherCountry = context.getBean("country", Country.class);

    LOGGER.debug("Country: {}", country);
    LOGGER.debug("Another Country: {}", anotherCountry);
    LOGGER.debug("Are both objects same? {}", country == anotherCountry);
}
    public static void displayCountries() {
        LOGGER.debug("START displayCountries()");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        LOGGER.debug("Country List: {}", countryList);

        LOGGER.debug("END displayCountries()");
    }


}
