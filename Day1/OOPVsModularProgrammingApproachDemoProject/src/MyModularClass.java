
public class MyModularClass {

	static int number,factorial;
	
	static public void input(int n) {
		number=n;
	}
	
	static public void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	static public void display() {
		System.out.println("Factorial : "+factorial);
	}
	
	public static void main(String[] args) {
		input(5);
//		number=0;
		calculateFactorial();
		factorial=5;
		display();

	}

}
