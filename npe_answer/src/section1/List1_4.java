package section1;

import java.util.function.BiPredicate;

/**
 * 文字列の引数を2つ取り、両者が同じ文字列表現か判定するラムダ式。
 */
public class List1_4 {

    public static void main(String[] args) {
        BiPredicate<String, String> bp = (t, u) -> t.equals(u);
        System.out.println(bp.test("ABC", "ABC"));
        System.out.println(bp.test("ABC", "ACB"));
    }
}
