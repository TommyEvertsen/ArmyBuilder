package armyBuilder.EnumArmyBuilder;


public enum Weaknesses {

    POISON("Poison"),
    DARKNESS("Darkness"),
    FIRE("Fire"),
    ICE("Ice"),
    LIGHTNING("Lightning"),
    EARTH("Earth"),
    WATER("Water"),
    WIND("Wind"),
    LIGHT("Light"),
    SHADOW("Shadow"),
    METAL("Metal"),
    WOOD("Wood"),
    STONE("Stone"),
    FLESH("Flesh"),
    SPIRIT("Spirit");

    final String name;

    Weaknesses(String name) {
        this.name = name;
    }
}
