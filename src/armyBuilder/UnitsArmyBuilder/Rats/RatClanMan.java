package armyBuilder.UnitsArmyBuilder.Rats;

import armyBuilder.EnumArmyBuilder.Resistances;
import armyBuilder.EnumArmyBuilder.Traits;
import armyBuilder.EnumArmyBuilder.Type;
import armyBuilder.EnumArmyBuilder.Weaknesses;
import armyBuilder.UnitsArmyBuilder.Unit;

public class RatClanMan extends Unit{

    private String type = Type.RAT.name();
    private int hp = 10;
    private int strenght = 5;
    private int agility = 3;
    private int defence = 2;
    private int range = 1;
    private int cost = 100;
    private final String[] wekanesses = {Weaknesses.FIRE.name(), Weaknesses.LIGHTNING.name()};
    private final String[] resistances = {Resistances.POISON.name()};
    private final String[] traits = {Traits.DARKNESS.name(), Traits.STEALTH.name()};

    public RatClanMan() {
    }

   public  RatClanMan(String type, int hp, int strenght, int agility, int defence, int cost, int range) {
        this.type = type;
        this.hp = hp;
        this.strenght = strenght;
        this.agility = agility;
        this.defence = defence;
        this.cost = cost;
        this.range = range;
    }


    @Override
    public void getStatus() {
        System.out.println("Type: " + this.type);
        System.out.println("HP: " + this.hp);
        System.out.println("Strenght: " + this.strenght);
        System.out.println("Agility: " + this.agility);
        System.out.println("Defence: " + this.defence);
        System.out.println("Range: " + this.range);
        System.out.println("Cost: " + this.cost);
        System.out.println("Wekanesses: " + String.join(", ", this.wekanesses));
        System.out.println("Traits: " + String.join(", ", this.traits));
        System.out.println("Resistances: " + String.join(", ", this.resistances));
    }


    

}
