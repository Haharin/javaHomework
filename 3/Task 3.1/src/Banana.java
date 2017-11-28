/**
 * Created by Haharin on 29.11.2017.
 */
public class Banana extends Fruit {
    private String flavor;

    public void taste(){
        System.out.println(getName() + flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
