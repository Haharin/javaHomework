import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 29.11.2017.
 */
public class Man extends Human{
    private static List<Man> manList = new ArrayList<>();
    Man(){
        manList.add(this);
    }

    public static List<Man> getManList() {
        return manList;
    }
}
