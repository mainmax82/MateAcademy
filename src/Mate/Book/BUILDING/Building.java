package Mate.Book.BUILDING;

public class Building {

    int id;
    int numberOfFloors;
    int flatsOnTheFloor;

    Building(int id, int numberOfFloors, int flatsOnTheFloor) {
        this.id = id;
        this.numberOfFloors = numberOfFloors;
        this.flatsOnTheFloor = flatsOnTheFloor;
    }

    public static void main(String[] args) {
        Building[] buildingsInfo = new Building[3];
        int total=0;
        buildingsInfo[0] = new Building(1, 9, 15);
        buildingsInfo[1] = new Building(2, 7, 5);
        buildingsInfo[2] = new Building(3, 5, 10);
        for (int i = 0; i < buildingsInfo.length; i++) {
            int quantityOfFlat = (buildingsInfo[i].numberOfFloors * buildingsInfo[i].flatsOnTheFloor);
            total+=quantityOfFlat;
        }
        System.out.println(total);
    }
}
