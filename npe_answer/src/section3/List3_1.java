package section3;

import java.util.Optional;

/**
 * 引数で指定された環境変数の先頭の文字を大文字にして表示する。
 */
public class List3_1 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Usage: List3_1 環境変数名");
            return;
        }

        Optional.of(System.getenv())
                .map(t -> t.get(args[0]))
                .map(t -> t.substring(0, 1))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}
