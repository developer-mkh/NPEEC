package section1;

import java.util.function.BiFunction;

/**
 * 数値の引数を2つ取り、両者を足し算するラムダ式。
 */
public class List1_3 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bf = (t, u) -> t + u;
        System.out.println(bf.apply(2, 5));
    }
}
