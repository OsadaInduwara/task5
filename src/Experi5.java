import java.util.Arrays;
import java.util.List;

public class Experi5 {
	
	public static void main(String[] args) {
		String[] n1 = {"kamal", "dilan", "gomes"};
		

		List<String> n2 = Arrays.asList(n1);
		n2.forEach(name -> System.out.println(name));
	}
	

}
