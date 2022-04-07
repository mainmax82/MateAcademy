package HoldingObject.Ex10;

import java.util.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Ex12 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        ListIterator<Integer> listIterator1 = list1.listIterator(10);

        while (listIterator1.hasPrevious()) {
            list2.add(listIterator1.previous());

        }
        System.out.println(list2);

        List<Integer> li1 =
                new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> li2 =
                new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
        ListIterator<Integer> it1 = li1.listIterator();
        ListIterator<Integer> it2 = li2.listIterator();
        println("li1: " + li1);
        println("li2: " + li2);
        // move it1 to end:
        while (it1.hasNext())
            it1.next();
        // now use it2 to re-set li2:
        while (it2.hasNext()) {
            it2.next();
            it2.set(it1.previous());
        }
        println("li1: " + li1);
        println("li2: " + li2);

    }
}








