package Model.Domain;

public class Student extends Person implements Comparable<Student>{
    private int id;
    private static int idGenerator;

   
// Генерация ИД
    public Student(String name, int age) {
        super(name, age);
        idGenerator++;
        this.id = idGenerator;
    }

    public int getId() {
        return id;
    }
//  возможно не нужно тоже
    public static int getIdGenerator() {
        return idGenerator;
    }
//  Вывод в терминал
    @Override
    public String toString() {
        return "Student [id=" + id + " name: " + super.getName() + " age: " + super.getAge() +  "]";
    }
//* Сортировка по имени и ид */
    @Override
    public int compareTo(Student o) {
        
        if(this.getAge() > o.getAge())
        return 1;
        if(this.getAge() < o.getAge())
        return -1;
        if(this.getId() > o.getId()) return 1;
        if(this.getId() < o.getId()) return -1;
        return 0;

       
    }

    
}
