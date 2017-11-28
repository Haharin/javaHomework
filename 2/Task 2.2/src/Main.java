public class Main {

    public static void main(String[] args) {
        Owl first = new Owl();
        first.setName("Jojo");
        first.setAge(4);
        first.setBreed("Red");
        Owl second = new Owl();
        second.setName("Dana");
        second.setAge(6);
        second.setBreed("Blue");
        Owl third = new Owl();
        third.setName("Elder");
        third.setAge(12);
        third.setBreed("Grey");
        Owl fourth = new Owl();
        fourth.setName("Yellowhorn");
        fourth.setAge(2);
        fourth.setBreed("Yellow");

        first.sleep();
        second.sleep();
        third.huntOn("rabbit");
        fourth.eatSomething("worm");
    }
}
