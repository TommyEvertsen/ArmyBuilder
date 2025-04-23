package armyBuilder.UnitsArmyBuilder.Orcs;

import armyBuilder.EnumArmyBuilder.Resistances;
import armyBuilder.EnumArmyBuilder.Traits;
import armyBuilder.EnumArmyBuilder.Type;
import armyBuilder.EnumArmyBuilder.Weaknesses;
import armyBuilder.UnitsArmyBuilder.Unit;


public class OrcGrunt extends Unit {

    private String type = Type.ORC.name();
    private String name = "Orc Grunt";
    private int hp = 16;
    private int strenght = 7;
    private int agility = 2;
    private int defence = 3;
    private int range = 1;
    private int cost = 150;
    private boolean firstStrike = false;
    private  String[] weaknesses = {Weaknesses.LIGHTNING.name()};
    private  String[] resistances = {Resistances.FIRE.name(), Resistances.ICE.name()};
    private  String[] traits = {Traits.EARTH.name()};
   

    public OrcGrunt() {
      
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getStrenght() {
        return strenght;
    }

    @Override
    public int setStrenght(int strenght) {
      return this.strenght = strenght;
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String[] getWekanesses() {
        return wekanesses;
    }
    
    @Override
    public void setWekanesses(String[] wekanesses) {
        this.wekanesses = wekanesses;
    }
    
    @Override
    public String[] getTraits() {
        return traits;
    }

    @Override
    public void setTraits(String[] traits) {
        this.traits = traits;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean getFirstStrike(){
        return firstStrike;
    }

    @Override
    public void setFirstStrike(boolean firstStrike){
        this.firstStrike = firstStrike;
    }

    @Override
    public int getRange(){
        return range;
    }
    @Override
    public void setRange(int range){
        this.range = range;
    }

    @Override
    public String getName(){
        return name; 
    }

    @Override
    public void setName(String name){
        this.name = name;
    }


    // Cusom methods
    @Override
    public void attack(Unit target) {
        int damage = this.strenght - target.getDefence();
        if (damage > 0) {
            target.setHp(target.getHp() - damage);
        }
    }

    @Override
    public void defend(int damage) {
        int actualDamage = damage - this.defence;
        if (actualDamage > 0) {
            this.hp -= actualDamage;
        }
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
        System.out.println("First strike" + firstStrike);
        
    }

}
