import java.util.ArrayList;
import java.util.List;

class Room {
    private int roomNumber;
    private int numberOfBeds;
    private String view;
    private List<Booking> bookings;

    public Room(int roomNumber, int numberOfBeds, String view) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.view = view;
        this.bookings = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public String getView() {
        return view;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
}
