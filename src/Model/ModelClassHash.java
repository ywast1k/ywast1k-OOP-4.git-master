package Model;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel { // имплементируем в гет модель
    private HashMap<Integer, Student> students;     // создаем HashMap

    public ModelClassHash() {               
        this.students = new HashMap<>();
    }

    @Override
    public List<Student> getAllStudents() {         
        return students.values().stream().collect(Collectors.toList()); // возвращение коллекции студентов
    }

}