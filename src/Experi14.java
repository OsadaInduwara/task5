import java.util.stream.Stream;

public class Experi14 {
	  class NameStreamBuilder {
		    public Stream<String> build(){
		      Stream.Builder<String> builder = Stream.builder(); 
		      builder.add("kamal");
		      builder.add("dilan");
		      builder.add("gomes");
		      return builder.build();
		    }
		  }
		  
		  public void run() {
		    NameStreamBuilder builder = new NameStreamBuilder();
		    Stream <String> nameStream = builder.build();
		    nameStream.forEach(n -> System.out.println(n));
		  }

		  public static void main(String[] args) {
		    new Experi14().run();
		  }
}
