package AccessControl.Ex1.Ex5;

public class Access {
    public String s="public";
    protected String a="protected";
    private String p="private";
    public void showS(){
        System.out.println(s);
    }
    protected void showA(){
        System.out.println(a);
    }
    private void showP(){
        System.out.println(p);
    }

}
