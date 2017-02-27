package dylan.PracticeSet2;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public static void isEven(int iValue) {
		if (iValue % 2 == 0)
			System.out.println("True");
	}

	public static void isOdd(int iValue) {
		if (iValue % 2 == 1)
			System.out.println("true");
	}

	public static void isPrime(int iValue) {
		for (int i = 2; i <= iValue; i++) {
			if (iValue % i == 0) {
				break;
			}
			System.out.println("true");
		}
	}
}