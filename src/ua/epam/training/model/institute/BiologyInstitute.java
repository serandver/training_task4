package ua.epam.training.model.institute;

import ua.epam.training.model.entrants.Entrant;
import ua.epam.training.model.entrants.EntrantSpeciality;

import java.util.Iterator;
import java.util.Queue;

public class BiologyInstitute extends BaseInstitute {
    @Override
    public void applyStudent(Queue<Entrant> queue) {
        Iterator<Entrant> iterator = queue.iterator();
        Entrant entrant;

        while (iterator.hasNext()) {
            entrant = iterator.next();
            if (entrant.getSpeciality() == EntrantSpeciality.BIOLOGIST) {
                getStudents().add(entrant);
                System.out.println("Biology institute applied new entrant: " + entrant);
                iterator.remove();
            }
            else {
                return;
            }
        }
    }
}
