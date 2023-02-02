public abstract class Reservation {

    private String name;

    public Reservation(String client_name) {

        this.name = client_name;
    }

    final String reservationName() {
        return this.name;
    }

    public abstract int getCost();

    public abstract boolean equals(Object x);

}
