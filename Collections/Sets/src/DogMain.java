public class DogMain {

    public static void main(String[] args) {

        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println("Does rover2 equals rover?");
        System.out.println(rover2.equals(rover));
        System.out.println("Does rover equals rover2?");
        System.out.println(rover.equals(rover2));
        System.out.println("A Labrador is an instance of Dog, but dog is not an instance of Labrador");
        System.out.println("so the second test returns false before the fix");
        System.out.println("The way to fix it is to remove the equals override in Labrador");
        System.out.println("and also make the equals method in Dog final, so it can't be overridden");
    }
}
