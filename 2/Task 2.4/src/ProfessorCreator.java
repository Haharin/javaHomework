

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfessorCreator {

    public static List<Professor> create() {

        List<Professor> professors = new ArrayList<>();

        Professor einstein = new Professor();
        einstein.setName("Albert Einstein");
        einstein.setAge(75);

        List<Discipline> einsteinDisciplineList = getDisciplinesByNames(
                Discipline.getDisciplineList(),
                Arrays.asList("Math", "Computer science")
        );
        einstein.setDisciplines(einsteinDisciplineList);
        professors.add(einstein);

        ///////////////

        Professor picasso = new Professor();
        picasso.setName("Pablo Picasso");
        picasso.setAge(50);

        List<Discipline> picassoDisciplineList = getDisciplinesByNames(
                Discipline.getDisciplineList(),
                Arrays.asList("Art")
        );
        picasso.setDisciplines(picassoDisciplineList);
        professors.add(picasso);

        ////////////

        return professors;
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
