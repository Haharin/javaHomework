public class Main {

    public static void main(String[] args) {

        Character catelynStark = new Character();
        Character nedStark = new Character();
        Character khalDrogo = new Character();
        Character daenerysTargaryen = new Character();
        Character tywinLannister = new Character();
        Land north = new Land();
        Land steppes = new Land();
        Land casterlyRock = new Land();
        catelynStark.setLand(north);
        catelynStark.setName("Catelyn Stark");
        catelynStark.setAge(38);
        nedStark.setLand(north);
        nedStark.setName("Ned Stark");
        nedStark.setAge(45);
        khalDrogo.setLand(steppes);
        khalDrogo.setName("Khal Drogo");
        khalDrogo.setAge(35);
        daenerysTargaryen.setLand(steppes);
        daenerysTargaryen.setName("Daenerys Stormborn of the House Targaryen, First of Her Name, the Unburnt, Queen of the Andals and the First Men, Khaleesi of the Great Grass Sea, Breaker of Chains, and Mother of Dragons");
        daenerysTargaryen.setAge(25);
        tywinLannister.setLand(casterlyRock);
        tywinLannister.setName("Tywin Lannister");
        tywinLannister.setAge(53);
        north.setLandlord(nedStark);
        north.setName("North");
        steppes.setLandlord(khalDrogo);
        steppes.setName("Steppes");
        casterlyRock.setLandlord(tywinLannister);
        casterlyRock.setName("Casterly Rock");

        for (Character character: Character.getCharactersList()) {
            System.out.println(character);
        }
    }
}
