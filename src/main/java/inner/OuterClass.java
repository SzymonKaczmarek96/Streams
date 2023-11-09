package inner;

public class OuterClass {

    private InnerClass innerClass;

    public int oneOfThoseMethods(int a, int b){
        class LocalClass{
            public int calculate(){
                return a+b;
            }
        }
        LocalClass localClass = new LocalClass();
        int calculate = localClass.calculate();
        return calculate + 10;
    }

    public class InnerClass {
        private String title;
    }

    public static class StaticInnerClass{

    }
}
