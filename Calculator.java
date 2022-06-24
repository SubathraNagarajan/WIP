package assignment.day2;

public class Calculator {
int a = 5;
int b = 10;
public int addTwoNumbers(int a, int b) {
	int c=a+b;
	System.out.println(c);
	return c;
}
public float subTwoNumbers(int a, int b) {
	int d = b-a;
	System.out.println(d);
	return d;
}
public static void main(String[] args) {
// LearnMethod obj = new LearnMethod();
// obj.addTwoNumbers();
 System.out.println(addTwoNumbers());
}

}