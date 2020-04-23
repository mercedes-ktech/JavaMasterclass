public class MethodOverloading {

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {

        double feetToCm;
        double inchesToCm;

        if (feet <=0 || inches <= 0 || inches >= 12) {
            return -1;
        }
        else {
            feetToCm = feet / 0.032808;
            inchesToCm = inches * 2.54;

            //cm = (feet * 12) * 2.54; --> calculates feet to inches to cm
            //cm += inches * 2.54; --> adds inches to cm to the above
        }

        return feetToCm + inchesToCm;

    }

    public static double calcFeetAndInchesToCentimetres(double inches) {

        double feet;
        double cm;

        if (inches <= 0) {
            return -1;
        }

        feet = (int) inches / 12;
        double inchesLeft = (int) inches % 12;
        //cm = calcFeetAndInchesToCentimetres(feet, inchesLeft);
        //return cm;
        return calcFeetAndInchesToCentimetres(feet, inchesLeft); //calling and returning the method at the same time

    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimetres(4,20));
        System.out.println(calcFeetAndInchesToCentimetres(434));
    }

}
