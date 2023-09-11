package runners;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatElements {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,10,3,7,1,5,10,2,7};
		int arr_size=arr.length;
		nonRepeatElements(arr, arr_size);
		//repeatElements(arr, arr_size);
		//arrayToMap();
	}

	private static void repeatElements(int[] arr, int arr_size) {
		int arrOut[] = new int[arr_size];
		List<Integer> response= new ArrayList<>();
		for(int i=0;i<arr_size-1;i++) {
			for(int j=i+1;j<arr_size;j++) {
				if(arr[i]==arr[j]) {
					arrOut[i]=arr[i];
					response.add(arr[i]);
					//System.out.println(String::valueOf(arrOut[i]));
				}
			}
		}
		response.forEach(System.out::println);
	}

	private static void nonRepeatElements(int[] arr, int arr_size) throws IOException {
		Map<Integer,Integer> output= new HashMap<>();
		for(int a:arr) {
			if(output.containsKey(a)) {
				output.put(a, output.get(a)+1);
			}else {
				output.put(a, 1);
			}
		}for(Integer key:output.keySet()) {
			if(output.get(key)==1) {
				System.out.println(key+"->"+output.get(key));
			}
		}
	}
	
	public static void arrayToMap() {
		String str1 = "abcdABCDabcd";
		char[] chars = str1.toCharArray();
		Map<Character, Integer> charsCount = new HashMap<>();
		for (char c : chars) {
			if (charsCount.containsKey(c)) {
				charsCount.put(c, charsCount.get(c) + 1);
			} else
				charsCount.put(c, 1);
		}
		System.out.println(charsCount); //{a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
	}
}
