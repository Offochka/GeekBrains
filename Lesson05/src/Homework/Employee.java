package Homework;

public class Employee {
    String name;
    String surname;
    String middlename;
    String position;
    String email;
    int numberPhone;
    int age;
    int salary;

    public Employee(String name, String surname, String middlename, int age, String position, String email, int phoneNumber, int salary ) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.age = age;
        this.position = position;
        this.email = email;
        this.numberPhone = phoneNumber;
        this.salary = salary;
    }
    public void getFullInfo() {
        System.out.printf("Surname: %s, Name: %s, Middlename: %s,  Age: %d, Position: %s, E-mail: %s, Phonenumber: %d, Salary: %d %n", surname, name, middlename, age, position, email, numberPhone, salary );
    }
    public int getAge() {
        return  this.age;
    }
}
