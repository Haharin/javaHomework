import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 29.11.2017.
 */
public abstract class Human {
    private String name;
    private int age;
    private String profession;
    private static List<Human> humanList = new ArrayList<>();
    Human(){
        humanList.add(this);
    }

    public static List<Human> getHumanList() {
        return humanList;
    }

    public abstract void cookDish();
    public abstract void hangShelf();

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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
