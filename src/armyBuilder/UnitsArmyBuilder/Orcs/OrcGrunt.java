package armyBuilder.UnitsArmyBuilder.Orcs;

import armyBuilder.EnumArmyBuilder.Resistances;
import armyBuilder.EnumArmyBuilder.Traits;
import armyBuilder.EnumArmyBuilder.Type;
import armyBuilder.EnumArmyBuilder.Weaknesses;
import armyBuilder.UnitsArmyBuilder.Unit;

public class OrcGrunt extends Unit {

    private final String type = Type.ORC.name();
    private int hp = 16;
    private int strenght = 7;
    private int agility = 2;
    private int defence = 3;
    private int range = 1;
    private int cost = 150;
    private final String[] weaknesses = {Weaknesses.LIGHTNING.name()};
    private final String[] resistances = {Resistances.FIRE.name(), Resistances.ICE.name()};
    private final String[] traits = {Traits.EARTH.name()};
   

    public OrcGrunt() {
      
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
        System.out.println("Wekanesses: " + String.join(", ", this.weaknesses));
        System.out.println("Traits: " + String.join(", ", this.traits));
        System.out.println("Resistances: " + String.join(", ", this.resistances));
    }

}
