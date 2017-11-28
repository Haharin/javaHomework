
import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {

    private int age;
    private static List<Professor> professorList = new ArrayList<Professor>();

    public static List<Professor> getProfessorList() {
        return professorList;
    }

    public Professor() {
        professorList.add(this);
    }

    public void teach() {
        if ( disciplines == null ) {
            System.out.println( "No Disciplines by professor " + name );
        } else {
            System.out.println( "Disciplines by professor " + name + ":");
            for (Discipline discipline : disciplines ) {
                System.out.println(discipline.getName());
            }
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
