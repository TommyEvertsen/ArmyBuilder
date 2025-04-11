package armyBuilder.Battle;

import armyBuilder.UnitsArmyBuilder.Unit;

public class Battle {

    public void fight(Unit unit1, Unit unit2) {
       System.out.println("Battle started between" + " " + unit1.getType() + " "  + "and" + " " + unit2.getType());
     
       try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }

       calculateFirstStrike(unit1, unit2);

    }

    public void calculateFirstStrike(Unit unit1, Unit unit2) {
        if (unit1.getRange() > unit2.getRange()) {
            unit1.setFirstStrike(true);
            System.out.println(unit1.getType() + " " + "Has longer range and will get first strike");
           
        } else if (unit2.getRange() > unit1.getRange()) {
            unit2.setFirstStrike(true); 
            System.out.println(unit2.getType() + " " + "Has longer range and will get first strike");
        }

        else if (unit1.getAgility() > unit2.getAgility()) {
            unit1.setFirstStrike(true);
            System.out.println(unit1.getType() + " " + "Has higher agility and will get first strike");
        }
        
        else {
            unit2.setFirstStrike(true);
            System.out.println(unit2.getType() + " " + "Has higher agility and will get first strike");
        }


    }

}
