package inner;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass inner = outerClass.new InnerClass();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
    }
}
