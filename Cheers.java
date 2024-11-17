// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0].toUpperCase(); 
            int reps = Integer.parseInt(args[1]); 
            String aOrAn = "a"; 
            String anLetters = "AEFHILMNORSX"; 
            for (int i = 0; i < name.length(); i++) {
                if (anLetters.indexOf(name.charAt(i)) != -1){
                        aOrAn = "an";
                } else {
                        aOrAn = "a ";
                }
                System.out.println("Give me " + aOrAn + " " + name.charAt(i) + ": " + name.charAt(i) + "!");
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < reps; i++) {
                System.out.println(name + "!!!");
            }
        }
}
