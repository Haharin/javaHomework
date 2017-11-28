/**
 * Created by Haharin on 29.11.2017.
 */
public class Ananas extends Fruit{
    private String odor;

    public void smell(){
        System.out.println(getName() + " smell " + odor);
    }

    public String getSmell() {
        return odor;
    }

    public void setSmell(String odor) {
        this.odor = odor;
    }
}
