package appendix;

import java.util.Optional;

/**
 * mapとflatMapの違い。
 */
public class ListAppendix_1 {

    public static void main(String[] args) {
        Optional<Object> resultOfMap = Optional.of("a")
                .map(t -> Optional.of(t + "b"))
                .map(t -> Optional.of(t + "c"));
        System.out.println("resultOfMap:" + resultOfMap);

        Optional<Object> resultOfFlatMap = Optional.of("a")
                .flatMap(t -> Optional.of(t + "b"))
                .flatMap(t -> Optional.of(t + "c"));
        System.out.println("resultOfFlatMap:" + resultOfFlatMap);
    }
}
