import java.time.LocalTime;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("VN123", "Hanoi", LocalTime.of(10, 30));
        Airplane flight2 = new Airplane("VN456", "Da Nang", LocalTime.of(12, 45));

        System.out.println("=== Initial Flight Status ===");
        flight1.checkStatus();
        flight2.checkStatus();

        System.out.println("\n=== Applying Delay ===");
        flight1.delay(20);
        flight1.checkStatus();

        System.out.println("\n=== Updated Departure Times ===");
        System.out.println("Flight " + flight1.getFlightNumber() + " new departure: " + flight1.getScheduledDeparture());
        System.out.println("Flight " + flight2.getFlightNumber() + " departure: " + flight2.getScheduledDeparture());

        System.out.println("\n=== Updating Flight Details ===");
        flight2.setDestination("Hue");
        flight2.delay(15);
        System.out.println("Flight " + flight2.getFlightNumber() + " new destination: " + flight2.getDestination());
        flight2.checkStatus();
    }
}
