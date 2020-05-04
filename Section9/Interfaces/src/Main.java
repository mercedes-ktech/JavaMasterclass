public class Main {

    public static void main(String[] args) {
        ITelephone mersPhone; //could also be DeskPhone mersPhone;
        mersPhone = new DeskPhone(123456);
        mersPhone.powerOn();
        mersPhone.callPhone(123456);
        mersPhone.answer();

        mersPhone = new MobilePhone(1234567);
        mersPhone.powerOn();
        mersPhone.callPhone(1234567);
        mersPhone.answer();
    }
}
