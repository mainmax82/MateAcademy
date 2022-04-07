package Generics.RandomList;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        RandomList<Integer> ri = new RandomList<>();
        RandomList<Character> rch = new RandomList<>();
        for (String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" ")) {
            rs.add(s);
            ri.add(s.length());
            rch.add(s.charAt(s.length()-1));
        }

        for (int i = 0; i < 11; i++) {

            System.out.print(rs.select() + " ");
            //System.out.print();
            System.out.println(ri.select()+ " ");
            System.out.println(rch.select()+ " ");
        }


    }
}
