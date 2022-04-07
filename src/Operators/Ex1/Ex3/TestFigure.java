package Operators.Ex1.Ex3;

public class TestFigure {
    static void f(Figure figure) {
        figure.aFloat = 5.56f;
    }

    public static void main(String[] args) {
        Figure figure = new Figure();
        figure.aFloat = 6.59f;
        System.out.println(figure.aFloat);
        f(figure);
        System.out.println(figure.aFloat);
    }
}
