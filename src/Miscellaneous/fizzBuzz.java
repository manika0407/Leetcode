package Miscellaneous;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 4/1/17.
 */
public class fizzBuzz {
    public static List<String> fizzBuzz(int n){
        List<String> result=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0)
                result.add("FizzBuzz");
            else if(i%5==0)
                result.add("Buzz");
            else if(i%3==0)
                result.add("Fizz");
            else
                result.add(String.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result=fizzBuzz(15);
        System.out.println(result);
    }
}
