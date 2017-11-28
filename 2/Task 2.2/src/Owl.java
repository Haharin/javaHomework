/**
 * Created by Haharin on 28.11.2017.
 */
public class Owl {
    private String name;
    private int age;
    private String breed;
    private static int owlCount = 0;

    Owl(){
        setAge(1);
        setBreed("Grey");
        setName(owlCount + "owl");
        owlCount++;
    }

    public void huntOn(String prey){
        System.out.println(getBreed() + " owl " + getName() + " hunt on " + prey);
    }

    public void eatSomething(String prey){
        System.out.println(getBreed() + " owl " + getName() + " eat " + prey);
    }

    public void sleep(){
        System.out.println(getBreed() + " owl " + getName() + " sleep");
    }

    public static int getOwlCount() {
        return owlCount;
    }

    public static void setOwlCount(int owlCount) {
        Owl.owlCount = owlCount;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
