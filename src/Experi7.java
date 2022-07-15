import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Experi7 {
	public void run() {
		String[] n1 = {"kamal", "dilan", "gomes"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.forEach(new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
		}
		});
	}
	
	public static void main(String[] args) {
		new Experi7().run();
		
	}
	

}

//this version is similar to the last class but uses
//an anonymous inner class
