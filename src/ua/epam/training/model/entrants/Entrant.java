package ua.epam.training.model.entrants;

public class Entrant {
    private EntrantSpeciality speciality;

    public Entrant(EntrantSpeciality speciality) {
        this.speciality = speciality;
    }

    public EntrantSpeciality getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "Entrant{" +
                "speciality=" + speciality +
                '}';
    }
}
