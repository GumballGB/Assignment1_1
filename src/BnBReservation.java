public class BnBReservation extends HotelReservation {

    public BnBReservation(String name_of_reservation, Hotel hotel_name, String room_type, int n_of_nights) {

        super(name_of_reservation, hotel_name, room_type, n_of_nights);

    }

    public int getCost() {

        return super.getCost() + 10;

    }


}
