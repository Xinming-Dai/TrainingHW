package HW2.ExecutorService;

public class OuterClass {
    private String result;

    public class A {
        public String getMethod() {
            return "A.getMethod";
        }
    }

    public class B {
        public String getMethod() {
            return "B.getMethod";
        }
    }

    public String runSameTime() {
        A a = new A();
        B b = new B();

        Thread threadA = new Thread(() -> {
            result = b.getMethod();
        });

        Thread threadB = new Thread(() -> {
            result += " " + a.getMethod();
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }
}