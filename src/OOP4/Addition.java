package OOP4;

public class Addition {

	int x;
	int y;

	void add()

	{
		int sum = x + y;
		System.out.println(sum);

	}

	int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;

	}

	double add(double a, double b, double c) {

		double sum = a + b + c;
		return sum;

	}

	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.x = 100;
		a1.y = 200;
		a1.add();
		
		int sum = a1.add(200, 200, 200);
		System.out.println(sum);
		
		double sum1 = a1.add(100.20, 200.201, 120.1);
		System.out.println(sum1);
		
		
		

		Addition a2 = new Addition();

		int sum3 = a2.add(100, 2001, 100);

		System.out.println(sum3);
		double sum4= a2.add(2.3, 3.5, 4.8);
        System.out.println(sum4);
	}// end of main

}// end of class
