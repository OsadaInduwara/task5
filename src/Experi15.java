import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Experi15 {
	  public static void main(String[] args) {
		    Function<Integer, Double> reciprocal = new Function<Integer, Double>() {
		      public Double apply(Integer n) {
		        return 2.0 / n;
		      }
		    };
		    System.out.println(reciprocal.apply(500));

		    IntStream denominators = IntStream.range(10, 100);
		    denominators.map((IntUnaryOperator) reciprocal)
		        .forEach(System.out::println);
		  }
}
