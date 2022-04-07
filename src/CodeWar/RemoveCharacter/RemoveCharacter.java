package CodeWar.RemoveCharacter;

public class RemoveCharacter {
    public static  String removeCharacter(String s){
        if(s.isEmpty() || s==null)
            return null;
        int begin=s.length()-(s.length()-1);
        int end=s.length()-1;
        String subString=s.substring(begin,end);
        System.out.println(subString);
        return subString;
    }
    public static String removeCharacter1(String ss){
        if(ss.isEmpty() || ss==null)
            return null;
        StringBuilder stringBuilder=new StringBuilder(ss);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(ss.length()-2);
        String str=stringBuilder.toString();
        System.out.println(str);
        return str;


    }

    public static void main(String[] args) {
        String ss=null;
        removeCharacter("Diana");
        //removeCharacter(ss);
        removeCharacter("");
        removeCharacter1("Agata");
    }
}
