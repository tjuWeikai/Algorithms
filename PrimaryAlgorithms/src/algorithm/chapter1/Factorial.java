package algorithm.chapter1;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));
		
	}

	public static long factorial(int n) {
		
		// the foundation
		if (n == 0) {
			return 1;
		}
		return factorial(n - 1) * n;

	}

}
