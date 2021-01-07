import java.util.stream.IntStream;

public class CodilityDemo {

    public static int solution(int[] A) {
        return IntStream.of(A)
                .filter((i) -> i > 0)
                .sorted()
                .distinct()
                .reduce(0, (a, b) -> {
                    return a + 1 != b ? a : b;
                }) + 1;
    }
}
