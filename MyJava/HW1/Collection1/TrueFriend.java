package HW1.Collection1;
import java.util.*;


public class TrueFriend {
    public static void main(String[] args){
        String[] friends1 = {"看教练", "dasfa", "eawr"};
        String[] friends2 = {"dasfa", "dasfa", "发个帅哥冻分割肉"};

        List friendsAL1 = Arrays.asList(friends1);
        List friendsAL2 = Arrays.asList(friends2);

        Set<String> friendsSet1 = new HashSet<String>(friendsAL1);
        Set<String> friendsSet2 = new HashSet<String>(friendsAL2);

        ArrayList<String> trueFriends = new ArrayList<String>();
        for (Iterator<String> it = friendsSet1.iterator(); it.hasNext(); ) {
            String s = it.next();
            if (friendsSet2.contains(s)){
                trueFriends.add(s);
            }
        }
        
        System.out.println(trueFriends.toString());
    }
}
