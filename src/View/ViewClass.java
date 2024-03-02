package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {
    public void printAllSrudent(List<Student> student)
    {
        System.out.println("------------------Список студентов---------------");
        for(Student s: student)
        {
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------");
    }
// Ввод от пользователя
// msg - вывод сообщения 
    public String prompt(String msg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
