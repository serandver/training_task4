package ua.epam.training.model;

import ua.epam.training.model.entrants.Entrant;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class EntrantsQueue {
    private BlockingQueue<Entrant> queue;

    public EntrantsQueue() {
        queue = new ArrayBlockingQueue<Entrant>(50);
    }

    public BlockingQueue<Entrant> getQueue() {
        return queue;
    }
}
