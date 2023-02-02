public class Room {

    private String type_room;
    private int price;
    private boolean availability;

    //Constructors

    public Room(String room_type) {


       if (room_type == "double") {
           this.price = 90;
       }
       else if (room_type == "queen") {
           this.price = 110;
       }
       else if (room_type == "king") {
           this.price = 150;
       }
       else {
           throw new IllegalArgumentException("No type of that room exists, therefore it will not be created.");
       }

       this.availability = true;

    }

    public Room(Room RoomCopy) {

        this.type_room = RoomCopy.type_room;
        this.price = RoomCopy.price;
        this.availability = RoomCopy.availability;


    }

    //Getters

    public String getType() {
        return this.type_room;
    }

    public int getPrice() {
        return this.price;
    }

    //NormalMethods

    public void changeAvailability() {

        if (this.availability) {
            this.availability = false;
        }
        else {
            this.availability = true;
        }



    }

    public static Room findAvailableRoom(Room Rooms[], String room_type) { //Find first available room

        Room available_room = null;

        for (int i = 0; i <= Rooms.length; i++) {

            if ((Rooms[i].type_room == room_type) & (Rooms[i].availability)) {

                available_room = Rooms[i];
            }
        }

        return available_room;
    }

    public static boolean makeRoomAvailable(Room Rooms[], String room_type) {

        boolean is_available = false;

        for (int i = 0; i <= Rooms.length; i++) {

            if ((Rooms[i].type_room == room_type) & !Rooms[i].availability) {

                Rooms[i].availability = true;
                is_available = true;
            }
        }

        return is_available;

    }


}
