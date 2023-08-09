package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] d = new double[a.length];
		for(int i=0; i < a.length; i++) {
			d[i] = a[i];
		}
		return d;
	}

	public static int[] doubleToInt(double[] ds) {
		int[] a = new int[ds.length];
		for(int i=0; i< ds.length;i++) {
			a[i] = (int)ds[i];
		}
		return a;
	}

	public static int[] concat(int[] a1, int[] a2) {
		int[] a = new int[a1.length+a2.length];
//		for(int i=0; i<a.length;i++) {
//			a[]
//		}
		return null;
	}

}
