package runners;

import java.util.stream.IntStream;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=17, b=a/2;
		IntStream.range(1, b).forEach(index->{
			if(a%b==0) {
				System.out.println("NP");
			}else {
				System.out.println("P");
			}
		});
	}
}
