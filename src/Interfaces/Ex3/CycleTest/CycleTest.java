package Interfaces.Ex3.CycleTest;
interface Cycle{
   public void ride();
}
interface CycleFactory{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    public void  ride(){
        System.out.println("Unicycle ride");
    }
}
class BiCycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Bicycle ride");
    }
}
class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Tricycle ride");
    }
}
class ImplementationUnicycle implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
class ImplementationBicycle implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new BiCycle();
    }
}
class ImplementationTricycle implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return  new Tricycle();
    }
}

public class CycleTest {
    public static void checkCycle(CycleFactory cycleFactory){
        Cycle cycle=cycleFactory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        checkCycle(new ImplementationUnicycle());
        checkCycle(new ImplementationBicycle());
        checkCycle( new ImplementationTricycle());
    }
}
