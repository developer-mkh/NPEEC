package section1;

/**
 * ラムダ式を用いたインターフェースの実装。
 */
public class List1_2 {
    public static void main(String[] args) {

        Runnable runnable =
                () -> System.out.println("Hello, world.");
        runnable.run();
    }
}
