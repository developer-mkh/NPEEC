package section1;

/**
 * ラムダ式のスコープ。
 */
public class List1_6 {

    public static void main(String args[]) {
        List1_6 obj = new List1_6();
        obj.print();
    }

    public void print() {
        Runnable runnable = () -> System.out.println(this);
        runnable.run();
    }

    public String toString() {
        return "List1_6#toString.";
    }
}
