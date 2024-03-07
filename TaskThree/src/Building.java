import java.util.ArrayList;

public class Building {

    private int numberOfBathrooms;
    private int numberOfFloors;

    private boolean isOfficeBuilding;


    private ArrayList<Room> rooms = new ArrayList<>();



    //3.e Create a constructor that populates all the fields above.

    Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding, ArrayList<Room> rooms ){

        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = rooms;
    }

    // 3.f As the fields of the Building class are private, create getters() for them.

    public int getNumberOfBathrooms(){

        return numberOfBathrooms;
    }

    public int getNumberOfFloors(){

        return numberOfFloors;
    }

    public boolean isOfficeBuilding(){

        return isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;

    }

    public int getRoomSize() {
        return rooms.size();
    }





}

