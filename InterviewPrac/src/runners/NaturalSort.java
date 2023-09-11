package runners;

import java.util.Arrays;

public class NaturalSort {
	public static void mySort(char[] arr) {
		int arr_size= arr.length;int i=0,j=0; char temp;
		while(i<arr_size) {
			j=i+1;
			while(j<arr_size) {
				if(arr[j]<arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}j+=1;
			}i+=1;
		}for(char a:arr) {System.out.println(a);}
	}
	public static void main(String[] args) {
		char[] arr= {100,30,180,10,25,35,85};
		mySort(arr);
		
		String strInput="helloworld";
		mySort(strInput.toCharArray());
	}

}
