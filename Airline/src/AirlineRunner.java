public class AirlineRunner {
    public static void main(String[] args) {
        Airline airline1 = new Airline("Alex");
        airline1.show();
        Airline airline2 = new Airline("Air India", "Airbus A320", "Brody");
        airline2.show();
        Airline airline3 = new Airline("Qatar Airline", "Airbus A450", "Carson", 2390);
        airline3.show();
        Airline airline4 = new Airline(8, 8765);
        airline4.show();
        Airline airline5 = new Airline(15, 11234, false);
        airline5.show();
    }
}
