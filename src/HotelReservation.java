public class HotelReservation extends Reservation {

    private Hotel hotel_place;
    private String type_of_room;
    private int n_of_nights;
    private int price_per_night;

    public HotelReservation(String name_of_reservation, Hotel place_of_stay, String room_type, int n_of_nights) {

        super(name_of_reservation);

        this.hotel_place = place_of_stay;
        this.type_of_room = room_type;
        this.n_of_nights = n_of_nights;

        int price = this.hotel_place.reserveRoom(type_of_room);
        if (price < 0) {
            throw new IllegalArgumentException();
        }
    }


    public int getNumOfNights() {
            return this.n_of_nights;
    }

    public int getCost() {

        return (this.price_per_night)*(this.n_of_nights);

    }


    public boolean equals(Object x) {

        boolean verify = false;

        if (this.equals(x)) {
            verify = true;
        }

        return verify;

    }



}


