package Controlling.BreakAndContinue;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i==74) break;
            if(i%9!=0)continue;
            System.out.print(i+ " ");
        }
    }
}
