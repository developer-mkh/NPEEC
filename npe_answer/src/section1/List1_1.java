package section1;

/**
 * ラムダ式を使わず無名クラスを用いた実装。
 */
public class List1_1 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, world.");
            }
        };
        runnable.run();
    }
}
