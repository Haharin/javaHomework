

import java.util.ArrayList;
import java.util.List;

public class Discipline {
    private String name;
    private int complexity;
    private static List<Discipline> disciplineList = new ArrayList<Discipline>();
    public Discipline() {
        disciplineList.add(this);
    }

    public static List<Discipline> getDisciplineList() {
        return disciplineList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

}
