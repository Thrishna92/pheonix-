package interm;

public class AddReturnValue {

	int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	double decimal(double x, double y, double z) { // methods
		double total = x + y + z;

		return total;
	}

	int add(int a, int b) {

		int add = a + b;
		return add;

	}

	int multi(int a, int b, int c, int d) {
		int value = a * b * c * d;
		return value;

	}

	public static void main(String[] args) { //

		AddReturnValue a1 = new AddReturnValue();

		{
			int sum = a1.add(100, 100, 100); // objects---object are instance of class
			// program to print

			double total3 = a1.decimal(1.2, 2.3, 2.5);

			int add = a1.add(10, 20);

			int total1 = a1.multi(10, 20, 30, 40);

			System.out.println(sum);
			System.out.println(total1);
			System.out.println(add);
			System.out.println(total3);

		}

	}// main

}// Class
