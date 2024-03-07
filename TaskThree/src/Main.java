public class Main {
    public static void main(String[] args) {


        //3.g In your main method, instantiate at least three different rooms.

        Room room1 = new Room(8, 7, 3);
        Room room2 = new Room(4, 7, 3);
        Room room3 = new Room(8, 7, 3);


        //3.h Add the three rooms to a collection (preferably of the same data type used for the "rooms" field in your Building.java class).
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        //3.i In your main method, instantiate a new building.

        Building building = new Building(2, 4, false);

        //3.j create a static method in Main, countLampsInBuilding, that takes an object of type Building, and returns the total number of lamps in the entire building.
        public static int countLampsInBuilding (Building building){

            int sum = 0;

            for (Room r : building.getRooms()) {
                sum += r.getnumberOfLamps();
            }
            return sum;
        }

        //3.k create another static method in Main, isNormal, that takes an object of type Building.
        // The method should return true if the Building's numberOfFloors is greater than its number of Rooms.
        // If not it should print "This is an odd building" and return false.

        public static boolean isBuildingNormal (Building building){
            boolean type = false;

            if (building.getNumberOfFloors() < building.getRoomSize()) {
                return type = true;
            }
            return type;
        }


    }

}
