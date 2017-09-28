package CodeFights;

/**
 * Created by manika on 4/19/17.
 */
public class knapsackLight {
    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int value=0,max=0;
        int maxValue=(value1>=value2)?value1:value2;
        if(maxValue==value1) {
            if (maxW < weight1 && maxW < weight2) return 0;

            if (maxW >= weight1) {
                value = value1;
                maxW = maxW - weight1;
            }
            if (maxW >= weight2) {
                value += value2;
            }
            max=value;
        }
        else if(maxValue==value2){
            if (maxW < weight1 && maxW < weight2) return 0;

            if (maxW >= weight2) {
                value = value2;
                maxW = maxW - weight2;
            }
            if (maxW >= weight1) {
                value += value1;
            }
            max=value;

        }
        return max;
    }

    public static void main(String[] args) {
        int value1 = 10, weight1 = 5, value2 = 6, weight2 = 4,maxW=9;
        System.out.println(knapsackLight(value1, weight1, value2, weight2, maxW));
    }
}
