package Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private String name;
    private int ranking;
    private int age;
    private String country;

    public Player(){

    }

    public Player(int ranking, String name, int age, String country){
        this.ranking = ranking;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Player Virat = new Player(1, "Virat Kohli", 27, "India");
        Player Steve = new Player(3, "Steve Smith", 30, "Australia");
        Player ABD = new Player(2, "ABD evilliers", 32, "South Africa");
        Player Shahid = new Player(10, "Shahid Afridi", 37, "Pakistan");

        List<Player> list = new ArrayList<Player>();
        list.add(Virat);
        list.add(Steve);
        list.add(ABD);
        list.add(Shahid);
        Collections.sort(list, new rankingComparator());

        for(Player p: list){
            System.out.println(p.getName());
            System.out.println(p.getRanking());
        }
    }
}
