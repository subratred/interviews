package runners;

public class PallindromeTest {
	public static boolean isPallindrome(String input) {
		int i = 0, j = input.length()-1;
        while (i < j) {
        	System.out.println(input.charAt(i)+"-----"+input.charAt(j));
            if (input.charAt(i) != input.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
	}
	public static void main(String[] args) {
		System.out.println(isPallindrome("nittin"));
	}

}
