public class Main {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.setName("Jimmy");
        tiger.setAge(3);

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Roxy");
        giraffe.setAge(14);

        Lion lion = new Lion();
        lion.setName("LeoNard");
        lion.setAge(6);

        Zoo zoo = new Zoo();
        zoo.setTiger( tiger );
        zoo.setLion( lion );
        zoo.setGiraffe(giraffe);

        System.out.println(zoo.toString());

//        AmurTiger amurTiger = new AmurTiger();
//        amurTiger.eat();
//        amurTiger.setName("Jojo");
//        System.out.println(amurTiger);
    }
}
