package armyBuilder.UnitsArmyBuilder;

public abstract class Unit {

    public String type;
    public int hp;
    public int strenght;
    public int agility;
    public int defence;
    public String[] wekanesses;
    public String[] traits;
    public String[] resistances;
    public int cost;
    public boolean firstStrike;
    private int range;
   

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrenght() {
        return strenght;
    }

    public int setStrenght(int strenght) {
      return this.strenght = strenght;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String[] getWekanesses() {
        return wekanesses;
    }
    public void setWekanesses(String[] wekanesses) {
        this.wekanesses = wekanesses;
    }
    public String[] getTraits() {
        return traits;
    }
    public void setTraits(String[] traits) {
        this.traits = traits;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean getFirstStrike(){
        return firstStrike;
    }

    public void setFirstStrike(boolean firstStrike){
        this.firstStrike = firstStrike;
    }

    public int getRange(){
        return range;
    }

    public void setRange(int range){
        this.range = range;
    }


    // Cusom methods
    public void attack(Unit target) {
        int damage = this.strenght - target.getDefence();
        if (damage > 0) {
            target.setHp(target.getHp() - damage);
        }
    }
    public void defend(int damage) {
        int actualDamage = damage - this.defence;
        if (actualDamage > 0) {
            this.hp -= actualDamage;
        }
    }

    public void getStatus() {
        System.out.println("Type: " + this.type);
        System.out.println("HP: " + this.hp);
        System.out.println("Strenght: " + this.strenght);
        System.out.println("Agility: " + this.agility);
        System.out.println("Defence: " + this.defence);
        System.out.println("Wekanesses: " + String.join(", ", this.wekanesses));
        System.out.println("Traits: " + String.join(", ", this.traits));
        System.out.println("Cost: " + this.cost);
        System.out.println("Resistances: " + String.join(", ", this.resistances));
    }



}
