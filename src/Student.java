import java.util.HashMap;

public class Student {
    Integer id;
    String name;
    int age;
    int averageGrade;
    public  Student(Integer id, String name, int age, int averageGrade){
        this.age = age;
        this.name = name;
        this.averageGrade= averageGrade;
        this.id = id;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Имя: " + name
                + " " + "Возраст: "
                + age + " "
                + "Айди " + id +
                " " + "Средний балл" + averageGrade;
    }
}
