package ua.epam.training.controller;

import ua.epam.training.model.EntrantsQueue;
import ua.epam.training.model.entrants.Entrant;
import ua.epam.training.model.entrants.EntrantCrowd;
import ua.epam.training.view.View;

public class EntrantsProducer extends Thread{
    private EntrantCrowd entrants;
    private EntrantsQueue queue;
    private View view;

    public EntrantsProducer(EntrantCrowd entrants, EntrantsQueue queue, View view) {
        this.entrants = entrants;
        this.queue = queue;
        this.view = view;
    }

    @Override
    public void run() {
        while(!entrants.getEntrants().isEmpty()) {
            if(queue.getQueue().size() < 25) {
                while(queue.getQueue().size() != 50){
                    if(entrants.getEntrants().isEmpty()) {
                        return;
                    }
                    Entrant entrant = entrants.getEntrants().get(0);
                    queue.getQueue().add(entrant);
                    view.printMessage(View.ENTRANT_ADD_TO_QUEUE + entrant);
                    entrants.getEntrants().remove(entrant);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
