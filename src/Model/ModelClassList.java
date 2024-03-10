package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassList implements iGetModel {

    private List<Model.Domain.Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String delStudent(int num) { // метод удаления студента из списка
    if (num>students.size()) {
        return "Такого студента нет в списке";
    }
    else {
        System.out.println("Студент " +students.get(num) + " удален из списка");
        students.remove(num);
        return "удалено";
    }



    }
}
