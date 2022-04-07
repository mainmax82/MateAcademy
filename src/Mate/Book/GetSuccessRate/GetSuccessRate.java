package Mate.Book.GetSuccessRate;

public class GetSuccessRate {
    static String s=" rotator";
    String target=s.toLowerCase();
   static char[] chars=s.toCharArray();
    public double getSuccessRate(String statistic) {

        double one = 0;
        double zero = 0;

        char[] chars = statistic.toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        for (
                int i = 0;
                i < chars.length; i++) {
            if (chars[i] == '1') {
                one++;
            }
            if (chars[i] == '0') {
                zero++;

            }

        }

        double result;
        if (zero == 0) {
            result = one / one;
        } else result = one / chars.length;
        return result;
    }


    public static void main(String[] args) {
        GetSuccessRate gsr = new GetSuccessRate();
        System.out.println(gsr.getSuccessRate("101010"));
        System.out.println(gsr.getSuccessRate("000000"));
        System.out.println(gsr.getSuccessRate("111111"));
        System.out.println(gsr.getSuccessRate(""));




    }
}

