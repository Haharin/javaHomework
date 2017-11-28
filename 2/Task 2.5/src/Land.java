import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 28.11.2017.
 */
public class Land {
    private String name;
    private Character landlord;
    private static List<Land> landList = new ArrayList<>();

    public static List<Land> getLandList() {
        return landList;
    }

    Land(){
        landList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getLandlord() {
        return landlord;
    }

    public void setLandlord(Character landlord) {
        this.landlord = landlord;
    }

    @Override
    public String toString() {
        return "Land:{" + "\n\t" +
                "LandName: " + getName() + "\n\t" +
                "Landlord: " + getLandlord().getName() + "\n\t" +
                '}';
    }
}
