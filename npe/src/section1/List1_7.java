package section1;

import java.util.function.Consumer;

/**
 * メソッド参照。
 */
public class List1_7 {

    public static void main(String[] args) {
        Consumer<String> c = (t) -> System.out.println(t);
        Consumer<String> methodRef = System.out::println;

        c.accept("Hello, world.");
        methodRef.accept("Hello, world.");
    }
}
