/**
 * Created by manika on 3/12/17.
 */
import java.util.Comparator;
import java.util.PriorityQueue;
public class priorityqueue
{
    public static void main(String[] args)
    {
        Comparator<String> comparator = new StringLengthComparator();
        PriorityQueue<String> queue =
                new PriorityQueue<String>(10, comparator);
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }
    }
}

// StringLengthComparator.java

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String x, String y) {
        if(x.length()>y.length()) {
            return 1;
        }
        if(x.length()<y.length()){
            return -1;
        }
    return 0;
    }
}
