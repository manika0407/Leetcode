package Graph;

import java.util.LinkedList;

/**
 * Created by manika on 4/23/17.
 */
public class Bipartite {
    public static void main(String[] args) {
        int G[][] = {{0, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0}
        };
        Bipartite b = new Bipartite();
        if (b.isBipartite(G, 0))
            System.out.println("Graph is bipartite");
        else
            System.out.println("Graph is not bipartite");
    }
    final static int V=4;
    public boolean isBipartite(int G[][], int src){
        int[] colorArr=new int[V];
        for(int i=0;i<V;i++)
            colorArr[i]=-1;
        LinkedList<Integer> q=new LinkedList<Integer>();
        q.add(src);
        while(q.size()!=0){
            int u=q.poll();
            for(int v=0;v<V;v++){
                if(G[u][v]==1 && colorArr[v]==-1){
                    colorArr[v]=1-colorArr[u];
                    q.add(v);
                }
                else if (G[u][v]==1 && colorArr[u]==colorArr[v])
                    return false;
            }
        }
        return true;
    }
}
