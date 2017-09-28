package Player;

import java.util.Comparator;

public class NameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;
        return (p1.getName().compareTo(p2.getName()));
    }
}
