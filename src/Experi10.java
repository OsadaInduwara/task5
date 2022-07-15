import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Experi10 {
	
	class EFilter implements Predicate<String>{
		public boolean test(String name) {
			return name.contains("e");
		}
	}
	
	public void run() {
		String[] n1 = {"kamal", "dilan", "gomes"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.stream().filter(new EFilter()).forEach(name -> System.out.println(name));
	}
	
	public static void main (String[] args) {
		new Experi10().run();
	}

}
