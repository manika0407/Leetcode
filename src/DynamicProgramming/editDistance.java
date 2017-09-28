package DynamicProgramming;



/**
 * Created by manika on 4/16/17.
 */
public class editDistance {
    public static void main(String[] args) {
        String str1="Sunday";
        String str2="Saturday";
        System.out.println(editDistanceDynamic(str1,str2,str1.length(),str2.length()));

    }

    private static int editDistanceDynamic(String str1, String str2, int m, int n) {
        int i,j;
        int[][] temp=new int[m+1][n+1];
        for(i=0;i<=m;i++)
        {
            temp[i][0]=i;
        }
        for(j=0;j<=n;j++)
        {
            temp[0][j]=j;
        }
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    temp[i][j]=temp[i-1][j-1];
                else
                    temp[i][j]=1+min(temp[i-1][j-1],temp[i][j-1],temp[i-1][j]);
            }
        }
        printActualEdits(temp,str1.toCharArray(),str2.toCharArray());
        return temp[m][n];
    }

    public static void printActualEdits(int T[][], char[] str1, char[] str2) {
        int i = T.length - 1;
        int j = T[0].length - 1;
        while(true) {
            if (i == 0 || j == 0) {
                break;
            }
            if (str1[i-1] == str2[j-1]) {
                i = i-1;
                j = j-1;
            } else if (T[i][j] == T[i-1][j-1] + 1){
                System.out.println("Edit " + str2[j-1] + " in string2 to " + str1[i-1] + " in string1");
                i = i-1;
                j = j-1;
            } else if (T[i][j] == T[i-1][j] + 1) {
                System.out.println("Delete in string1 " + str1[i-1]);
                i = i-1;
            } else if (T[i][j] == T[i][j-1] + 1){
                System.out.println("Delete in string2 " + str2[j-1]);
                j = j -1;
            } else {
                throw new IllegalArgumentException("Some wrong with given data");
            }

        }
    }


    private static int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
}
