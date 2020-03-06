package Homework;

public class Employee {
    private String name;
    private String surname;
    private String middlename;
    private String position;
    private String email;
    private int numberPhone;
    private int age;
    private int salary;

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
