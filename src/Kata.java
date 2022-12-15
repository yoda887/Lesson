import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

    public static void main (String[] arg){
        System.out.println(isSquare(4) );
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }

    public static void arrayDiff1 (int[] a, int[] b) {
        IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).forEach(System.out::println);
    }

    public static boolean isSquare(int n) {
        return (int)Math.sqrt(n) % 2 == 0; // fix me!
    }

    
}
