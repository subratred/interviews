package runners;

public class Fibonassi {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		
		for(int i=0;i<20;i++) {
			if(c==0||c==1) {
				System.out.println(c);
			}
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		/*IntStream.range(0, 10).forEach(n->{if(n%2==0)
			{System.out.println(true);}
		});*/
	}
}
