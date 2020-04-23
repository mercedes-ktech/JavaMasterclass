public class FloatsAndDoubles {

    public static void main(String[] args) {

        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println(myFloatMinValue);
        System.out.println(myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println(myDoubleMinValue);
        System.out.println(myDoubleMaxValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double totalPounds = 200d;
        double poundToKg = 0.45359237d;
        double totalKg = totalPounds * poundToKg;
        System.out.println();
        System.out.println(totalKg);




    }
}
