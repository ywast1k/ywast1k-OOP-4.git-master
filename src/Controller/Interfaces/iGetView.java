package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {
    void printAllSrudent(List<Student> students);
    public String prompt(String msg);
}
