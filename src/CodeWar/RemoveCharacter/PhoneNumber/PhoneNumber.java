package CodeWar.RemoveCharacter.PhoneNumber;

public class PhoneNumber {
    public static String phone(int []a){
        String phoneNumber="";
        for(int i=0;i<a.length;i++){
            phoneNumber+=Integer.toString(a[i]);
        }
        System.out.println(phoneNumber);
        return phoneNumber;
    }

    public static void main(String[] args) {
        int []b={0,9,6,0,5,9,5,4,3,0};
        phone(b);

    }
}
