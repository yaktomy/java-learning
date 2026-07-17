import java.util.Scanner;
public class Main {
    public static abstract class Employee{
        String name;
        double salary;
        public Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        public abstract void work();
    }
    public static class Developer extends Employee{
        @Override
        public void work(){
            System.out.println("Разработчик "+ name +" пишет код");
        }
        public Developer(String name, double salary){
            super(name,salary);
        }


    }
    public static class Tester extends Employee{
        @Override
        public void work(){
            System.out.println("Тестировщик "+ name +" тестирует приложение");
        }
        public Tester(String name, double salary){
            super(name,salary);
        }

    }
    public static class Manager extends Employee{
        @Override
        public void work(){
            System.out.println("Менеджер "+ name +" проводит встречи");
        }
        public Manager(String name, double salary){
            super(name,salary);
        }
    }
    public static interface Payable{
        void paySalary();
    }
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Марселина", 120000),
                new Tester("Анна", 123333),
                new Manager("Олег", 26378)
        };
        for (int i = 0; i< employees.length; i++){
            employees[i].work();
        }
    }
}

