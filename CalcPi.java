// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	  int reps = Integer.parseInt(args[0]);
	  int divider = 1; 
	  double x = 1; 
	  double quarterPi = 0; 
	  for (int i = 0; i < reps; i++) {
		x = 1 / (double) divider;
		if (i % 2 == 0) {
			quarterPi = quarterPi + x;
		} else {
			quarterPi = quarterPi - x;  
		} 
		divider = divider + 2; 
	  }
	  System.out.println("pi according to Java: " + Math.PI);
	  System.out.println("pi, approximated:     " + quarterPi * 4); 
	}
}
