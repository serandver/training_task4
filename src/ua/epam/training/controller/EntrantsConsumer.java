package ua.epam.training.controller;

import ua.epam.training.model.EntrantsQueue;
import ua.epam.training.model.institute.BaseInstitute;
import ua.epam.training.model.institute.BiologyInstitute;
import ua.epam.training.model.institute.MathInstitute;
import ua.epam.training.model.institute.UniversalInstitute;
import ua.epam.training.view.View;

import java.util.concurrent.BlockingQueue;

public class EntrantsConsumer extends Thread{
    private BlockingQueue queue;
    private BaseInstitute mathInstituteStudents;
    private BaseInstitute biologyInstituteStudents;
    private BaseInstitute universalInstituteStudents;
    private View view;

    public EntrantsConsumer(EntrantsQueue entrantsQueue, View view) {
        this.queue = entrantsQueue.getQueue();
        this.view = view;
        mathInstituteStudents = new MathInstitute();
        biologyInstituteStudents = new BiologyInstitute();
        universalInstituteStudents = new UniversalInstitute();
    }

    @Override
    public void run() {
        waitForFirstEntrants();

        while(!queue.isEmpty()) {
            try {
                mathInstituteStudents.applyStudent(queue);
                sleep(20);
                biologyInstituteStudents.applyStudent(queue);
                sleep(20);
                universalInstituteStudents.applyStudent(queue);
                sleep(20);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        view.printMessage(View.MATH_INSTITUTE_STUDENTS_AMOUNT + getMathInstituteStudents().getStudents().size());
        view.printMessage(View.BIOLOGY_INSTITUTE_STUDENTS_AMOUNT + getBiologyInstituteStudents().getStudents().size());
        view.printMessage(View.UNIVERSAL_INSTITUTE_STUDENTS_AMOUNT + getUniversalInstituteStudents().getStudents().size());
        view.printMessage("sum " +(getMathInstituteStudents().getStudents().size() +
                getBiologyInstituteStudents().getStudents().size() +
                getUniversalInstituteStudents().getStudents().size()));
    }

    private void waitForFirstEntrants() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private BaseInstitute getMathInstituteStudents() {
        return mathInstituteStudents;
    }

    private BaseInstitute getBiologyInstituteStudents() {
        return biologyInstituteStudents;
    }

    private BaseInstitute getUniversalInstituteStudents() {
        return universalInstituteStudents;
    }
}
