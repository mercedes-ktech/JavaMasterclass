public class Car {

    private String name;
    private int wheels;
    private boolean engine;
    private int cylinders;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        engine = true;
        System.out.println("The engine has been started");
    }

    public void accelerate(int speed) {
        if (speed < 100 >) {
            this.speed = speed;
            System.out.println("The speed is " + speed);
        } else brake(0);

    }

    public void brake(int speed) {
        if (speed == 0) {
            System.out.println("Car has stopped");
        } else if (speed < this.speed) {
            System.out.println("The car has slowed down");
        }
    }

    public int getWheels() {
        return wheels;
    }

    public boolean getEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }


}


/* 	    // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).


 */