import java.util.Arrays;
import java.util.List;

public class Experi3 {
	public static void main(String[] args) {
		String[] n1 = {"kamal", "dilan", "gomes"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println(n2.getClass());
		for(String name:n2) {
			System.out.println(name);
		}
		
		
		
	}

}

