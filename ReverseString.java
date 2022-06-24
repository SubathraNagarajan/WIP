package classroom.week2;


public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		char[] array = test.toCharArray();
		String reverse = "";
		int length = test.length();
		for(int i=length-1; i>=0; i--) {
		reverse = reverse+array[i];
		//System.out.println(array[i]);

		}
		System.out.println(reverse);
	}

}
