
public class MethodPractice {

	public static void main(String[] args) {
		int a = 20;
		int b = 2;
		
		viewNumbers(sumNumbers(a, b));
		viewNumbers(diffNumbers(a, b));
		viewNumbers(proNumbers(a, b));
		viewNumbers(quoNumbers(a, b));
	}
	
	public static int sumNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int diffNumbers(int a, int b) {
		int diff = a - b;
		return diff;
	}
	
	public static int proNumbers(int a, int b) {
		int pro = a * b;
		return pro;
	}
	
	public static int quoNumbers(int a, int b) {
		int quo = a / b;
		return quo;
	}
	
	public static void viewNumbers(int num) {
		System.out.println("計算結果は" + num + "です。");
	}

}
