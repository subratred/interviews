package runners;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStreamer {

	public static void main(String[] args) {
		List<Integer> integers= Arrays.asList(50,2,30,1,0,30);
		List<String> strings= Arrays.asList("Three","Two","None","Five");
		//System.out.println(integers.stream().anyMatch(n->n==5));
		List<Integer> evens = integers.stream().filter(n->n%2==0).collect(Collectors.toList());
		strings.stream().filter(n->n.startsWith("T")).map(String::toUpperCase).forEach(System.out::println);
		//evens.stream().forEach(System.out::println);
	}

}
