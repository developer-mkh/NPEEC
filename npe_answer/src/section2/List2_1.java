package section2;

import java.util.Random;

/**
 * nullチェックしない場合。
 */
public class List2_1 {

    public static void main(String[] args) {
        List2_1 obj = new List2_1();
        for (int i = 0;i < 10; i++) {
            String str = obj.getString();
            System.out.println("値は、" + str);
            System.out.println("文字数は、" + str.length());
            System.out.println();
        }
    }

    /**
     * 文字列を返す。まれに文字列がnullになる。
     * @return 文字列。
     */
    public String getString() {
        Random rnd = new Random();
        int p = rnd.nextInt(10);

        String ret;
        if (p >= 5) {
            ret = null;
        } else {
            ret = "Hello, world.";
        }

        System.out.println("getStringの戻り値:" + ret);

        return ret;
    }
}
