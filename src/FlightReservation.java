
public class FlightReservation extends Reservation {

    private Airport airport_department_place;
    private Airport airport_arrival_place;

    public FlightReservation(String reservation_name, Airport departure_place, Airport arrival_place) {

        super(reservation_name);
        this.airport_department_place = departure_place;
        this.airport_arrival_place = arrival_place;

        if (departure_place == arrival_place) {
            throw new IllegalArgumentException();
        }


    }

    public int getCost() {

         double hidden_fees = 53.75;

        //Planes pay 1.24$/gal and fly over 167.52km/gal

        int total_fees = airport_department_place.getFees() + airport_arrival_place.getFees();

        int kimometrage = airport_department_place.getDistance(airport_department_place, airport_arrival_place);


        double total_gallon_money = ((1.24)*(kimometrage/167.52));

        int total_cost = (int) (total_gallon_money + total_fees + hidden_fees);

        return total_cost;
    }

    public boolean equals(Object x) {

       boolean verify = false;

       if (this.equals(x)) {
           verify = true;
        }

       return verify;

    }




}
