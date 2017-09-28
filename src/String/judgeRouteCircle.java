package String;

/**
 * Created by manika on 9/5/17.
 */
public class judgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int v=0, h=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')
                v++;
            else if(moves.charAt(i)=='D')
                v--;
            else if(moves.charAt(i)=='L')
                h--;
            else
                h++;
        }
        return (v==0 && h==0);
    }

    public static void main(String[] args) {
        String s="";
        System.out.println(new judgeRouteCircle().judgeCircle(s));
    }
}
