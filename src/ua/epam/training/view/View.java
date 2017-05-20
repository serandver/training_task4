package ua.epam.training.view;

public class View {
    public static final String ON_STARTUP_MESSAGE = "Admission Committee has been opened.";
    public static final String BIOLOGY_INSTITUTE_STUDENTS_AMOUNT = "Students in biology institute: ";
    public static final String MATH_INSTITUTE_STUDENTS_AMOUNT = "Students in math institute: ";
    public static final String UNIVERSAL_INSTITUTE_STUDENTS_AMOUNT = "Students in universal institute: ";
    public static final String ENTRANT_ADD_TO_QUEUE = "New Entrant was added to queue: ";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
