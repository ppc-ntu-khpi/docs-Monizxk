package domain;

/**
 * Представляє співробітника
 */
public class Employee {

    /**
     * Повертає рядок, що представляє об'єкт у вигляді рядка
     * @return рядок у вигляді рядка
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    /**
     * @param name ім'я співробітника
     * @param jobTitle посада співробітника
     * @param level рівень співробітника
     * @param dept відділ співробітника
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * Створює нового співробітника з випадковим ідентифікаційним номером
     * Ідентифікаційний номер генерується випадковим чином у діапазоні від 0 до 999
     * @throws NumberFormatException якщо ідентифікаційний номер більший за 10000
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * @param job посада співробітника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * @return посада співробітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @return ім'я співробітника
     */
    public String getName() {
        return name;
    }

    /**
     * @param level рівень співробітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * @return рівень співробітника
     */
    public int getLevel() {
        return level;
    }

    /**
     * @return відділ співробітника
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept відділ співробітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @param name ім'я співробітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
