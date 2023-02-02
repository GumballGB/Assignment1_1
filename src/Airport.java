public class Airport {


    private int x_coordinate;
    private int y_coordinate;
    private int airport_fee;

    public Airport(int x_position, int y_position, int fees) {
        this.x_coordinate = x_position;
        this.y_coordinate = y_position;
        this.airport_fee = fees;
    }

    public int getFees() {
        return this.airport_fee;
    }
    public static int getDistance(Airport Airport_1, Airport Airport_2) {

        double distance_raw = Math.sqrt( Math.pow( (Airport_1.x_coordinate - Airport_2.x_coordinate), 2 ) + Math.pow( (Airport_1.y_coordinate - Airport_2.y_coordinate), 2) );

        return (int) (distance_raw);
    }

}

