import java.util.Arrays;
import java.util.List;

public class Experi9 {
	public void run() {
		String[] n1 = {"kamal", "dilan", "gomes"};
		
		List<String> n2 = Arrays.asList(n1);
		
		/*
		 * use a Lambda to implement a predicate that filters
		 * out names that do not include an 'e' character
		 */
		
		n2.stream().filter(name -> name.contains("e"))
		.forEach(name -> System.out.println(name));
	}
	
	public static void main(String[] args) {
		new Experi9().run();
	}

}
