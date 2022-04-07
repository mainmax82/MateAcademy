package Mate.Book.MiddleCharacter;

public class MiddleCharacter {
    public String  getMiddleCharacter(String input){
        String subString=null;
        int  initialPoint;
        if(input.length()==0){
          return input;
        }
        if(input.length()%2==0){
            initialPoint=input.length()/2-1;
            subString=input.substring(initialPoint,initialPoint+2);
        }else if(input.length()%2==1){
            initialPoint=(input.length()-1)/2;
            subString=input.substring(initialPoint,initialPoint+1);
        }
        System.out.println(subString);
        return subString;

    }

    public static void main(String[] args) {
        MiddleCharacter md=new MiddleCharacter();
        md.getMiddleCharacter("1234");
        md.getMiddleCharacter("123456");
        md.getMiddleCharacter("12345");
        md.getMiddleCharacter("hello");
        md.getMiddleCharacter("(())");
        md.getMiddleCharacter("Bob");
        md.getMiddleCharacter("Максим");
    }

}
