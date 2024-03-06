package Controller;

import java.util.ArrayList;
import java.util.List;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> bufferStudentList = new ArrayList<Student>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
        

    }

    private boolean testData(List<Student> students) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // MVC
        // view.printAllSrudent(model.getStudents());

        bufferStudentList = model.getAllStudents();
        if (testData(bufferStudentList)) {
            view.printAllSrudent(bufferStudentList);
        } else {
            System.out.println("Список студентов пуст!");
        }

    }

    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllSrudent(model.getAllStudents());
                    break;
                case DELETE:  // удаление студентов
                    int id = Integer.parseInt(view.prompt("Введите ID студента для удаления: ")); // Всплывающая строчка для пользователя
                    List<Student> students = model.getAllStudents(); // Чтение необходимого списка
                    for (Student student : students) {  // Проходим по циклу фор для удаления нужного студента по id
                        if (student.getId() == id) { // Если данный студент имеет ид ... , то
                            students.remove(student); // удаление студента
                   //         fmClass.updateStudentData(students);   // Обновление после csv---- Не получается реализовать именно перезапись
                            System.out.println("Студент удален");   // Вывод сообщения пользователю
                            break;      // 
                        }
                    }
                    System.out.println("Студент с таким ID не найден");
                    break;
            }
    
                
            }

        }
    }


