public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        //this.pagesPrinted = pagesPrinted; -NOT ALL THE INSTANCE VARIABLES NEED TO BE IN THE CONSTRUCTOR! YOU WOULDN'T SET PAGES PRINTED WHEN YOU CREATE A PRINTER
        this.isDuplexPrinter = isDuplexPrinter;
        this.pagesPrinted = 0;

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean getIsDuplexPrinter() {
        return  isDuplexPrinter;
    }

    public int fillUpToner(int ink) {

        int inkToAdd = 100 - tonerLevel;

        if(tonerLevel == 100 || ink < 0) {
            return tonerLevel;
        } else if(tonerLevel < 100 && ink > inkToAdd) {
            tonerLevel = tonerLevel + inkToAdd;
        } else {
            tonerLevel = tonerLevel + ink;
        }

        return tonerLevel;

    }

    public int printing(int pagesPrinted) {

        this.pagesPrinted = this.pagesPrinted + pagesPrinted;

        System.out.println("Pages printed: " + this.pagesPrinted);
        return this.pagesPrinted;

    }



}


/*         // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

 */
