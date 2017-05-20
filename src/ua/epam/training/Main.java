package ua.epam.training;

import ua.epam.training.controller.Controller;
import ua.epam.training.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        controller.processUser();
    }
}
