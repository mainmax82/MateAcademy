package Mate.Book.MakeAbbr;

public class MakeAbbr {
    public String makeAbbr(String fullName) {
        String abbr= "";
        String stringToUpperCase = fullName.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char[] chars = stringToUpperCase.toCharArray();
        sb.append(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                sb.append(chars[i + 1]).toString();
            }

        }
        abbr=sb.toString();
        System.out.println(abbr);
        return abbr;
    }

    public static void main(String[] args) {
        MakeAbbr makeAbbr = new MakeAbbr();
       makeAbbr.makeAbbr("Minnesota");
       makeAbbr.makeAbbr("simplified molecular input line entry specification");
       makeAbbr.makeAbbr("Білан");

    }
}
