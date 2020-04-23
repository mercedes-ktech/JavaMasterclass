public class Hello {

    public static void main (String[] args) {

        System.out.println("Hello Mer!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);


        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println(myMinIntValue);
        System.out.println(myMaxIntValue);

        int myValeTest = -2_147_483_647;
        System.out.println(myValeTest);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myLongValue = 100L;
        long bigLongLiteralValue = 2_147_483_647;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        byte myByteValue = 127;

        byte myNewByteValue = (byte) (myByteValue / 2);

        // -----
        byte merByte = 4;
        short merShort = 32765;
        int merInt = 256756;
        long merLong = 50000L + ((merByte + merShort + merInt) * 10L);
        System.out.println("long total " + merLong);

        short shortTotal = (short) (50000 + 10 * merByte + merInt + merShort);
        System.out.println("short total " + shortTotal);




    }

}

