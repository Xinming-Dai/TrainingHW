package HW1;

import java.util.Arrays;
import java.util.StringTokenizer;


public class String3 {
    public static void main(String[] args){
        StringTokenizer t = new StringTokenizer("https://www.amazon.com/demo?test=abc", "://.?=");
        String[] myTokens = new String[t.countTokens()];
        int i = 0;
        while (t.hasMoreTokens()){
            myTokens[i++] = t.nextToken();
        }            
        System.out.println(Arrays.toString(myTokens));
    }
    
}
