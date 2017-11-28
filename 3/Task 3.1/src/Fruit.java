/**
 * Created by Haharin on 29.11.2017.
 */
public class Fruit {
    private String color;
    private String form;
    private String name;
    public void grow(){
        System.out.println(name + " grows");
    }
    public void bloom(){
        System.out.println(name + "blooms");
    }
    public void ripen(){
        System.out.println(name + "ripens");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
