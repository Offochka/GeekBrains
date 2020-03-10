package Homework;
/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * Конструктор класса должен заполнять эти поля при создании объекта;
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * Создать массив из 5 сотрудников
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;*/

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Kate", "Beris", "Ivanovna", 20, "Student", "lasop@gron.ru", 95631586, 1500),
                new Employee("Nikolas", "Petrov", "Sergeevich", 47, "Cook", "kidlo@gron.ru", 45875687, 50000),
                new Employee("Alex", "Toys", "Petrovich", 40, "Waiter", "fdgsgh@gron.ru", 23896745, 40000),
                new Employee("Sergei", "Lomov", "Stanislavovich", 42, "Manager", "rsgdtg@gron.ru", 3685867, 60000),
                new Employee("Tom", "Borisov", "Anatolevich", 25, "Painter", "gdrgdrg@gron.ru", 98736542, 30000)
        };

        for (Employee i : employees) {
            if (i.getAge() > 40) {
                i.getFullInfo();
            }
        }
    }
}
