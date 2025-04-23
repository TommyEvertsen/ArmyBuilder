import armyBuilder.Battle.Battle;
import armyBuilder.UnitsArmyBuilder.Orcs.OrcGrunt;
import armyBuilder.UnitsArmyBuilder.Rats.RatClanMan;

public class App {
    public static void main(String[] args) throws Exception {
     
RatClanMan rat = new RatClanMan();

OrcGrunt orc = new OrcGrunt();

Battle battle = new Battle();
battle.fight(rat, orc);
}
}