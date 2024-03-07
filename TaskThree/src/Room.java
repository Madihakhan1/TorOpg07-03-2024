public class Room {

    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;


//3.a Create a Room.java class with the following fields (use appropriate types and make them private):
//
//numberOfDoors
//numberOfLamps



    //3.b Create a constructor that populates all the fields above.
    public void Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {


        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //3.c As the fields of the Room class are private, create getter()-methods for them,
    public int getNumberOfDoors(){

        return numberOfDoors;
    }


    public int getNumberOfLamps(){

        return numberOfLamps;
    }

    public int getNumberOfWindows() {

        return numberOfWindows;
    }

    public void setnumberOfDoors(int numbersOfDoors){

     this.numberOfDoors = numbersOfDoors;

    }

    public void setNumberOfLamps(int numberOfLamps){

      this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}