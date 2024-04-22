package domain;
/**
 * Представляє редактора, який є художником
 * Цей клас є підкласом класу Artist
 */
public class Editor extends Artist {
    /**
     * @param electronicEditing тип редагування (true - електронне, false - паперове)
     * @param skiils масив навичок редактора
     * @param name ім'я редактора
     * @param jobTitle посада редактора
     * @param level рівень редактора
     * @param dept відділ редактора
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * @param electronicEditing тип редагування (true - електронне, false - паперове)
     * @param skiils масив навичок редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * @param electronicEditing тип редагування (true - електронне, false - паперове)
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор за замовчуванням, який створює редактора з типом редагування електронне
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Включає вихідну інформацію від батьківського класу та тип редагування
     * @return рядок у вигляді рядка
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }
    private boolean electronicEditing;

    /**
     * @return тип редагування (true - електронне, false - паперове)
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * @param electronic тип редагування (true - електронне, false - паперове)
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
