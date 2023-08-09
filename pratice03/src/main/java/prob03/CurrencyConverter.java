package prob03;

public class CurrencyConverter {
	static double rate = 0;

	public static void setRate(double d) {
		// TODO Auto-generated method stub
		rate = d;
	}

	public static double toDollar(double d) {
		// TODO Auto-generated method stub
		return d / rate;
	}

	public static double toKRW(double d) {
		return d * rate;
	}

}
