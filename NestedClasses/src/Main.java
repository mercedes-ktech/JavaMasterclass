import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
/*
        //Gearbox mcLaren = new Gearbox(6); //create outer class
        //Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        //declare inner class: reference the outer class first.then name of the inner class
        //initialize inner class: the name of the object you created.new
        //System.out.println(first.driveSpeed(1000));

        //below we're using the class but there is no reference to the inner class
        Gearbox mcLaren = new Gearbox(6);
        //mcLaren.addGear(1, 5.3); we can remove these because we added a for loop in the Gearbox constructor
        //mcLaren.addGear(2, 10.6);
        //mcLaren.addGear(3, 15.19);
        mcLaren.operateClutch(true);
        mcLaren.changeGears(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGears(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGears(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

*/
        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());

    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
