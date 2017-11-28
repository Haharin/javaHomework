

import java.util.ArrayList;
import java.util.List;

public class DisciplineCreator {

    public static List<Discipline> create() {
        List<Discipline> disciplines = new ArrayList<>();

        Discipline math = new Discipline();
        math.setName("Math");
        math.setComplexity(9);

        disciplines.add(math);

        Discipline art = new Discipline();
        art.setName("Art");
        art.setComplexity(8);

        disciplines.add(art);

        Discipline computerScience = new Discipline();
        computerScience.setName("Computer science");
        computerScience.setComplexity(9);
        disciplines.add(computerScience);

        Discipline biology = new Discipline();
        biology.setName("Biology");
        biology.setComplexity(10);
        disciplines.add(biology);

        Discipline chemistry = new Discipline();
        chemistry.setName("Chemistry");
        chemistry.setComplexity(6);
        disciplines.add(chemistry);

        return disciplines;
    }

}
