package ObjectsChapter1.CardNumber;

public class CardNumber {
    public static void main(String[] args) {
        int number=37;
        switch (number) {
            case (34):
                //System.out.println("American Express");
                //break;
            case (37):
                System.out.println("American Express");
                break;
            case (4):
                System.out.println(" VISA ");
                break;
            case (52):
                System.out.println("MasterCard");
                break;
            case (53):
                System.out.println("MasterCard");
                break;
            case (54):
                System.out.println(" MasterCard");
                break;
            case (55):
                System.out.println(" MasterCard ");
                break;
            case (63):
                System.out.println(" Maestro");
                break;
            case (67):
                System.out.println(" Maestro");
                break;
            default:
                System.out.println(" unknown payment system");

        }
    }
}
