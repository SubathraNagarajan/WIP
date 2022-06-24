package classroom.week2;

public class CharOccurance {

	public static void main(String[] args) {
		String value = "Welcome to Coimbatore";
	//	String str = new String("Welcome to Coimbatore");
		int counter = 0;
		char[] array = value.toCharArray();
		int length =array.length;
		for (int j=0; j<length; j++)
		{
			if (array[j] == 'o') {
				counter++;
				
			}

		}
		System.out.println("Number Of Occurance of o is "+ counter);

		

	}

}
