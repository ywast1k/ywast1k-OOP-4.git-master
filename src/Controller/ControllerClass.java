package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<Student>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs) {
        if (studs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {

        //MVP
        students = model.getStudents();

        if (testData(students)) {
            view.printAllSrudent(students);
        } else {
            System.out.println("Список студентов пуст!");
        }


        // MVC
        //view.printAllStudent(model.getStudents());
    }


    public void run() {
        Scanner in = new Scanner(System.in);
        Command com = Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllSrudent(model.getStudents());
                    break;
                case DELETE:
                    System.out.println("Введите номер студента на удаление");
                    int num = in.nextInt();
                    System.out.println(model.delStudent(num));

            }
        }
    }

}
