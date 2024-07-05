package RPG_Character_Maker;

public class CharacterDiretor {
    private Character.CharacterBuilder builder;

    public CharacterDiretor(Character.CharacterBuilder builder){
        this.builder = builder;
    }

    public Character buildMage(){
        return builder
                .setName("Gandalf")
                .setCharacterClass("Mage")
                .setSkills(new String[]{"Spell Casting", "Elemental Manipulation"})
                .setEquipment(new String[]{"Staff", "Mage Robes"})
                .setBackstory("A wise and powerful mage known for his travels and battles against evil.")
                .build();     
    }
    
    public Character buildWarlock(){
        return builder
                .setName("Saruman")
                .setCharacterClass("Warlock")
                .setSkills(new String[]{"Dark Magic", "Summoning"})
                .setEquipment(new String[]{"Dark Staff", "Black Robes"})
                .setBackstory("A warlock who delved into dark magic, seeking power at any cost.")
                .build();
    }

    public Character buildDruid(){
        return builder
                .setName("Radagast")
                .setCharacterClass("Druid")
                .setSkills(new String[]{"Nature Magic", "Animal Communication"})
                .setEquipment(new String[]{"Druid Staff", "Natural Attire"})
                .setBackstory("A druid with a deep connection to nature, protector of the forests and wildlife.")
                .build();
    }
}
