import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.Domain.Student;
import View.ViewClass;

public class App {
    public static void main(String[] args) {

       

        Student student1 = new Student("Mikael", 24);
        Student student2 = new Student("Sanni", 19);
        Student student3 = new Student("Luisa", 18);
        Student student4 = new Student("Miron", 15);
        Student student5 = new Student("Franchesco", 20);
        Student student6 = new Student("Musse", 17);
        Student student7 = new Student("Mikae", 20);
        Student student8 = new Student("Sann", 19);
        Student student9 = new Student("Luis", 20);
        Student student10 = new Student("Miro", 20);
        Student student11 = new Student("Franch", 20);
        Student student12 = new Student("Muss", 17);
        /**
     *  Добавление в список элементов
     */
    List<Student> students = new ArrayList<Student>();
        

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);


        ModelClassFile fmClass = new ModelClassFile("StudentDB.csv");
        //  fmClass.saveAllStudentToFile(students);  сохранение первое для создания файла
        iGetView view = new ViewClass();
        iGetModel model = new ModelClass(students);

       ControllerClass controller = new ControllerClass(fmClass, view);
        
       // controller.update();
        controller.run();
    }
}