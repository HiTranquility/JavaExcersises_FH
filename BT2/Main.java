package BT2;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		String[] arr = new String[] {"abc", "aa", "bc", "ac", "ba", "ca", "ab"};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(String[] arr)
	{ 
		for (int i = 0; i < arr.length - 1; i++) {
	           for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i].compareTo(arr[j]) > 0) {
	                    String temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	           }
		 }
	}
}
