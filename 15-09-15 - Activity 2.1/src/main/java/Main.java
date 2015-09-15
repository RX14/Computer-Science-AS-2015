public class Main {
	public static void main(String[] args) {
		int width = 9;
		int height = 9;

		int area = width * height;

		// Stupid java with no string interpolation
		System.out.println("A rectangle with the size " + width + "x" + height + "cm has an area of " + area + " cm²");
	}
}
