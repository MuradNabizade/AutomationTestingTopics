import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class JAVASTREAM {

	public static void main(String[] args) {
		//count the number of names starting with A in list

		
		//
		List<String> names = new ArrayList<String>();
		names.add("Abhijet");
		names.add("Abhdwddwdwdwijedwdwdwt");
		names.add("Alext");
		names.add("Ahmad");
		names.add("yellow bird");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		Long b = Stream.of("AAADD","Don","Yellow Bird","Ahmad").filter(s->s.startsWith("A")).count();
		System.out.println(b);
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		Stream.of("AAADD","Don","Yellow Bird","Ahmad").filter(s->s.endsWith("d")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));;
		
	}

}
