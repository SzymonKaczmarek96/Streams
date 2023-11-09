package inner;

public class AnonymousClass {
    public interface Counting {
        void count(int a, int b);
    }

    public void method(int a, int b){
        Counting counting = (a1, b1) -> System.out.println("I will count from " + a1 + " to " + b1);

        counting.count(a, b);
    }

    /**
     * Default way of instantiation
     */
    public class CountingImpl implements Counting {

        @Override
        public void count(int a, int b) {
            System.out.println("I will count from " + a + " to " + b);
        }
    }

    public void methodBasicWay(int a, int b) {
        Counting counting = new CountingImpl();
        counting.count(a, b);
    }
}
