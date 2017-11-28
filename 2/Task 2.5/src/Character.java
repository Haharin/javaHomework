import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 28.11.2017.
 */
public class Character {
    private String name;
    private int age;
    private Land land;
    private static List<Character> charactersList = new ArrayList<>();

    public static List<Character> getCharactersList() {
        return charactersList;
    }

    Character(){
        charactersList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return "Character{" + '\n' +
                "Name: " + getName() + '\n' +
                "Age: " + getAge() + '\n' +
                getLand().toString() + '\n' +
                '}';
    }
}
