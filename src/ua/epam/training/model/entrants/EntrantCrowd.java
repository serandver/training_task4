package ua.epam.training.model.entrants;

import java.util.*;

public class EntrantCrowd {

    private List<Entrant> entrants;

    private void initEntrants() {
        for (int i = 0; i < 200; i++) {
            entrants.add(new Entrant(EntrantSpeciality.BIOLOGIST));
        }
        for (int i = 0; i < 250; i++) {
            entrants.add(new Entrant(EntrantSpeciality.MATHEMATICIAN));
        }
        Collections.shuffle(entrants);
    }

    public EntrantCrowd() {
        entrants = new ArrayList<>();
        initEntrants();
    }

    public List<Entrant> getEntrants() {
        return entrants;
    }
}
