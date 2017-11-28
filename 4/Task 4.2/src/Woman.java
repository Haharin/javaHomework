import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Haharin on 29.11.2017.
 */
public class Woman extends Human{
    private static List<Woman> womanList = new ArrayList<>();
    Woman(){
        womanList.add(this);
    }

    @Override
    public void cookDish() {
        System.out.println("\nМеня зовут " + getName() +
                ".\nКупить продукты \n" +
                "Найти рецепт под имеющиеся продукты \n" +
                "Помыть продукты \n" +
                "Порезать продукты \n" +
                "Строго следовать рецепту \n" +
                "Моя еда получилась на все 100!");
    }

    @Override
    public void hangShelf() {
        System.out.println("\nМеня зовут " + getName() +
                ".\nИщу первого попавшегося мужика.");
        Random rand = new Random();
        Man man = Man.getManList().get(rand.nextInt(Man.getManList().size()));
        System.out.println("О! Нашла дурачка - " +
                man.getName() +", " +
                man.getAge()+ " лет, " +
                man.getProfession() + ".\n" +
                man.getName() + " спокойно вешает полку." );
        if(man.getCookingSkillLevel() >= 70){
            System.out.println("Так он ещё и готовит хорошо!");
        }else{
            System.out.println("Эх, готовить придётся самой.");
        }

    }

    public static List<Woman> getWomanList() {
        return womanList;
    }
}
