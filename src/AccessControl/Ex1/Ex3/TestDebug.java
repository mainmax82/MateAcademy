package AccessControl.Ex1.Ex3;
import AccessControl.Ex1.debugoff.Debug;


public class TestDebug {
    public static void main(String[] args) {
        Debug debug=new Debug();
        debug.debug();
        AccessControl.Ex1.debug.Debug debug1=new AccessControl.Ex1.debug.Debug();
        debug1.debug();

    }
}
