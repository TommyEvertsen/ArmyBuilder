package armyBuilder.EnumArmyBuilder;

public enum Type {

    RAT("Rat"),
    SKELETON("Skeleton"),
    GOBLIN("Goblin"),
    ORC("Orc"),
    TROLL("Troll"),
    ZOMBIE("Zombie"),
    VAMPIRE("Vampire"),
    WEREWOLF("Werewolf"),
    GHOST("Ghost"),
    SPIRIT("Spirit");

    final String name;

    Type(String name) {
        this.name = name;
    }

}
