package org.webonise.appleinformationprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static final String HEAVY = "\t|HEAVY|";
    private static final String LIGHT = "\t|LIGHT|";
    private static final String RED = "Red";
    private static final String GREEN = "Green";
    private static final List<Apple> APPLEBASKET = new ArrayList<Apple>();
    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    private void populateBasket() {
        APPLEBASKET.add(new Apple(GREEN, 15));
        APPLEBASKET.add(new Apple(RED, 25));
        APPLEBASKET.add(new Apple(GREEN, 35));
        APPLEBASKET.add(new Apple(RED, 30));
        APPLEBASKET.add(new Apple(RED, 20));
        APPLEBASKET.add(new Apple(GREEN, 10));
    }

    public void start() {
        populateBasket();
        prettyPrintApples(apple -> {
            LOGGER.log(Level.INFO, apple.toString());
        });
        prettyPrintApples(apple -> {
            LOGGER.log(Level.INFO, ((apple.getWeight() > 20) ? (apple + HEAVY) : (apple + LIGHT)));
        });
    }

    private void prettyPrintApples(AppleInformationProvider informationProvider) {
        APPLEBASKET.stream().forEach((apple -> {
            informationProvider.prettyPrintApple(apple);
        }));
    }
}
