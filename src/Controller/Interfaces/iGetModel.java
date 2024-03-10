package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
    public List<Student> getStudents(); // метод получения списка студентов
    public String delStudent (int num); // метод удаления студента
}
