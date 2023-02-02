
public class Hotel {

    private String name_hotel;
    private Room[] Rooms;

    public Hotel(String name_of_hotel, Room Rooms[]) {

        this.name_hotel = name_of_hotel;
        this.Rooms = Rooms;

    }

    public int reserveRoom(String type_room_reserve) {

        Room FirstRoom = null;
        FirstRoom = FirstRoom.findAvailableRoom(this.Rooms, type_room_reserve);

        if (FirstRoom == null) {
            throw new IllegalArgumentException("No room");
        }

        FirstRoom.changeAvailability();

        return FirstRoom.getPrice();

    }

    public boolean cancelRoom(String type_of_room) {

        //success = False;

        boolean success = Room.makeRoomAvailable(this.Rooms, type_of_room);

        return success;


    }





}
