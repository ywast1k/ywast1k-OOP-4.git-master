package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.HashMap;
import java.util.List;
/*
Класс ModelClassHash где список студентов хранится в виде коллекции HashMap
 */
public class ModelClassHash implements iGetModel {

    private HashMap<Long, Student> students; //

    public ModelClassHash(HashMap<Long, Student> students) {
        this.students = students;
    }


    @Override
    public List<Student> getStudents() {
        return (List<Student>) students.values(); // метод возвращает List<Student> , преобразуя его из HashMap
    }

    @Override
    public String delStudent(int num) {
        return null;
    }

}
