package armyBuilder.EnumArmyBuilder;

public enum Traits {

    POISON("Poison"),
    STEALTH("Stealth"),
    AGILITY("Agility"),
    DARKNESS("Darkness"),
    FIRE("Fire"),
    ICE("Ice"),
    LIGHTNING("Lightning"),
    EARTH("Earth"),
    WATER("Water");

    final String name;

    Traits(String name) {
        this.name = name;
    }
}
