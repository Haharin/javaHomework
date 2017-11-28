

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private int source;
    private static List<Student> studentList= new ArrayList<Student>();
    public Student() {
        studentList.add(this);
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public void learn() {
        if ( disciplines == null ) {
            System.out.println( "No Disciplines for student " + name );
        } else {
            System.out.println( "Disciplines for student " + name + ":");
            for (Discipline discipline : disciplines ) {
                System.out.println(discipline.getName());
            }
        }
    }


    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

}
