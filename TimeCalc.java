public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; 
        int minutesToAdd = Integer.parseInt(args[1]); 
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); 
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); 
        int newMinutes = minutes + minutesToAdd ; 
        while (newMinutes >= 60) {
            newMinutes = newMinutes - 60; 
            hours ++;
            if (hours == 24) {
                hours = 0; 
            } 
        }
        String minutesOut = "" + newMinutes; 
        if (newMinutes < 10) {
            if (newMinutes == 0){
                minutesOut = "00"; 
            } else {
            minutesOut = "0" + newMinutes;
            }
        }
        String hoursOut = "" + hours; 
        if (hours < 10) {
            if (hours == 0){
                hoursOut = "00"; 
            } else {
            hoursOut = "0" + hours;
            } 
        }
        System.out.println(hoursOut + ":" + minutesOut);
    }
}
