package Mate.Book.StudentGrade;

public class StudentGrade {
    static int finalGrade(int examGrade, int numberOfProject){
        int result=0;
        if(examGrade>90 && numberOfProject>10){
            result= 100;
        }
         else if(examGrade>75 &&  numberOfProject>=5){
            result= 90;
        }
         else if(examGrade>50 && numberOfProject >=2){
            result=75;
        }
        else result=0;
        System.out.println(result);
        return  result;

    }

    public static void main(String[] args) {
        finalGrade(91, 11);
        finalGrade(76, 5);
        finalGrade(51, 2);
        finalGrade(91, 6);
        finalGrade(96, 10);
        finalGrade(75, 2);
    }

}
