import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static int selected_date;
    public static int selected_movie;
    public static int selected_session;
    public static String selected_seat;
    public static String seat_number;

    public static int number_of_tickets;
    public static int number_of_tickets2;

    public static int confirmation;

    public static List<String> taken_seats = new ArrayList<>();



    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String GRAY = "\u001B[30;1m";
    public static final String DARK_GRAY = "\u001B[90m";
    public static final String DARK_YELLOW = "\u001B[33;1m";
    public static final String DARK_CYAN = "\u001B[36;1m";
    public static void main(String[] args) 
    {
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        //Scanner charScanner = new Scanner(System.in);
        
        System.out.println(DARK_GRAY);
        System.out.println("version: 1.0");
        System.out.println(YELLOW);
        System.out.println("__________________ _______  _        _______ _________ _______  _______ __________________ _______ ");
        System.out.println("\\__   __/\\__   __/(  ____ \\| \\    /\\(  ____ \\\\__   __/(       )(  ___  )\\__   __/\\__   __/(  ____ \\");
        System.out.println("   ) (      ) (   | (    \\/|  \\  / /| (    \\/   ) (   | () () || (   ) |   ) (      ) (   | (    \\/");
        System.out.println("   | |      | |   | |      |  (_/ / | (__       | |   | || || || (___) |   | |      | |   | |      ");
        System.out.println("   | |      | |   | |      |   _ (  |  __)      | |   | |(_)| ||  ___  |   | |      | |   | |      ");
        System.out.println("   | |      | |   | |      |  ( \\ \\ | (         | |   | |   | || (   ) |   | |      | |   | |      ");
        System.out.println("   | |   ___) (___| (____/\\|  /  \\ \\| (____/\\   | |   | )   ( || )   ( |   | |   ___) (___| (____/\\");
        System.out.println("   )_(   \\_______/(_______/|_/    \\/(_______/   )_(   |/     \\||/     \\|   )_(   \\_______/(_______/");
        System.out.println(DARK_GRAY);
        System.out.println("\nDeveloped by Kerem Ketenci");
        System.out.println();
        System.out.println();

        Object[] result1 = Hall.generate_seats1();
        String[][] seats1 = (String[][]) result1[0];
        String[][] seats1s = (String[][]) result1[1];
        List<String> seatList1 = (List<String>) result1[2];
        int occupied_seats1 = (int) result1[3];

        Object[] result2 = Hall.generate_seats2();
        String[][] seats2 = (String[][]) result2[0];
        String[][] seats2s = (String[][]) result2[1];
        List<String> seatList2 = (List<String>) result2[2];
        int occupied_seats2 = (int) result2[3];

        Object[] result3 = Hall.generate_seats3();
        String[][] seats3 = (String[][]) result3[0];
        String[][] seats3s = (String[][]) result3[1];
        List<String> seatList3 = (List<String>) result3[2];
        int occupied_seats3 = (int) result3[3];

        Object[] result4 = Hall.generate_seats4();
        String[][] seats4 = (String[][]) result4[0];
        String[][] seats4s = (String[][]) result4[1];
        List<String> seatList4 = (List<String>) result4[2];
        int occupied_seats4 = (int) result4[3];

        Object[] result5 = Hall.generate_seats5();
        String[][] seats5 = (String[][]) result5[0];
        String[][] seats5s = (String[][]) result5[1];
        List<String> seatList5 = (List<String>) result5[2];
        int occupied_seats5 = (int) result5[3];
        
        Object[] result6 = Hall.generate_seats6();
        String[][] seats6 = (String[][]) result6[0];
        String[][] seats6s = (String[][]) result6[1];
        List<String> seatList6 = (List<String>) result6[2];
        int occupied_seats6 = (int) result6[3];

        Object[] result7 = Hall.generate_seats7();
        String[][] seats7 = (String[][]) result7[0];
        String[][] seats7s = (String[][]) result7[1];
        List<String> seatList7 = (List<String>) result7[2];
        int occupied_seats7 = (int) result7[3];

        Object[] result8 = Hall.generate_seats8();
        String[][] seats8 = (String[][]) result8[0];
        String[][] seats8s = (String[][]) result8[1];
        List<String> seatList8 = (List<String>) result8[2];
        int occupied_seats8 = (int) result8[3];
        
        // Generates the halls
        Hall hall = new Hall();
        hall.capacity = Hall.row * (2 * Hall.minrow + Hall.row - 1) / 2;

        //var hall1 = new Hall();
        //var hall1Number = hall1.generate_hall1();
        
        //var hall2 = new Hall();
        //var hall2Number = hall2.generate_hall2();

        //var hall3 = new Hall();
        //var hall3Number = hall3.generate_hall3();

        //var hall4 = new Hall();
        //var hall4Number = hall4.generate_hall4();


        List<String>[] seat_list = new List[8];
        seat_list[0] = seatList1;
        seat_list[1] = seatList2;
        seat_list[2] = seatList3;
        seat_list[3] = seatList4;
        seat_list[4] = seatList5;
        seat_list[5] = seatList6;
        seat_list[6] = seatList7;
        seat_list[7] = seatList8;

        List<Integer> occupied_seat_list = new ArrayList<>();
        occupied_seat_list.add(occupied_seats1);
        occupied_seat_list.add(occupied_seats2);
        occupied_seat_list.add(occupied_seats3);
        occupied_seat_list.add(occupied_seats4);
        occupied_seat_list.add(occupied_seats5);
        occupied_seat_list.add(occupied_seats6);
        occupied_seat_list.add(occupied_seats7);
        occupied_seat_list.add(occupied_seats8);
      
        // Generates the movies
        Movie movie1 = new Movie();
        movie1.generate_movie1();

        String movie1Name = movie1.name;
        Double movie1Duration = movie1.duration;
        String movie1Genre = movie1.genre;

        Movie movie2 = new Movie();
        movie2.generate_movie2();

        String movie2Name = movie2.name;
        Double movie2Duration = movie2.duration;
        String movie2Genre = movie2.genre;

        // Generates the sessions
        Session session1 = new Session();
        Session generatedSession1 = session1.generate_session1();

        int session1Number = generatedSession1.number;
        LocalTime session1Time = generatedSession1.time;
        //Movie session1Movie = generatedSession1.movie;
        char session1Subtitle = generatedSession1.subtitle;
        Hall session1Hall = generatedSession1.hall;

        Session session2 = new Session();
        Session generatedSession2 = session2.generate_session2();

        int session2Number = generatedSession2.number;
        LocalTime session2Time = generatedSession2.time;
        //Movie session2Movie = generatedSession2.movie;
        char session2Subtitle = generatedSession2.subtitle;
        Hall session2Hall = generatedSession2.hall;

        Session session3 = new Session();
        Session generatedSession3 = session3.generate_session3();

        int session3Number = generatedSession3.number;
        LocalTime session3Time = generatedSession3.time;
        //Movie session3Movie = generatedSession3.movie;
        char session3Subtitle = generatedSession3.subtitle;
        Hall session3Hall = generatedSession3.hall;

        Session session4 = new Session();
        Session generatedSession4 = session4.generate_session4();

        int session4Number = generatedSession4.number;
        LocalTime session4Time = generatedSession4.time;
        //Movie session4Movie = generatedSession4.movie;
        char session4Subtitle = generatedSession4.subtitle;
        Hall session4Hall = generatedSession4.hall;

        Session session5 = new Session();
        Session generatedSession5 = session5.generate_session5();

        int session5Number = generatedSession5.number;
        LocalTime session5Time = generatedSession5.time;
        //Movie session5Movie = generatedSession5.movie;
        char session5Subtitle = generatedSession5.subtitle;
        Hall session5Hall = generatedSession5.hall;
        
        Session session6 = new Session();
        Session generatedSession6 = session6.generate_session6();

        int session6Number = generatedSession6.number;
        LocalTime session6Time = generatedSession6.time;
        //Movie session6Movie = generatedSession6.movie;
        char session6Subtitle = generatedSession6.subtitle;
        Hall session6Hall = generatedSession6.hall;

        Session session7 = new Session();
        Session generatedSession7 = session7.generate_session7();

        int session7Number = generatedSession7.number;
        LocalTime session7Time = generatedSession7.time;
        //Movie session7Movie = generatedSession7.movie;
        char session7Subtitle = generatedSession7.subtitle;
        Hall session7Hall = generatedSession7.hall;

        Session session8 = new Session();
        Session generatedSession8 = session8.generate_session8();

        int session8Number = generatedSession8.number;
        LocalTime session8Time = generatedSession8.time;
        //Movie session8Movie = generatedSession8.movie;
        char session8Subtitle = generatedSession8.subtitle;
        Hall session8Hall = generatedSession8.hall;

        LocalDate date1 = LocalDate.of(2023, 5, 1);
        LocalDate date2 = LocalDate.of(2023, 5, 2);
        LocalDate date3 = LocalDate.of(2023, 5, 3);
        LocalDate date4 = LocalDate.of(2023, 5, 4);
        LocalDate date5 = LocalDate.of(2023, 5, 5);  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Generates Reservation
        Reservation reservation = new Reservation();
        reservation.date = LocalDate.now();
        reservation.movie = new Movie();
        reservation.session = new Session();
        reservation.hall = new Hall();

        reservation.full_name = "";
        reservation.date = date1;
        
        boolean ok_fullname_selection = true;
        while (ok_fullname_selection) 
        {
            try 
            {
                System.out.println(CYAN);
                System.out.println("Enter your name and surname?");
                System.out.println(DARK_YELLOW);
                System.out.println("Type '0' to shutdown the program");
                System.out.println(DARK_CYAN);
                String full_name = stringScanner.nextLine();
                reservation.full_name = full_name;
                ok_fullname_selection = false;

                if (full_name.equals("0")) 
                {
                    System.out.println(DARK_YELLOW);
                    System.out.println("Program is shutting down");
                    System.exit(0);
                }
            } 
            catch (Exception e)
            {
                System.out.println(RED);
                System.out.println("!!!!! You entered an invalid value !!!!!");
                continue;
            }
            
            boolean ok_date_selection = true;
            while (ok_date_selection) 
            {
                // Prints the dates
                System.out.println(MAGENTA);
                System.out.println("Available Dates");
                System.out.println(RESET);
                System.out.println("1) " + date1.format(formatter));
                System.out.println("2) " + date2.format(formatter));
                System.out.println("3) " + date3.format(formatter));
                System.out.println("4) " + date4.format(formatter));
                System.out.println("5) " + date5.format(formatter));

                try 
                {
                    System.out.println(CYAN);
                    System.out.println("Which date do you want to buy tickets to?");
                    System.out.println(DARK_YELLOW);
                    System.out.println("Type '0' to return to the name entry screen");
                    System.out.println(DARK_CYAN);
                    selected_date = intScanner.nextInt();
                } 
                catch (Exception e) 
                {
                    System.out.println(RED);
                    System.out.println("!!!!! Enter the number associated with the date !!!!!");
                    intScanner.nextLine();
                    continue;
                }

                switch (selected_date) 
                {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Selected Date: " + date1.format(formatter));
                        reservation.date = date1;
                        ok_date_selection = false;
                        break;
                    case 2:
                        System.out.println("Selected Date: " + date2.format(formatter));
                        reservation.date = date2;
                        ok_date_selection = false;
                        break;
                    case 3:
                        System.out.println("Selected Date: " + date3.format(formatter));
                        reservation.date = date3;
                        ok_date_selection = false;
                        break;
                    case 4:
                        System.out.println("Selected Date: " + date4.format(formatter));
                        reservation.date = date4;
                        ok_date_selection = false;
                        break;
                    case 5:
                        System.out.println("Selected Date: " + date5.format(formatter));
                        reservation.date = date5;
                        ok_date_selection = false;
                        break;
                    default:
                        ok_date_selection = true;
                        System.out.println(RED);
                        System.out.println("!!!!! There is no date associated with this number !!!!!");
                        intScanner.nextLine();
                        continue;
                }

                if (selected_date == 0) 
                {
                    System.out.println("Returning to fullname selection");
                    ok_date_selection = false;
                    ok_fullname_selection = true;
                    break;
                }

                Boolean ok_movie_selection = true;
                while (ok_movie_selection)
                {
                    //Prints the movies
                    System.out.println(MAGENTA);
                    System.out.println("\nMovies");
                    System.out.println(RESET);
                    System.out.println("1) \"" + movie1Name + "\" | Genre: " + movie1Genre + " | Duration: " + movie1Duration);
                    System.out.println();
                    System.out.println("2) \"" + movie2Name + "\" | Genre: " + movie2Genre + " | Duration: " + movie2Duration);

                    System.out.println(CYAN);
                    System.out.println("Which movie do you want to buy tickets to?");
                    System.out.println(DARK_YELLOW);
                    System.out.println("Type '0' to return to the name entry screen");
                    try
                    {
                        System.out.println(DARK_CYAN);
                        selected_movie = intScanner.nextInt();
                    }
                    catch (Exception e)
                    {
                        System.out.println(RED);
                        System.out.println("!!!!! Enter the number associated with the movie !!!!!");
                        intScanner.nextLine();
                        continue;
                    }

                    switch (selected_movie)
                    {
                        case 0:
                            System.out.println(DARK_YELLOW);
                            System.out.println("Returning to date selection\n");
                            ok_date_selection = true;
                            break;
                        case 1:
                            System.out.println("selected Movie \"" + movie1Name + "\"");
                            ok_movie_selection = false;
                            break;
                        case 2:
                            System.out.println("selected Movie \"" + movie2Name + "\"");
                            ok_movie_selection = false;
                            break;
                        default:
                            System.out.println(RED);
                            System.out.println("!!!!! There is no movie associated with this number !!!!!");
                            ok_movie_selection = true;
                            continue;
                    }

                    // Returns back to date selection
                    if (selected_movie == 0)
                    {
                        ok_date_selection = true;
                        break;
                    }
                    Boolean ok_session_selection = true;
                    while (ok_session_selection)
                    {
                        switch (selected_movie)
                        {
                            case 1:
                                reservation.movie = movie1;
                                System.out.println(MAGENTA);
                                System.out.println("\nAvailable sessions");
                                System.out.println(RESET);

                                //Session 1
                                System.out.println("-----------------------------------------------------\n");
                                System.out.println("Session: " + session1Number);
                                System.out.println("Time: " + session1Time);
                                System.out.println("Subtitle: " + session1Subtitle);
                                System.out.println("Hall number: " + session1Hall);
                                System.out.println("\n-----------------------------------------------------\n");

                                //Session 2
                                System.out.println("Session: " + session2Number);
                                System.out.println("Time: " + session2Time);
                                System.out.println("Subtitle: " + session2Subtitle);
                                System.out.println("Hall number: " + session2Hall);
                                System.out.println("\n-----------------------------------------------------\n");

                                //Session 3
                                System.out.println("Session: " + session3Number);
                                System.out.println("Time: " + session3Time);
                                System.out.println("Subtitle: " + session3Subtitle);
                                System.out.println("Hall number: " + session3Hall);
                                System.out.println("\n-----------------------------------------------------\n");

                                //Session 4
                                System.out.println("Session: " + session4Number);
                                System.out.println("Time: " + session4Time);
                                System.out.println("Subtitle: " + session4Subtitle);
                                System.out.println("Hall number: " + session4Hall);
                                System.out.println("\n-----------------------------------------------------\n");
                                break;

                            case 2:
                                reservation.movie = movie2;
                                System.out.println(MAGENTA);
                                System.out.println("\nAvailable sessions");
                                System.out.println(RESET);

                                //Session 5
                                System.out.println("-----------------------------------------------------\n");
                                System.out.println("Session: " + session5Number);
                                System.out.println("Time: " + session5Time);
                                System.out.println("Subtitle: " + session5Subtitle);
                                System.out.println("Hall number: " + session5Hall);
                                System.out.println("\n-----------------------------------------------------\n");

                                //Session 6
                                System.out.println("-----------------------------------------------------\n");
                                System.out.println("Session: " + session6Number);
                                System.out.println("Time: " + session6Time);
                                System.out.println("Subtitle: " + session6Subtitle);
                                System.out.println("Hall number: " + session6Hall);
                                System.out.println("\n-----------------------------------------------------\n");

                                //Session 7
                                System.out.println("-----------------------------------------------------\n");
                                System.out.println("Session: " + session7Number);
                                System.out.println("Time: " + session7Time);
                                System.out.println("Subtitle: " + session7Subtitle);
                                System.out.println("Hall number: " + session7Hall);
                                System.out.println("\n-----------------------------------------------------\n");

                                //Session 8
                                System.out.println("-----------------------------------------------------\n");
                                System.out.println("Session: " + session8Number);
                                System.out.println("Time: " + session8Time);
                                System.out.println("Subtitle: " + session8Subtitle);
                                System.out.println("Hall number: " + session8Hall);
                                System.out.println("\n-----------------------------------------------------\n");
                                break;
                            default:
                                System.out.println(RED);
                                System.out.println("!!!!! There is no Session for this film !!!!!");
                                continue;
                        }
                        System.out.println(CYAN);
                        System.out.println("Which session do you want to buy tickets to?");
                        System.out.println(DARK_YELLOW);
                        System.out.println("Type '0' to go back to movie selection");

                        try
                        {
                            System.out.println(DARK_CYAN);
                            selected_session = intScanner.nextInt();
                        }
                        catch (Exception e)
                        {
                            System.out.println(RED);
                            System.out.println("!!!!! Enter the number associated with the session !!!!!");
                            intScanner.nextLine();
                            continue;
                        }

                        //Returns back to movie selection
                        if (selected_session == 0)
                        {
                            System.out.println(DARK_YELLOW);
                            System.out.println("Returning to movie selection");
                            ok_movie_selection = true;
                            break;
                        }
                        else if (selected_movie == 1)
                        {
                            System.out.println(DARK_CYAN);
                            switch (selected_session)
                            {
                                case 1:
                                    System.out.println("Selected session: " + session1Number);

                                    reservation.session.number = session1Number;
                                    ok_session_selection = false;
                                    break;
                                case 2:
                                    System.out.println("Selected session: " + session2Number);
                                    reservation.session.number = session2Number;
                                    ok_session_selection = false;
                                    break;
                                case 3:
                                    System.out.println("Selected session: " + session3Number);
                                    reservation.session.number = session3Number;
                                    ok_session_selection = false;
                                    break;
                                case 4:
                                    System.out.println("Selected session: " + session4Number);
                                    reservation.session.number = session4Number;
                                    ok_session_selection = false;
                                    break;
                                default:
                                    System.out.println(RED);
                                    System.out.println("!!!!! There is no session associated with this number !!!!!");
                                    ok_session_selection = true;
                                    continue;
                            }
                        }

                        // Prints the selected session
                        else if (selected_movie == 2)
                        {
                            System.out.println(DARK_CYAN);
                            switch (selected_session)
                            {
                                case 0:
                                    break;
                                case 5:
                                    System.out.println("Selected session: " + session5Number);
                                    reservation.session.number = session5Number;
                                    ok_session_selection = false;
                                    break;
                                case 6:
                                    System.out.println("Selected session: " + session6Number);
                                    reservation.session.number = session6Number;
                                    ok_session_selection = false;
                                    break;
                                case 7:
                                    System.out.println("Selected session: " + session7Number);
                                    reservation.session.number = session7Number;
                                    ok_session_selection = false;
                                    break;
                                case 8:
                                    System.out.println("Selected session: " + session8Number);
                                    reservation.session.number = session8Number;
                                    ok_session_selection = false;
                                    break;
                                default:
                                    System.out.println(RED);
                                    System.out.println("!!!!! There is no session associated with this number !!!!!");
                                    ok_session_selection = true;
                                    continue;
                            }
                        }
                        Boolean ok_number_of_tickets = true;
                        while (ok_number_of_tickets)
                        {
                            System.out.println(MAGENTA);
                            System.out.println("\nTotal number of available seats: " + (hall.capacity - occupied_seat_list.get(selected_session - 1)));
                            System.out.println(CYAN);
                            System.out.println("how many tickets do you want to buy");
                            System.out.println(DARK_YELLOW);
                            System.out.println("Type '0' to go back to session selection");
                            try
                            {
                                System.out.println(DARK_CYAN);
                                number_of_tickets = intScanner.nextInt();
                                if (number_of_tickets <= (hall.capacity - occupied_seat_list.get(selected_session - 1)))
                                {
                                    number_of_tickets2 = number_of_tickets;
                                    ok_number_of_tickets = false;
                                }
                                else
                                {
                                    System.out.println(RED);
                                    System.out.println("There aren't that many empty seats");
                                    ok_number_of_tickets = true;
                                    continue;
                                }
                            }
                            catch (Exception e)
                            {
                                System.out.println(RED);
                                System.out.println("!!!!! Please enter a number !!!!!");
                                intScanner.nextLine();
                                ok_number_of_tickets = true;
                                continue;
                            }
                            // Returns back to number of tickets selection
                            if (number_of_tickets == 0)
                            {
                                System.out.println(DARK_YELLOW);
                                System.out.println("Returning to session selection");
                                ok_number_of_tickets = false;
                                ok_session_selection = true;
                                break;
                            }
                            else
                            {
                                ok_session_selection = false;
                            }
                            Boolean ok_seat_selection = true;
                            while (ok_seat_selection)
                            {
                                switch (selected_session)
                                {
                                    case 1:
                                        Hall.replace_seats1(seats1, seats1s);
                                        break;
                                    case 2:
                                        Hall.replace_seats2(seats2, seats2s);
                                        break;
                                    case 3:
                                        Hall.replace_seats3(seats3, seats3s);
                                        break;
                                    case 4:
                                        Hall.replace_seats4(seats4, seats4s);
                                        break;
                                    case 5:
                                        Hall.replace_seats5(seats5, seats5s);
                                        break;
                                    case 6:
                                        Hall.replace_seats6(seats6, seats6s);
                                        break;
                                    case 7:
                                        Hall.replace_seats7(seats7, seats7s);
                                        break;
                                    case 8:
                                        Hall.replace_seats8(seats8, seats8s);
                                        break;
                                }

                                // Prints the "SCREEN"
                                System.out.println(MAGENTA);
                                for (int i = 0; i <= Hall.column * 1.8; i++)
                                {
                                    System.out.print("--");
                                }
                                System.out.print("SCREEN");
                                for (int i = 0; i <= Hall.column * 1.8; i++)
                                {
                                    System.out.print("--");
                                }
                                System.out.println();
                                System.out.println(MAGENTA);
                                System.out.println("\nTotal number of seats: " + hall.capacity);
                                System.out.println(GRAY);

                                switch (selected_session)
                                {
                                    case 1:
                                        // Prints the seats of session1
                                        System.out.println("Session 1\n");
                                        Hall.print_seats1(seats1);
                                        break;

                                    case 2:
                                        // Prints the seats of session2
                                        System.out.println("Session 2\n");
                                        Hall.print_seats2(seats2);
                                        break;
                                    case 3:
                                        // Prints the seats of session3
                                        System.out.println("Session 3\n");
                                        Hall.print_seats3(seats3);
                                        break;
                                    case 4:
                                        // Prints the seats of session4
                                        System.out.println("Session 4\n");
                                        Hall.print_seats4(seats4);
                                        break;
                                    case 5:
                                        // Prints the seats of session5
                                        System.out.println("Session 5\n");
                                        Hall.print_seats5(seats5);
                                        break;
                                    case 6:
                                        // Prints the seats of session6
                                        System.out.println("Session 6\n");
                                        Hall.print_seats6(seats6);
                                        break;
                                    case 7:
                                        // Prints the seats of session7
                                        System.out.println("Session 7\n");
                                        Hall.print_seats7(seats7);
                                        break;
                                    case 8:
                                        // Prints the seats of session8
                                        System.out.println("Session 8\n");
                                        Hall.print_seats8(seats8);
                                        break;
                                }
                                
                                taken_seats.clear();

                                String[] seat_number = new String[number_of_tickets];

                                for (int i = 0; i < number_of_tickets; i++)
                                {
                                    System.out.println(DARK_CYAN);
                                    System.out.println("seat " + (i + 1));
                                    selected_seat = stringScanner.nextLine().toLowerCase();
                                    if (selected_seat.equals("0"))
                                    {
                                        System.out.println("Returning to number of tickets selection");
                                        ok_seat_selection = false;
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println(selected_seat);

                                    }
                                    if (seat_list[(selected_session - 1)].contains(selected_seat))
                                    {
                                        System.out.println();
                                    }
                                    else
                                    {
                                        System.out.println(RED);
                                        System.out.println("This seat is full or not exist");
                                        System.out.println("Selected seats have been reset");
                                        i--;
                                        ok_seat_selection = true;
                                        continue;
                                    }
                                    switch (selected_session)
                                    {
                                        case 1:
                                            seat_number[i] = selected_seat;
                                            int line1 = seat_number[i].charAt(0) - 'a';
                                            int col1 = seat_number[i].charAt(1) - '1';

                                            if (seats1[line1][col1].equals("xx"))
                                            {
                                                System.out.println(RED);
                                                System.out.println("This seat is taken");
                                                i--;
                                                break;
                                            }
                                            else
                                            {
                                                taken_seats.add(seat_number[i]);
                                                seats1[line1][col1] = "xx";
                                            }
                                            break;
                                        case 2:
                                            seat_number[i] = selected_seat;
                                            int line2 = seat_number[i].charAt(0) - 'a';
                                            int col2 = seat_number[i].charAt(1) - '1';

                                            if (seats2[line2][col2].equals("xx"))
                                            {
                                                System.out.println(RED);
                                                System.out.println("This seat is taken");
                                                i--;
                                                break;
                                            }
                                            else
                                            {
                                                taken_seats.add(seat_number[i]);
                                                seats2[line2][col2] = "xx";
                                            }
                                            break;   
                                        case 3:
                                            seat_number[i] = selected_seat;
                                            int line3 = seat_number[i].charAt(0) - 'a';
                                            int col3 = seat_number[i].charAt(1) - '1';

                                            if (seats3[line3][col3].equals("xx"))
                                            {
                                                System.out.println(RED);
                                                System.out.println("This seat is taken");
                                                i--;
                                                break;
                                            }
                                            else
                                            {
                                                taken_seats.add(seat_number[i]);
                                                seats3[line3][col3] = "xx";
                                            }
                                            break;   
                                        case 4:
                                            seat_number[i] = selected_seat;
                                            int line4 = seat_number[i].charAt(0) - 'a';
                                            int col4 = seat_number[i].charAt(1) - '1';

                                            if (seats4[line4][col4].equals("xx"))
                                            {
                                                System.out.println(RED);
                                                System.out.println("This seat is taken");
                                                i--;
                                                break;
                                            }
                                            else
                                            {
                                                taken_seats.add(seat_number[i]);
                                                seats4[line4][col4] = "xx";
                                            }
                                            break;    
                                        case 5:
                                            seat_number[i] = selected_seat;
                                            int line5 = seat_number[i].charAt(0) - 'a';
                                            int col5 = seat_number[i].charAt(1) - '1';

                                            if (seats5[line5][col5].equals("xx"))
                                            {
                                                System.out.println(RED);
                                                System.out.println("This seat is taken");
                                                i--;
                                                break;
                                            }
                                            else
                                            {
                                                taken_seats.add(seat_number[i]);
                                                seats5[line5][col5] = "xx";
                                            }
                                            break;
                                        case 6:
                                            seat_number[i] = selected_seat;
                                            int line6 = seat_number[i].charAt(0) - 'a';
                                            int col6 = seat_number[i].charAt(1) - '1';

                                            if (seats6[line6][col6].equals("xx"))
                                            {
                                                System.out.println(RED);
                                                System.out.println("This seat is taken");
                                                i--;
                                                break;
                                            }
                                            else
                                            {
                                                taken_seats.add(seat_number[i]);
                                                seats6[line6][col6] = "xx";
                                            }
                                            break;  
                                        case 7:
                                            seat_number[i] = selected_seat;
                                            int line7 = seat_number[i].charAt(0) - 'a';
                                            int col7 = seat_number[i].charAt(1) - '1';

                                            if (seats7[line7][col7].equals("xx"))
                                            {
                                                System.out.println(RED);
                                                System.out.println("This seat is taken");
                                                i--;
                                                break;
                                            }
                                            else
                                            {
                                                taken_seats.add(seat_number[i]);
                                                seats7[line7][col7] = "xx";
                                            }
                                            break;
                                        case 8:
                                            seat_number[i] = selected_seat;
                                            int line8 = seat_number[i].charAt(0) - 'a';
                                            int col8 = seat_number[i].charAt(1) - '1';

                                            if (seats8[line8][col8].equals("xx"))
                                            {
                                                System.out.println(RED);
                                                System.out.println("This seat is taken");
                                                i--;
                                                break;
                                            }
                                            else
                                            {
                                                taken_seats.add(seat_number[i]);
                                                seats8[line8][col8] = "xx";
                                            }
                                            break;          
                                    }
                                    System.out.println(CYAN);
                                    System.out.println("Seat number: " + String.join(", ", taken_seats));
                                    reservation.seat = String.join(", ", taken_seats);
                                    if (i == (number_of_tickets - 1))
                                    {
                                        ok_seat_selection = false;
                                        break;
                                    } 
                                }  
                                // Returns back to number of tickets selection
                                if (selected_seat.equals("0"))
                                {
                                    ok_seat_selection = false;
                                    ok_number_of_tickets = true;
                                    break;
                                }  
                                System.out.println(YELLOW);
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Full name: " + reservation.full_name);
                                System.out.println("Selected date: " + reservation.date);
                                System.out.println("Selected movie: \"" + reservation.movie.name + "\"");
                                System.out.println("Selected session: " + reservation.session.number);   
                                switch (reservation.session.number)
                                {
                                    case 1:
                                        //Session 1
                                        System.out.println("Time: " + session1Time);
                                        System.out.println("Subtitle: " + session1Subtitle);
                                        System.out.println("Hall number: " + session1Hall.number);
                                        System.out.println("Seat number: " + String.join(", ", taken_seats));
                                        System.out.println("-----------------------------------------------------\n");
                                        break;
                                    case 2:
                                        //Session 2
                                        System.out.println("Time: " + session2Time);
                                        System.out.println("Subtitle: " + session2Subtitle);
                                        System.out.println("Hall number: " + session2Hall.number);
                                        System.out.println("Seat number: " + String.join(", ", taken_seats));
                                        System.out.println("-----------------------------------------------------\n");
                                        break;
                                    case 3:
                                        //Session 3
                                        System.out.println("Time: " + session3Time);
                                        System.out.println("Subtitle: " + session3Subtitle);
                                        System.out.println("Hall number: " + session3Hall.number);
                                        System.out.println("Seat number: " + String.join(", ", taken_seats));
                                        System.out.println("-----------------------------------------------------\n");
                                        break;
                                    case 4:
                                        //Session 4
                                        System.out.println("Time: " + session4Time);
                                        System.out.println("Subtitle: " + session4Subtitle);
                                        System.out.println("Hall number: " + session4Hall.number);
                                        System.out.println("Seat number: " + String.join(", ", taken_seats));
                                        System.out.println("-----------------------------------------------------\n");
                                        break;
                                    case 5:
                                        //Session 5
                                        System.out.println("Time: " + session5Time);
                                        System.out.println("Subtitle: " + session5Subtitle);
                                        System.out.println("Hall number: " + session5Hall.number);
                                        System.out.println("Seat number: " + String.join(", ", taken_seats));
                                        System.out.println("-----------------------------------------------------\n");
                                        break;
                                    case 6:
                                        //Session 6
                                        System.out.println("Time: " + session6Time);
                                        System.out.println("Subtitle: " + session6Subtitle);
                                        System.out.println("Hall number: " + session6Hall.number);
                                        System.out.println("Seat number: " + String.join(", ", taken_seats));
                                        System.out.println("-----------------------------------------------------\n");
                                        break;
                                    case 7:
                                        //Session 7
                                        System.out.println("Time: " + session7Time);
                                        System.out.println("Subtitle: " + session7Subtitle);
                                        System.out.println("Hall number: " + session7Hall.number);
                                        System.out.println("Seat number: " + String.join(", ", taken_seats));
                                        System.out.println("-----------------------------------------------------\n");
                                        break;
                                    case 8:
                                        //Session 8
                                        System.out.println("Time: " + session8Time);
                                        System.out.println("Subtitle: " + session8Subtitle);
                                        System.out.println("Hall number: " + session8Hall.number);
                                        System.out.println("Seat number: " + String.join(", ", taken_seats));
                                        System.out.println("-----------------------------------------------------\n");
                                        break;
                                } 
                                Boolean ok_payment_selection = true;
                                while (ok_payment_selection)
                                {
                                    try
                                    {
                                        System.out.println(CYAN);
                                        System.out.println("Which payment method do you want to pay with?");
                                        System.out.println(RESET);
                                        System.out.println("1) Cash\n2) Credit card");
                                        System.out.println(DARK_YELLOW);
                                        System.out.println("Type '0' to go to seat selection");
                                        System.out.println(DARK_CYAN);
                                        int payment = intScanner.nextInt();
                                        if (payment == 0)
                                        {
                                            System.out.println(DARK_YELLOW);
                                            System.out.println("Returning to seat selection");
                                            ok_payment_selection = false;
                                            ok_seat_selection = true;
                                            break;
                                        }
                                        else if (payment == 1)
                                        {
                                            reservation.payment_method = "Cash";  
                                        }
                                        else if (payment == 2)
                                        {
                                            reservation.payment_method = "Credit Card";
                                        }
                                        else
                                        {
                                            System.out.println(RED);
                                            System.out.println("!!!!! Enter the number associated with the method !!!!!");
                                            ok_payment_selection = true;
                                            continue;
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        System.out.println(RED);
                                        System.out.println("!!!!! Enter a number !!!!!");
                                        intScanner.nextLine();
                                        ok_payment_selection = true;
                                        continue;
                                    } 
                                    boolean ok_confirmation = true;
                                    while (ok_confirmation)
                                    {
                                        try
                                        {
                                            System.out.println("Selected payment method: " + reservation.payment_method);
                                            System.out.println(CYAN);
                                            System.out.println("Type 1 to confirm your payment");
                                            System.out.println(DARK_YELLOW);
                                            System.out.println("Type '0' to go to payment selection");
                                            System.out.println(DARK_CYAN);
                                            confirmation = intScanner.nextInt();
                                            if (confirmation == 0)
                                            {

                                                System.out.println(DARK_YELLOW);
                                                System.out.println("program is shutting down");
                                                ok_confirmation = false;
                                                ok_payment_selection = true;
                                                break;
                                            }

                                            else if (confirmation == 1)
                                            {
                                                System.out.println(GREEN);
                                                System.out.println("Your ticket has been confirmed have a good watching");
                                                System.exit(0);
                                            }
                                            else
                                            {
                                                System.out.println(RED);
                                                System.out.println("!!!!! There is no function associated with this number !!!!!");
                                                ok_confirmation = true;
                                                continue;
                                            }
                                        }
                                        catch (Exception e)
                                        {
                                            System.out.println(RED);
                                            System.out.println("!!!!! Enter the number associated with the function !!!!!");
                                            ok_confirmation = true;
                                        }
                                    }
                                }
                            }  
                        }
                    }
                }                       
            }
        }
        intScanner.close();
        stringScanner.close();
    }
}
