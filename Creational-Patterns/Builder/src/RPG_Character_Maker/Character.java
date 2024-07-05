package RPG_Character_Maker;

public class Character {
    private String name;
    private String characterClass;
    private String[] skills;
    private String[] equipment;
    private String backstory;

    private Character(CharacterBuilder builder){
        this.name = builder.name;
        this.characterClass = builder.characterClass;
        this.skills = builder.skills;
        this.equipment = builder.equipment;
        this.backstory = builder.backstory;
    }

    public String getName(){ return name;}
    public String getCharacterClass(){ return characterClass;}
    public String[] getSkills(){ return skills;}
    public String[] getEquipment(){ return equipment;}
    public String getBackstory(){ return backstory;}


    public static class CharacterBuilder{
        private String name;
        private String characterClass;
        private String[] skills;
        private String[] equipment;
        private String backstory;

        public CharacterBuilder setName(String name){
            this.name = name;
            return this;
        }

        public CharacterBuilder setCharacterClass(String characterClass){
            this.characterClass = characterClass;
            return this;
        }

        public CharacterBuilder setSkills(String[] skills){
            this.skills = skills;
            return this;
        }

        public CharacterBuilder setEquipment(String[] equipment){
            this.equipment = equipment;
            return this;
        }

        public CharacterBuilder setBackstory(String backstory){
            this.backstory = backstory;
            return this;
        }

        public Character build(){
            return new Character(this);
        }
    }
}
