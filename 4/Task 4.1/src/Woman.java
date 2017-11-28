import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 29.11.2017.
 */
public class Woman extends Human{
    private static List<Woman> womanList = new ArrayList<>();
    Woman(){
        womanList.add(this);
    }

    public static List<Woman> getWomanList() {
        return womanList;
    }
}
