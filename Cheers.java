// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String nameInput = args[0]; 
            String lowerCase = "abcdefghigklmnopqrstuvwxyz";
            String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String capitalName = ""; 
            int j = 0; 
            while (j < nameInput.length()) {
                char letter = nameInput.charAt(j);
                if (lowerCase.indexOf(letter) == -1) {
                        capitalName += letter; 
                        j++;
                } else {
                        letter = upperCase.charAt(lowerCase.indexOf(letter)); 
                        capitalName += letter; 
                        j++;
                }
            }  
            int reps = Integer.parseInt(args[1]); 
            String aOrAn = "a"; 
            String anLetters = "AEFHILMNORSX"; 
            for (int i = 0; i < capitalName.length(); i++) {
                if (anLetters.indexOf(capitalName.charAt(i)) != -1){
                        aOrAn = "an";
                } else {
                        aOrAn = "a ";
                }
                System.out.println("Give me " + aOrAn + " " + capitalName.charAt(i) + ": " + capitalName.charAt(i) + "!");
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < reps; i++) {
                System.out.println(capitalName + "!!!");
            }
        }
}
