package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 9/1/17.
 */
class Interval {
 int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {

        if(intervals.size()<=1)
            return intervals;
        intervals.sort((i1,i2)->Integer.compare(i1.start, i2.start));

        List<Interval> result=new ArrayList<Interval>();
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(Interval interval: intervals){
            if(interval.start<=end){
                end=Math.max(end, interval.end);
            }
            else{
                result.add(new Interval(start,end));
                start=interval.start;
                end=interval.end;
            }
        }
result.add(new Interval(start,end));
return result;
    }
}
