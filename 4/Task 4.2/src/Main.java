import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Man firstMan = new Man();
	    firstMan.setName("Boris 'The Blade' Yurinov");
	    firstMan.setAge(57);
	    firstMan.setProfession("Weapon dealer");
	    firstMan.setCookingSkillLevel(90);
	    Man secondMan = new Man();
        secondMan.setName("Turkish");
        secondMan.setAge(35);
        secondMan.setProfession("Boxing promoter");
        secondMan.setCookingSkillLevel(40);
	    Man thirdMan = new Man();
        thirdMan.setName("Tommy");
        thirdMan.setAge(28);
        thirdMan.setProfession("Thug");
        thirdMan.setCookingSkillLevel(71);
	    Man fourthMan = new Man();
        fourthMan.setName("Mickey O’Neil");
        fourthMan.setAge(27);
        fourthMan.setProfession("Irish Traveller");
        fourthMan.setCookingSkillLevel(80);
	    Man fifthMan = new Man();
        fifthMan.setName("Bullet Tooth Tony");
        fifthMan.setAge(43);
        fifthMan.setProfession("Bounty hunter");
        fifthMan.setCookingSkillLevel(100);
	    Man sixthMan = new Man();
        sixthMan.setName("Sol");
        sixthMan.setAge(34);
        sixthMan.setProfession("Thug");
        sixthMan.setCookingSkillLevel(50);
	    Man seventhMan = new Man();
        seventhMan.setName("Bad Boy Lincoln");
        seventhMan.setAge(29);
        seventhMan.setProfession("Thug");
        seventhMan.setCookingSkillLevel(10);

        Woman firstWoman = new Woman();
        firstWoman.setName("Madeline Martha Mackenzie");
        firstWoman.setAge(39);
        firstWoman.setProfession("Housewife");
        Woman secondWoman = new Woman();
        secondWoman.setName("Celeste Wright");
        secondWoman.setAge(45);
        secondWoman.setProfession("Lawyer");
        Woman thirdWoman = new Woman();
        thirdWoman.setName("Jane Chapman");
        thirdWoman.setAge(27);
        thirdWoman.setProfession("Accountant");
        Woman fourthWoman = new Woman();
        fourthWoman.setName("Bonnie Carlson");
        fourthWoman.setAge(30);
        fourthWoman.setProfession("Yoga Trainer");
        Woman fifthWoman = new Woman();
        fifthWoman.setName("Renata Klein");
        fifthWoman.setAge(50);
        fifthWoman.setProfession("Business woman");
        Woman sixthWoman = new Woman();
        sixthWoman.setName("Sabrina");
        sixthWoman.setAge(39);
        sixthWoman.setProfession("Thug");
        Woman seventhWoman = new Woman();
        seventhWoman.setName("Some Woman");
        seventhWoman.setAge(37);
        seventhWoman.setProfession("Housewife");

        System.out.println("Введите диапазон возраста [a;b] ");

        Scanner scanner = new Scanner( System.in );
        String str = scanner.nextLine();
        str = str.replace("[", " ");
        str = str.replace("]", " ");
        str = str.trim();
        int[] numAB = Arrays.stream(str.split(";")).mapToInt(Integer::parseInt).toArray();

        for (Human human:Human.getHumanList()) {
            if ((human.getAge() >= numAB[0]) || (human.getAge() <= numAB[1])){
                System.out.println(human.getName() + ", " + human.getAge() + " years, " + human.getProfession());
            }
        }

        System.out.println("Введите название профессии");

        str = scanner.nextLine();

        for (Human human:Human.getHumanList()) {
            if (human.getProfession().equals(str)){
                System.out.println(human.getName() + ", " + human.getAge() + " years.");
            }
        }

        for (Human human:Human.getHumanList()) {
            human.cookDish();
            human.hangShelf();
        }
    }
}