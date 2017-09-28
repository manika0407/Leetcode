package Player;

import java.util.Comparator;

public class rankingComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;
        if(p1.getRanking() == p2.getRanking())
            return 0;
        else
            return (p1.getRanking() - p2.getRanking());
    }
}
