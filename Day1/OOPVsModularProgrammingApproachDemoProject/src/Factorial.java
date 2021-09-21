
/*
 * 1. Data
 * 2. scope of data : modifiable or readable or both
 * 3. For modifiable data : create setter
 * 4. For readable data : create getter
 * 5. For modifiable and readable data : create both setter and getter
 */
/*
 * Encapsulation : class
 * Data Hiding : private access specifier
 * Abstraction : methods
 */
public class Factorial{
	
	private int number,factorial;

	private void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
		
}
