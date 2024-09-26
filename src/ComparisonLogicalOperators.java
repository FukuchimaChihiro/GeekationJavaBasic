
public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 8;
		int b = 3;
		boolean isGreater = (a >b);
		
		System.out.println(isGreater);
		
//		String weather = "晴れ";
//		String temp = "暖かい";
//		boolean isSunny = (weather == "晴れ" && temp == "暖かい");
//		boolean isWorm = !isSunny;
//		
//		System.out.println(isSunny);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean andResultA = (isSunny == true && isWarm == true);
		System.out.println(andResultA);
		
		int x = 3;
		int y = 4;
		boolean andResultB = (x > 0 && y % 2 == 0);
		
		System.out.println(andResultB);
		
		boolean hasPermission = false;
		
		System.out.println(!hasPermission);
	}

}
