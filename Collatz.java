// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seedsRange = Integer.parseInt(args[0]); 
		String mode = args[1]; 
		int seed = 1; 
		int nextOne = 0; 
		int countVowels = 0; 
		while (seed <= seedsRange) {
			nextOne = seed; 
			if (mode.charAt(0) == 'v') {
				System.out.print(seed + " ");
			}
			countVowels ++; 
			if (seed == 1) {
				nextOne = nextOne * 3 + 1; 
				if (mode.charAt(0) == 'v') {
					System.out.print(nextOne + " "); 
				}
				countVowels ++; 
			}
			while (nextOne != 1) {
				if (nextOne % 2 == 0) {
					nextOne = nextOne / 2; 
					if (mode.charAt(0) == 'v') {
						System.out.print(nextOne + " ");
					}
					countVowels ++; 
				} else {
					nextOne = nextOne * 3 + 1; 
					if (mode.charAt(0) == 'v') {
						System.out.print(nextOne + " ");
					}
					countVowels ++; 
				}
			}
			if (nextOne == 1) {
				if (mode.charAt(0) == 'v') {
					System.out.println("(" + countVowels + ")"); 
				} 
				seed ++;  
				countVowels = 0; 
			} 
		}
		System.out.print("Every one of the first " + seedsRange + " hailstone sequences reached 1.");
	}
}
