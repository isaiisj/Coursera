import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeatBooking {
    // List to store bookings
    private List<Seat> bookedSeatsList;

    // Constructor
    public SeatBooking() {
        // Initialize the list of booked seats
        // TODO 1 : this.bookedSeatsList = ?
        this.bookedSeatsList = new ArrayList<>();
    }

    // Method to add a new seat booking
    public void addNewBooking(String seatNumber) {
        // TODO 1: create a new instance of the Seat class.
        Seat seat = new Seat(seatNumber);
        // TODO 2: check if the seat is already booked and not canceled
        boolean booked = seat.isBooked();
        // TODO 3 create a new Seat object for the booking,
        // mark the seat as booked by setting its isBooked property to true,
        // set the current date as the booking date
        // TODO 4: add the new seat to the bookedSeatsList
        // TODO 5: confirm the booking to the user
        // print a message to the console confirming that the seat has been successfully booked
        if (!booked) {
            seat.setBooked(true);
            Date date = new Date();
            seat.setBookingDate(date);
            bookedSeatsList.add(seat);
            System.out.println("Seat: " + seatNumber + " has been successfully booked!");
        } else {
            System.out.println("Seat already booked");
        }
     }

    // Method to cancel a booking
    public void cancelBooking(String seatNumber) {
        // TODO 6: iterate through the list of booked seats
        for (Seat seat: bookedSeatsList) {
            // TODO 7: check if the seat number matches and is not already canceled
            // mark the seat as canceled
            // mark the seat as not booked
            // confirm the cancellation to the user
            if (seat.getSeatNumber().equals(seatNumber)){
                seat.setBooked(false);
                bookedSeatsList.remove(seat);
                System.out.println("Seat " + seatNumber + " has been successfully removed!");
                return;
            }
        }
        // TODO 8: inform the user if no booking was found for the seat number
        System.out.println("No booking was found");
    }
  
    // Method to update a booking seat number
    public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        // TODO 9: iterate through the list of booked seats
        for (Seat seat: bookedSeatsList) {
            // TODO 10: check if the seat number matches the old seat number and is not canceled
            // TODO 11: update the seat number to the new seat number
            // unbook the current seat (set isBooked to false)
            // remove the old seat from the list
            // confirm the update to the user
            if (seat.getSeatNumber().equals(oldSeatNumber)) {
                Seat newSeat = new Seat(newSeatNumber);
                newSeat.setBooked(true);
                bookedSeatsList.add(newSeat);
                bookedSeatsList.remove(oldSeatNumber);
                System.out.println("Seat " + oldSeatNumber + " has been updated to " + newSeatNumber + "!");
                return;
            }
        }
        // TODO 12: inform the user if no booking was found for the old seat number
        System.out.println("Seat " + oldSeatNumber + " not found.");
    }
  
    // Method to display all bookings
    public void displayBookings() {
        // TODO 13: check if the bookedSeatsList is empty, inform the user that no bookings have been made yet
        // TODO 14: iterate through the list of booked seats, Check if the seat is booked and not canceled
        // TODO 15: display the seat number and booking date
        if (bookedSeatsList.isEmpty()){
            System.out.println("No bookings yet");
        } else {
            for (Seat seat: bookedSeatsList) {
                System.out.println("Seat Number: " + seat.getSeatNumber());
            }
        }
    }
}
