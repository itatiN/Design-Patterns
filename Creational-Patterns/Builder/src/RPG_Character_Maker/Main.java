package RPG_Character_Maker;

public class Main {
    public static void main(String[] args) {
        Character.CharacterBuilder builder = new Character.CharacterBuilder();
        CharacterDiretor director = new CharacterDiretor(builder);

        Character mage = director.buildMage();
        Character druid = director.buildDruid();
        Character warlock = director.buildWarlock();
        Character player = builder
                            .setName("itatiN")
                            .setCharacterClass("Bard")
                            .setSkills(new String[]{"Enchanting Songs", "Mana Restauration Aura"})
                            .setEquipment(new String[]{"Jazzmaster Guitar", "Bass"})
                            .setBackstory("A lonely and mysterious bard.")
                            .build();  

        System.out.println("Mage: " + mage.getName() + ", " + mage.getCharacterClass());
        System.out.println("Druid: " + druid.getName() + ", " + druid.getCharacterClass());
        System.out.println("Warlock: " + warlock.getName() + ", " + warlock.getCharacterClass());
        System.out.println("Player: " + player.getName() + ", " + player.getBackstory());
    }
}
