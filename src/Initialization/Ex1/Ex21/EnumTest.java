package Initialization.Ex1.Ex21;

public class EnumTest {
    public static void main(String[] args) {
        for(Money m:Money.values())
            System.out.println(m+ ", ordinal "+m.ordinal());

    }
}
