package CodeWar.RemoveCharacter.QuarterOfTheYear;

public class QuarterOfTheYear {
    public static void quarter(int month) {
        if (month < 1 || month > 12)
            System.out.println("Wrong month input");
        switch (month) {
            case (1):
                System.out.println("first quater");
                break;
            case (2):
                System.out.println("first quarter");
                break;
            case (3):
                System.out.println("first quarter");
                break;
            case (4):
                System.out.println("second quarter");
                break;
            case (5):
                System.out.println("second quarter");
                break;
            case (6):
                System.out.println("second quarter");
                break;
            case (7):
                System.out.println("third quarter");
                break;
            case (8):
                System.out.println("third quarter");
                break;
            case (9):
                System.out.println("third quarter");
                break;
            case (10):
                System.out.println("fourth quarter");
                break;
            case (11):
                System.out.println("fourth quarter");
                break;
            case (12):
                System.out.println("fourth quarter");
                break;
        }


    }

    public static void main(String[] args) {
        quarter(13);
        quarter(5);
    }
}

