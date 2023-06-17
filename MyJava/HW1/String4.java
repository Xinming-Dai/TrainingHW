package HW1;

public class String4 {
    public static void main(String[] args){
        String[] myArray = {"fadf", "dasfga"};
        System.out.println(myConcatenate(myArray));
        
    }
    
    public static String myConcatenate(String[] myArray){
        String str = "";
        for(int i = 0; i < myArray.length; i++){
            str += myArray[i];
        }
        return str;
    }
}
