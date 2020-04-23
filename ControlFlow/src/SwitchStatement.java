public class SwitchStatement {

    public static void main(String[] args) {

        char switchValue = 'z';

        switch (switchValue) {

            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("Letters are in there");
                break;

            default:
                System.out.println("Letter not found");

        }

    }


}
