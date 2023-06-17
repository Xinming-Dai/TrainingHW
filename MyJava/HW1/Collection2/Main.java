package HW1.Collection2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String myString = "asdfasdfxyz";

        Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();

        for (int i = 0; i < myString.length(); i++) {
            String currentChar = myString.substring(i, i+1);

            Integer currentCount = hashtable.get(myString);
            if (currentCount == null) {
                hashtable.put(currentChar, 1);
            } else {
                hashtable.replace(currentChar, currentCount + 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = hashtable.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            if (value >= 2) {
                System.out.println(key + " is a duplicate");
            }
        }

        System.out.println("===========");


        Iterator<Map.Entry<String, Integer>> iterator2 = hashtable.entrySet().iterator();

        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry = iterator2.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            System.out.println(key + " counts:" + value);
        }
    }
}
