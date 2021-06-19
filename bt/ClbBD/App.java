package ClbBD;
public class App {
    public static void main(String[] args) {
        Team manchesterUnited = TeamFactory.manchesterUnited();
        Team barcelona = TeamFactory.barcelona();
        Team RealMadrid = TeamFactory.RealMadrid();
        Team Liverpool = TeamFactory.Liverpool();
        Team BayernMunich = TeamFactory.BayernMunich();
         
        //in ra danh sách các cầu thủ trong team
        manchesterUnited.showAllPlayers();
        barcelona.showAllPlayers();
        RealMadrid.showAllPlayers();
        Liverpool.showAllPlayers();
        BayernMunich.showAllPlayers();
      }
}
