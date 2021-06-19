package ClbBD;
public class TeamFactory {
    //Chuyên để tạo ra các Team. Đọc tên class đã biết chức năng
    //1- Đọc từ file CSV
    //2- Đọc từ CSDL quan hệ
    //3- Gọi lên REST API từ internet rồi đổ dữ liệu vào
    public static Team manchesterUnited() {
      Team team = new Team(
        "Manchester United", 
        "Old Trafford", 
        "Ole Gunnar Solskjær",
        "1878"
      );
  
      team.addPlayer(new Player("David de Gea", 1, Position.GOALKEEPER));
      team.addPlayer(new Player("Victor Lindelöf", 2, Position.DEFENDER));
      team.addPlayer(new Player("Bruno Fernandes", 18, Position.MIDFIELD));
      return team;
    }
  
    public static Team barcelona() {
      Team team = new Team(
        "Barcelona", 
        "Nou Camp", 
        "Ronald Koeman",
        "1899"
      );
  
      team.addPlayer(new Player("Marc-André ter Stegen", 1, Position.GOALKEEPER));
      team.addPlayer(new Player("Gerard Piqué ", 3, Position.DEFENDER));
      team.addPlayer(new Player("Lionel Messi ", 10, Position.FORWARDER));
      return team;
    }
    public static Team RealMadrid() {
      Team team = new Team(
        "RealMadrid",
        "Santiago Bernabéu",
        "Carlo Ancelotti",
        "1902"
      );
      team.addPlayer(new Player("David Alaba", 27 , Position.MIDFIELD));
      team.addPlayer(new Player("Eden hazard", 10 , Position.FORWARDER));
      team.addPlayer(new Player("Thibaut Courtois", 1 , Position.GOALKEEPER));
      return team;
    }
    public static Team Liverpool() {
      Team team = new Team(
        "Liverpool",
        " Anfield",
        "Jürgen Klopp",
        "1892"
      );
      team.addPlayer(new Player("Mohamed Salah", 11, Position.FORWARDER));
      team.addPlayer(new Player("Virgin Van Dijk", 4, Position.DEFENDER));
      team.addPlayer(new Player("Georginio Wijnaldum", 5 , Position.MIDFIELD));
      return team;
    }
    public static Team BayernMunich(){
    Team team = new Team(
      "Bayern Munich",
      "Allianz",
      "Hans-Dieter Flick",
      "1900"
    );
    team.addPlayer(new Player("Robert Lewandowski", 9, Position.FORWARDER));
    team.addPlayer(new Player("Thomas Müller", 25, Position.FORWARDER));
    team.addPlayer(new Player("Manuel Neuer", 1, Position.GOALKEEPER));
      return team;
    }
  }