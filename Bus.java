import java.util.Scanner;

class Bus
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int seats[] = new int[10]; // 0 = Available, 1 = Booked
        int choice, seatNo;

        do
        {
            System.out.println("\n===== BUS RESERVATION SYSTEM =====");
            System.out.println("1. View Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\nSeat Status:");
                    for(int i = 0; i < 10; i++)
                    {
                        if(seats[i] == 0)
                            System.out.println("Seat " + (i + 1) + " : Available");
                        else
                            System.out.println("Seat " + (i + 1) + " : Booked");
                    }
                    break;

                case 2:
                    System.out.print("Enter seat number (1-10): ");
                    seatNo = sc.nextInt();

                    if(seatNo >= 1 && seatNo <= 10)
                    {
                        if(seats[seatNo - 1] == 0)
                        {
                            seats[seatNo - 1] = 1;
                            System.out.println("Seat booked successfully!");
                        }
                        else
                        {
                            System.out.println("Seat already booked.");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid seat number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel: ");
                    seatNo = sc.nextInt();

                    if(seatNo >= 1 && seatNo <= 10)
                    {
                        if(seats[seatNo - 1] == 1)
                        {
                            seats[seatNo - 1] = 0;
                            System.out.println("Booking cancelled successfully!");
                        }
                        else
                        {
                            System.out.println("Seat is already available.");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid seat number.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Bus Reservation System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}