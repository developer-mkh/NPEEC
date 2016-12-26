package section2;

import java.util.Optional;
import java.util.Random;

/**
 * Optionalの使い方の基本。
 */
public class List2_3 {

    public static void main(String[] args) {
        List2_3 obj = new List2_3();
        for (int i = 0;i < 10; i++) {
            Optional<String> strOpt = Optional.ofNullable(obj.getString());
            System.out.println("Optionalの値は、" + strOpt);
            strOpt.ifPresent(t -> System.out.println("文字数は、" + t.length()));
            Optional<String> processedStrOpt = strOpt.map(t -> "null以外が返ってきました:" + t);
            System.out.println(processedStrOpt.orElse("nullでした。"));
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
