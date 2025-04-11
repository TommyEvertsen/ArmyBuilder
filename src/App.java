import armyBuilder.Battle.Battle;
import armyBuilder.UnitsArmyBuilder.Orcs.OrcGrunt;
import armyBuilder.UnitsArmyBuilder.Rats.RatClanMan;

public class App {
    public static void main(String[] args) throws Exception {
     
RatClanMan rat = new RatClanMan();
rat.getStatus();
OrcGrunt orc = new OrcGrunt();
orc.getStatus();
Battle battle = new Battle();
battle.fight(rat, orc);
}
}