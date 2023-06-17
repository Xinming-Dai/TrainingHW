package HW2.ExecutorService;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        String result = outerClass.runSameTime();
        System.out.println(result);
    }
}