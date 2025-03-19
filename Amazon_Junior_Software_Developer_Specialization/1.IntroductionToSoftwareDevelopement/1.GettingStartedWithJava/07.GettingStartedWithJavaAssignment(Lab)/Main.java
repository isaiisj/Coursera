public class Main {
    public static void main(String[] args) {
        // Declare and initialize variable for First Name
        String firstName = "Sandy";

        // Declare and initialize variable for Last Name
        String lastName = "Jones";

        // Declare and initialize variable for Movie Title
        String movieTitle = "The Source Code";

        // Declare and initialize variable for Number of tickets
        int numberOfTickets = 8;

        // Declare and initialize variable for Price per ticket
        double pricePerTicket = 10.57;

        // Calculate the total price based on number of tickets and price per ticket.
        // Print the output of the total price
        //System.out.println("Total price of " + numberOfTickets + " tickets: " + numberOfTickets*pricePerTicket);

        // Concatenate first name and last name into new variable username with no space in between
        // first and last name and convert them to lower case
        String userName = firstName+lastName;
        //System.out.println(userName);

        // Convert the movie title to upper case and assign to variable movieName
        String movieName = movieTitle.toUpperCase();
        //System.out.println("Movie: " + movieName);

        // Write multiple print statements to match your output as per the Final Expected Output
        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: "+userName);
        System.out.println("Movie: "+movieName);
        System.out.println("Number of Tickets: "+numberOfTickets);
        System.out.println("Price per ticket: "+pricePerTicket);
        System.out.println("Total price of 8 tickets: "+pricePerTicket*numberOfTickets+"\n");
        System.out.println("Thank you for choosing us booking your movie tickets");
        System.out.println("Enjoy your movie!!!");
    }
}
