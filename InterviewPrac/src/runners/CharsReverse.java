package runners;

public class CharsReverse {
	public static String getRev(String input) {
		StringBuilder stringBuilder= new StringBuilder();
		char[] input_arr=input.toCharArray();int counter=input_arr.length-1;
		System.out.println(input_arr.length);
		while(counter>=0) {
			stringBuilder.append(input_arr[counter]);
			counter--;
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(getRev("hello world"));
	}
}
