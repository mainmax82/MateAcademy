package Mate.Book.RemoveChars;

public class RemoveChars {
    public  String removeOddChars(String input){
        String result=null;
        if(input.length()==0){
            return input;
        }
        StringBuilder sb=new StringBuilder();
        char [] chars=input.toCharArray();
        for(int i=0; i < chars.length; i++) {
            if (i % 2 == 0) {
                sb.append(chars[i]);
                result = sb.toString();
            }
        }

        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        RemoveChars removeChars=new RemoveChars();
        removeChars.removeOddChars("hello");
        removeChars.removeOddChars("1234");
        removeChars.removeOddChars("(())");
        removeChars.removeOddChars("Bob");
        removeChars.removeOddChars("");
    }
}
