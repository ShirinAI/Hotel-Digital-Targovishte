import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void addBooking(Map<Integer, Room> rooms, int roomNumber, String dates, String surname) {
        if (rooms.containsKey(roomNumber)) {
            Room room = rooms.get(roomNumber);
            Booking booking = new Booking(dates, surname);
            room.addBooking(booking);
        } else {
            System.out.println("Room number " + roomNumber + " does not exist.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Please select: \n1 - Make a reservation; \n2 - List free rooms; \n3 - Checkout room; \n4 - Stats; \n5 - Find a room; \n6 - Update a room");

        Map<Integer, Room> rooms = new HashMap<>();

        rooms.put(101, new Room(101, 2, "sea"));
        rooms.put(102, new Room(102, 1, "park"));
        rooms.put(103, new Room(103, 3, "sea"));
        rooms.put(104, new Room(104, 2, "park"));
        rooms.put(105, new Room(105, 4, "sea"));
        rooms.put(106, new Room(106, 2, "park"));

        // bookings
        addBooking(rooms, 101, "10.01.2023 - 15.01.2023", "Petrovi");
        addBooking(rooms, 101, "20.02.2023 - 25.02.2023", "Ivanovi");
        addBooking(rooms, 102, "12.01.2023 - 14.01.2023", "Georgievi");
        addBooking(rooms, 102, "05.03.2023 - 10.03.2023", "Nikolovi");
        addBooking(rooms, 105, "15.02.2023 - 20.02.2023", "Dimitrovi");


        for (Map.Entry<Integer, Room> entry : rooms.entrySet()) {
            int roomNumber = entry.getKey();
            Room room = entry.getValue();
            System.out.println("Room Number: " + roomNumber);
            System.out.println("Number of Beds: " + room.getNumberOfBeds());
            System.out.println("View: " + room.getView());

            List<Booking> bookings = room.getBookings();
            if (bookings.isEmpty()) {
                System.out.println("No bookings for this room.");
            } else {
                System.out.println("Booked Dates:");
                for (Booking booking : bookings) {
                    System.out.println("   " + booking.getDates() + " - " + booking.getSurname());
                }
            }

            System.out.println();
    }
}
}