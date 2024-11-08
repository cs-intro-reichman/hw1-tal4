// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int a = (int) (range * Math.random());
		int b = (int) (range * Math.random());
		int c = (int) (range * Math.random());
		System.out.println(a + " " + b + " " + c);
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		int mid = Math.max(Math.max(Math.min(a, b), Math.min(b, c)), Math.min(a, c));
		System.out.println(min + " " + mid + " " + max);
	}
}
