package ua.epam.training.model.institute;

import ua.epam.training.model.entrants.Entrant;

import java.util.Iterator;
import java.util.Queue;

public class UniversalInstitute extends BaseInstitute{
    @Override
    public void applyStudent(Queue<Entrant> queue) {
        int count = 0;
        Iterator<Entrant> iterator = queue.iterator();
        Entrant entrant;
        while (iterator.hasNext()) {
            if (count != 3) {
                entrant = iterator.next();
                getStudents().add(entrant);
                System.out.println("Universal institute applied new entrant: " + entrant);
                count++;
                iterator.remove();
            }
            else {
                return;
            }
        }
    }
}
