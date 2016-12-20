package section1;

/**
 * 無名クラスのスコープ。
 */
public class List1_5 {

    public static void main(String[] args) {
        List1_5 obj = new List1_5();
        obj.print();
    }

    public void print() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(this);
            }
        };
        runnable.run();
    }

    public String toString() {
        return "list1_5#toString.";
    }
}
