public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //this initializes the basic characteristics of an animal
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); //wouldn't i want to have the content of the chew method inside this method?
        super.eat(); //WHAT DO I NEED THIS FOR
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5); //this calls Animal.move()

    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10); //this calls Dog.move()

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");

    }



    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 2, 4,4, 1, 20, "long silky");
        //dog.eat();

        //dog.walk();
        dog.run();
        //dog.move(5);
    }

}
