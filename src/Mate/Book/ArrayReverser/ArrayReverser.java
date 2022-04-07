package Mate.Book.ArrayReverser;


public class ArrayReverser {

    public static String[] reverse(String[] a) {
        int max=Integer.MIN_VALUE;
        if(a==null||a.length==0){
            return new String[0];
        }

        String[] b = new String[a.length];
        String str = String.join("", a);
        int begin = str.length();
        int end = 0;
        for (int j = 0; j < a.length; j++) {
            int x = a[j].length();
            begin = begin - x;
            end = begin + x;
            System.out.println(x);
            String subString = str.substring(begin, end);
            StringBuilder sb = new StringBuilder();
            sb.append(subString).reverse();
            String s = sb.toString();
            b[j] = s;
            System.out.print(b[j]);


        }
        return b;

    }

    public static void main(String[] args) {
        String[] a = {"Don't", "worry", ",", "be", "happy", "!"};
        String[]a1=null;
        String[]a2=new String[0];
        reverse(a);
        reverse(a1);
        reverse(a2);
       // reverse(new String[]{"Fuck","the","police"});
    }
}







    








