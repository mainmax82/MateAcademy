package Mate.Book.Robot;

public class FactoryStorage {


    public boolean checkRobotsQuality(Robot[] robotsOnMaintenance) {
        for (int i = 0; i < robotsOnMaintenance.length; i++) {
            if ( robotsOnMaintenance[i].workHoursCapacity <100 || robotsOnMaintenance[i].hasEngInterface == false) {
            return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Robot[] robotsOnMaintenance = new Robot[5];
        robotsOnMaintenance[0] = new Robot(110, false);
        robotsOnMaintenance[1] = new Robot(129, true);
        robotsOnMaintenance[2] = new Robot(678, true);
        robotsOnMaintenance[3] = new Robot(101, true);
        robotsOnMaintenance[4] = new Robot(200, true);
        FactoryStorage fs = new FactoryStorage();
        System.out.println(fs.checkRobotsQuality(robotsOnMaintenance));
        for (int i = 0; i < robotsOnMaintenance.length; i++) {
            //  System.out.println(robotsOnMaintenance[i].id);
            //System.out.println(robotsOnMaintenance[i].name);
        }
    }
}
