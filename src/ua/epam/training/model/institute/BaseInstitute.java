package ua.epam.training.model.institute;

import ua.epam.training.model.entrants.Entrant;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public abstract class BaseInstitute {
    private List<Entrant> students = new ArrayList<>();

    public abstract void applyStudent(Queue<Entrant> queue);

    public List<Entrant> getStudents() {
        return students;
    }
}
