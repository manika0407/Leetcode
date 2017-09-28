package DynamicProgramming;

/**
 * Created by manika on 4/23/17.
 */
public class PaintHouse {
    public static int mincost(int costs[][]){
        if(costs==null ||costs.length==0)
            return 0;
        for(int i=1;i<costs.length;i++){
            costs[i][0]+=Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1]+=Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2]+=Math.min(costs[i-1][0],costs[i-1][1]);
        }
        int m= costs.length-1;
        return Math.min(Math.min(costs[m][0], costs[m][1]), costs[m][2]);

    }
    public static void main(String[] args){
        int[][] costs={{1,2,3},{2,3,1},{1,2,8},{2,3,6}};
        System.out.println(mincost(costs));


    }
}

