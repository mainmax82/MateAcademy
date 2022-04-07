package HoldingObject.Ex10.Ex17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class Gerbil {
    private int gerbilNumber;
    public Gerbil(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }
}
public class Ex17 {
    public static void main(String[] args) {
        Map<String,Gerbil> gm=new LinkedHashMap<>();
        gm.put("One",new Gerbil(1));
        gm.put("Two",new Gerbil(2));
        gm.put("Three",new Gerbil(3));
        gm.put("Four",new Gerbil(4));
       Iterator<String> it=gm.keySet().iterator();
       while (it.hasNext()){
           String s=it.next();
           System.out.println(s);
           gm.get(s).hop();
        }
    }

}
