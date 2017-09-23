public class SumOfTwoDice {

	public static void main(String[] args) {
		int max = 6;
		int min = 1;

		int one = (int)(Math.random() * max) + min;
		int two = (int)(Math.random() * max) + min;
		// System.out.println(one);
		// System.out.println(two);

		int sum = one + two;

		System.out.println(sum);
	}
}