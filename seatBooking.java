import java.util.Scanner;

public class seatBooking {
    public static void main(String[] args) {
        char[][] seats = {
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'}
        };
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display options
            System.out.println("--- Theater Seating Management ---");
            System.out.println("1. Display Seating Chart");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Get user input
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // To display seating chart
                    System.out.println("Seating Chart:");
                    System.out.println("  Seat 1 Seat 2 Seat 3 Seat 4 Seat 5 Seat 6");
                    for (int i = 0; i < seats.length; i++) {
                        System.out.print("Row " + (i + 1) + " | ");
                        for (int j = 0; j < seats[i].length; j++) {
                            System.out.print(seats[i][j] + "     ");
                        }
                        System.out.println();
                }
                    break;
                case 2: // To book a seat
                    System.out.print("Enter row number (1-" + seats.length + "): ");
                    int row = scanner.nextInt() - 1;
                    System.out.print("Enter seat number (1-" + seats[0].length + "): ");
                    int seat = scanner.nextInt() - 1;
            
                    if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[0].length) {
                        if (seats[row][seat] == 'A') {
                            seats[row][seat] = 'B'; // Mark the seat as booked
                            System.out.println("Seat booked successfully.");
                        } else {
                            System.out.println("Seat is already booked.");
                        }
                    } else {
                        System.out.println("Invalid seat selection.");
                    }
                    break;
                case 3: // To cancel a booking
                    System.out.print("Enter row number (1-" + seats.length + "): ");
                    int rowCancel = scanner.nextInt() - 1;
                    System.out.print("Enter seat number (1-" + seats[0].length + "): ");
                    int seatCancel = scanner.nextInt() - 1;
            
                    if (rowCancel >= 0 && rowCancel < seats.length && seatCancel >= 0 && seatCancel < seats[0].length) {
                        if (seats[rowCancel][seatCancel] == 'B') {
                            seats[rowCancel][seatCancel] = 'A'; // Mark the seat as available
                            System.out.println("Booking canceled successfully.");
                        } else {
                            System.out.println("Seat is not booked.");
                        }
                    } else {
                        System.out.println("Invalid seat selection.");
                    }
                    break;
                case 4: // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println(); // Add a line break between iterations
        }
    }
}


