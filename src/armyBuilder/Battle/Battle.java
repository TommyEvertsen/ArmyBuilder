package armyBuilder.Battle;

import armyBuilder.UnitsArmyBuilder.Unit;

public class Battle {

    public void fight(Unit unit1, Unit unit2) {
       System.out.println("Battle started between" + " " + unit1.getName() + " "  + "and" + " " + unit2.getName());
     
       try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }

       calculateFirstStrike(unit1, unit2);

       startBattle(unit1, unit2);

    }

    public void calculateFirstStrike(Unit unit1, Unit unit2) {
        if (unit1.getRange() > unit2.getRange()) {
            unit1.setFirstStrike(true);
            System.out.println(unit1.getName() + " " + "Has longer range and will get first strike");
           
        } else if (unit2.getRange() > unit1.getRange()) {
            unit2.setFirstStrike(true); 
            System.out.println(unit2.getName() + " " + "Has longer range and will get first strike");
        }

        else if (unit1.getAgility() > unit2.getAgility()) {
            unit1.setFirstStrike(true);
            System.out.println(unit1.getName() + " " + "Has higher agility and will get first strike");
        }
        
        else {
            unit2.setFirstStrike(true);
            System.out.println(unit2.getName() + " " + "Has higher agility and will get first strike");
        }
    }

    public void attack(Unit attacker, Unit target) {
        int damage = attacker.getStrenght() - target.getDefence(); 
        if (damage > 0) {
            target.setHp(target.getHp() - damage);
            System.out.println(attacker.getName() + " deals " + damage + " damage to " + target.getName());
        } else {
            System.out.println(attacker.getName() + " couldn't penetrate " + target.getName() + "'s defense.");
        }
    }

    public void startBattle(Unit unit1, Unit unit2) {
        while (unit1.getHp() >= 0 && unit2.getHp() >= 0) { 
            if (unit1.getFirstStrike()) {
                System.out.println(unit1.getName() + " Attacks");
                attack(unit1, unit2);
                if (unit2.getHp() <= 0) { 
                    System.out.println(unit2.getName() + " Died");
                    break;
                }
                System.out.println(unit2.getName() + " Attacks");
                attack(unit2, unit1);
                if (unit1.getHp() <= 0) { 
                    System.out.println(unit1.getName() + " Died");
                    break;
                }
            } else {
                System.out.println(unit2.getName() + " Attacks");
                attack(unit2, unit1);
                if (unit1.getHp() <= 0) { 
                    System.out.println(unit1.getName() + " Died");
                    break;
                }
                System.out.println(unit1.getName() + " Attacks");
                attack(unit1, unit2);
                if (unit2.getHp() <= 0) { 
                    System.out.println(unit2.getName() + " Died");
                    break;
                }
            }
        }
    }
}
