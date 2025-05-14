import armyBuilder.Battle.Battle;
import armyBuilder.UnitsArmyBuilder.Orcs.OrcGrunt;
import armyBuilder.UnitsArmyBuilder.Rats.RatClanMan;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {



    /*  Game window */
       JFrame frame = new JFrame("Armybuilder");
       JLabel label = new JLabel("Geeks Premier League 2023");

       frame.add(label);
       frame.setSize(800, 800);
       frame.setExtendedState(frame.MAXIMIZED_BOTH);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     


RatClanMan rat = new RatClanMan();

OrcGrunt orc = new OrcGrunt();

Battle battle = new Battle();
battle.fight(rat, orc);
}
}