package Operators.Ex1.Ex4;

public class Speed {
    double distance;
    double time;
    double speed;


    public double speedCount(double d, double t) {
        this.distance=d;
        this.time=t;
        if(t==0)return 0d;
        double s = distance / time;
        this.speed=s;
        return speed;
    }

    public void showSpeed() {
        System.out.println(speed);
    }
}


