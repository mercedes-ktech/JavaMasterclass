public class SecondsAndMinutes {

    public static String getDurationString (int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {

            return "Invalid value";
        }
        //how many hours, minutes and seconds equal the minutes and seconds passed as arguments to this method

        int minToHour = minutes / 60;
        int minRemainder = minutes % 60;

        return  minToHour + "hs " + minRemainder + "m " + seconds + "s";

    }

    public static String getDurationString (int seconds) {

        if (seconds < 0) {

            return "Invalid value";
        }
        //how many min in seconds

        int secToMin = seconds / 60;
        int secRemainder = seconds % 60;

        return  getDurationString(secToMin, secRemainder);

    }


    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(34521));
    }

}
