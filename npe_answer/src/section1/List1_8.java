package section1;

import java.util.function.BiPredicate;

/**
 * List1_4をメソッド参照で記述する。
 */
public class List1_8 {

    public static void main(String[] args) {
        BiPredicate<String, String> bp = String::equals;
        System.out.println(bp.test("ABC", "ABC"));
        System.out.println(bp.test("ABC", "ACB"));
    }
}
