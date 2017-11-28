

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentCreator {

    public static List<Student> create() {
        List<Student> students = new ArrayList<>();

        Student alex = new Student();
        alex.setName("Alex");
        alex.setSource(3);

        List<Discipline> alexDisciplineList = getDisciplinesByNames(
                Discipline.getDisciplineList(),
                Arrays.asList("Math", "Biology")
        );
        alex.setDisciplines(alexDisciplineList);
        students.add(alex);

        //////////////

        Student mary = new Student();
        mary.setName("Mary");
        mary.setSource(1);

        List<Discipline> maryDisciplineList = getDisciplinesByNames(
                Discipline.getDisciplineList(),
                Arrays.asList("Art")
        );
        mary.setDisciplines(maryDisciplineList);
        students.add(mary);

        ////////////////

        Student sam = new Student();
        sam.setName("Sam");
        sam.setSource(6);

        List<Discipline> samDisciplineList = getDisciplinesByNames(
                Discipline.getDisciplineList(),
                Arrays.asList("Math", "Computer science")
        );
        sam.setDisciplines(samDisciplineList);
        students.add(mary);

        ////////////

        return students;
    }

    private static List<Discipline> getDisciplinesByNames(
            List<Discipline> disciplines,
            List<String> disciplineNames
    ) {
        List<Discipline> resultList = new ArrayList<>();

        for ( Discipline discipline : disciplines ) {
            if ( disciplineNames.contains( discipline.getName() ) ) {
                resultList.add(discipline);
            }
        }
        return resultList;
    }
}
