public class Car1 extends Car {

    public Car1(String name, int cylinders) { //needs parameters because the parent class constructor has parameters
        super(name, cylinders);
    }

    @Override
    public void startEngine(){

        System.out.println("The engine in car1 has been started");
    }

}