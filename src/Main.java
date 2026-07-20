import java.util.*;

public class Main {



    public static void main(String[] args) {
      ArrayList<Student> students = new ArrayList<>();
      students.add(new Student(1,"dkj", 34,34));
        students.add(new Student(2, "fdgg", 98,3455));
        students.add(new Student(3,"askjdla", 22,452));
        students.add(new Student(4,"sdfjkh", 345,646));
        students.add(new Student(5,"s", 66,45));
        students.add(new Student(6,"fs", 11,656));
        List<Student> adultStudents = students.stream()
                .filter(s -> s.getAge() > 18)
                .toList();
        System.out.println("Студенты старше 18 лет: " + adultStudents);
        List<String> studentNames = students.stream()
                .map(s -> s.name).toList();
        System.out.println("Имена студентов: " + studentNames);
        long adultsCount = students.stream()
                .filter(s -> s.getAge() > 18)
                .count();
        System.out.println("Количество совершеннолетних студентов: " + adultsCount);
        boolean adultExist = students.stream()
                .anyMatch(s -> s.getAge() > 18);
        System.out.println("Есть ли совершеннолетние студенты?" + adultExist);
        boolean studentballmore3 = students.stream()
                .allMatch(s -> s.averageGrade > 3);
        System.out.println("Все студенты имеют балл выше 3?" + studentballmore3);
        List<Student> sortedStudentsByAge = students.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
                .toList();
        System.out.println("Отсортированный список студентов по возрасту: " + sortedStudentsByAge);
        List<Student> sortedStudentsByAverageGrade = students.stream()
                .sorted((s1,s2) -> Integer.compare(s2.getAge(), s1.getAge()))
                .toList();
        System.out.println("Отсортированный список студентов по среднему баллу по убыванию: " + sortedStudentsByAverageGrade);
        List<String> studentNamesByAverageGrade = students.stream()
                .filter(s -> s.averageGrade > 4.5)
                .map(s -> s.name)
                .toList();
        System.out.println("Студенты с баллом выше 4.5: " + studentNamesByAverageGrade);
        }
    }


