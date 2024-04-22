package domain;

/**
 * Представляє менеджера, який є співробітником
 * Цей клас є підкласом класу Employee
 */
public class Manager extends Employee {

    /**
     * @param employees масив співробітників, керованих менеджером
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера
     * @param dept відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * @return рядок у вигляді рядка
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    /**
     * @param employees масив співробітників, керованих менеджером
     */

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    /**
     * @return рядок із іменами співробітників, керованих менеджером
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * @param employees масив співробітників, керованих менеджером
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * @return масив співробітників, керованих менеджером
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
