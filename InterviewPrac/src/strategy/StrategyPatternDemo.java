package strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(1, 2));
	}
}
