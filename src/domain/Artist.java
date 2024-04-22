package domain;
/**
 * Представляє художника, який є співробітником
 */
public class Artist extends Employee {

    /**
     * @param skiils навички художника
     * @param name ім'я художника
     * @param jobTitle посада художника
     * @param level рівень художника
     * @param dept відділ художника
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * @param skiils масив навичок художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Створює нового художника зі значеннями за замовчуванням.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * @return рядок у вигляді рядка
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * @return рядок із навичками художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * @param skills масив навичок художника
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * @return масив навичок художника
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
