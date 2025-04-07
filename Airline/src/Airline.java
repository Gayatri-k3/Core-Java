import java.sql.SQLOutput;

public class Airline {
    String airline_company;
    String type_of_plane;
    String src;
    String dest;
    int journey_time_in_hrs;
    String passenger_name;
    int ticket_price;
    long contact_no;
    int passanger_age;
    boolean child_onboard;


    public Airline(String passenger_name){
        this.passenger_name =passenger_name;
        System.out.println("Passenger name Constructor");
    }
    public Airline(String airline_company, String type_of_plane, String passenger_name){
        this(passenger_name);
        this.airline_company = airline_company;
        this.type_of_plane = type_of_plane;
        System.out.println("Airline company, type of plane and passenger name constructor");
    }
    public Airline(String airline_company, String type_of_plane, String passenger_name, int ticket_price){
        this(airline_company, type_of_plane, passenger_name);
        this.ticket_price= ticket_price;
        System.out.println("Airline company, type of plane, passenger name and ticket price constructor");
    }
    public Airline(int journey_time_in_hrs, int ticket_price){
        this.ticket_price = ticket_price;
        this.journey_time_in_hrs = journey_time_in_hrs;
        System.out.println("journey time in hours and ticket price const");
    }
    public Airline(int journey_time_in_hrs, int ticket_price, boolean child_onboard){
        this(journey_time_in_hrs, ticket_price);
        this.child_onboard=child_onboard;
        System.out.println("journey time in hours, ticket price const and child onboard const");
    }

    public void show(){
        System.out.println("Airline Details");
        System.out.println("Airline Company: "+airline_company+"\nType of plane: "+type_of_plane+"\nPassenger Name: "+passenger_name+"\nTicket Price: "+ticket_price+"\njourney time: "+journey_time_in_hrs+"\nIs a Child on board: "+child_onboard);
    }


}
