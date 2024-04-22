package test;

import domain.*;

/**
 * Клас для тестування різних класів співробітників.
 */
public class EmployeesTest {

    /**
     * Точка входу для запуску тестування
     * @param args аргументи командного рядка
     */
    public static void main(String args[]) {

        // Визначаємо навички для редактора
        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};

        // Створюємо екземпляри різних класів
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");

        Artist art = new Artist(skills);
        Employee[] people = {ed, em, art};

        // Створюємо менеджера зі списком співробітників
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        // Виводимо інформацію про менеджера
        System.out.println(man);

    }
}
