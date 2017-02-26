package week3_backlogs;

public class FibonacciOPerations {
	public static void main(String[] args) {

		boolean fibend =false;
		int a = 0, previous = 0, next = 1, temp;
		//System.out.println(previous);
	 //System.out.println(next);
		while (!fibend) 
		{
		temp = previous + next;
		previous = next;
		next = temp;
		//System.out.println(temp);
		if (temp >1000000) {

			fibend = true;
			break;
		}

		if (temp % 2 == 0) {
			a += temp;
			
		}
		
		}
		System.out.println(a);}}