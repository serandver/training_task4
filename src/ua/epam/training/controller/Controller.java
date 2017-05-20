package ua.epam.training.controller;

import ua.epam.training.model.EntrantsQueue;
import ua.epam.training.model.entrants.EntrantCrowd;
import ua.epam.training.view.View;

public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {
        view.printMessage(View.ON_STARTUP_MESSAGE);

        EntrantCrowd entrants = new EntrantCrowd();
        EntrantsQueue queue = new EntrantsQueue();

        EntrantsProducer producer = new EntrantsProducer(entrants, queue, view);
        EntrantsConsumer consumer = new EntrantsConsumer(queue, view);

        producer.start();
        consumer.start();

    }
}
