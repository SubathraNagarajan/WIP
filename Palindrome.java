package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		char[] array = value.toCharArray();
		int length = array.length;
		String reverse = "";
		for(int i = length-1 ; i >=0; i--) {
			reverse = reverse+array[i];
		}
		System.out.println(reverse);

	}

}
  