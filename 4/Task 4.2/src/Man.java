import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 29.11.2017.
 */
public class Man extends Human{
    private static List<Man> manList = new ArrayList<>();
    private int cookingSkillLevel;

    Man(){
        setCookingSkillLevel(-20);
        manList.add(this);
    }

    @Override
    public void cookDish() {
        if(cookingSkillLevel >= 70){
            System.out.println("\nМеня зовут " + getName() +
                    ".\nВдохновляюсь на шедевральное блюдо \n" +
                    "Покупаю необходимые продукты \n" +
                    "Готовлю свой шедевр" +
                    "Как же я люблю себя и свой навык кулинарии (" +
                    getCookingSkillLevel() + ").");
        }else{
            System.out.println("\nМеня зовут " + getName() +
                    ".\nВдохновляюсь на шедевральное блюдо \n" +
                    "Трачу последние деньги на продукты \n" +
                    "Уверенно порчу все купленные продукты \n" +
                    "О нет! У меня слишком низкий навык кулинарии, всего  " +
                    getCookingSkillLevel() + " пунктов.\n" +
                    "Поэтому я занимаю денег у соседа и заказываю еду из ресторана!");
        }
    }

    @Override
    public void hangShelf() {
        System.out.println("\nМеня зовут " + getName() +
                "\nБеру молоток \n" +
                "Ищу гвозди \n" +
                "Приставляю полку к стене \n" +
                "Целюсь ударить по гвоздю, но попадаю по пальцу \n" +
                "Кричу и матюхаюсь, %#$&@%%#*! \n" +
                "Успокаиваюсь и спокойно вешаю полку.");
    }

    public int getCookingSkillLevel() {
        return cookingSkillLevel;
    }

    public void setCookingSkillLevel(int cookingSkillLevel) {
        this.cookingSkillLevel = cookingSkillLevel;
    }

    public static List<Man> getManList() {
        return manList;
    }

}
