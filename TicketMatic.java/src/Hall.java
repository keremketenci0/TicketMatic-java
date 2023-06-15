import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hall 
{
    public int number;
    public String seat_number;
    public int capacity;

    public static int row = 6; // Determines how many rows of cinema seats
    public static int column = 9; // Determines how many coulums of cinema seats
    public static int minrow = 4; // Determines the number of seats in the first row

    public Hall generate_hall1()
    {
        //Generates the hall1
        this.number = 1;
        return this;
    }
    public Hall generate_hall2()
    {
        //Generates the hall2
        this.number = 2;
        return this;
    }
    public Hall generate_hall3()
    {
        //Generates the hall3
        this.number = 3;
        return this;
    }
    public Hall generate_hall4()
    {
        //Generates the hall4
        this.number = 4;
        return this;
    }

    public static Object[] generate_seats1() 
    {
        // creates a 2D array for the seats of the movie hall
        String[][] seats1 = new String[row][column];
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < minrow + i; j++) 
            {
                seats1[i][j] = Character.toString((char) (i + 97)) + Integer.toString(j + 1);
            }
        }
        Random random = new Random();
        // determines the maximum number of occupied seats that can be
        int full_seat1 = random.nextInt((row * (2 * minrow + row - 1) / 2) - 2) + 1; // with at least one seat left vacant
        // Marks the full_seat as "xx"
        for (int i = 0; i < full_seat1; i++) 
        {
            int line = random.nextInt(row);
            int col = random.nextInt(minrow + line);
            seats1[line][col] = "xx";
        }
        String[][] seats1s = new String[seats1.length][seats1[0].length]; // seats1s dizisi seats1 dizisiyle aynı boyutta oluşturulur
        for (int i = 0; i < seats1.length; i++) 
        {
            for (int j = 0; j < seats1[i].length; j++) 
            {
                seats1s[i][j] = seats1[i][j]; // seats1 dizisindeki elemanlar seats1s dizisine kopyalanır
            }
        }
        List<String> seatList1 = new ArrayList<>();
        for (int i = 0; i < seats1.length; i++) 
        {
            for (int j = 0; j < seats1[i].length; j++) 
            {
                seatList1.add(seats1[i][j]); // Add each element of seats1 to seatList1
            }
        }
        int occupied_seats1 = 0;
        for (String seat : seatList1) {
            if (seat != null && seat.equals("xx")) {
                occupied_seats1++;
            }
        }
        return new Object[]{seats1, seats1s, seatList1, occupied_seats1};
    }
    
    public static void print_seats1(String[][] seats1) 
    {
        // Prints the seats
        for (int i = 0; i < row; i++) {
            // Adds "-" characters per line
            for (int j = 0; j < row - i - 1; j++) 
            {
                System.out.print("----");
            }

            // Prints the seats for the left half of the row
            for (int j = 0; j < minrow + i / 2; j++) 
            {
                System.out.print(seats1[i][j] + "\t");
            }

            // Prints the seats for the right half of the row
            for (int j = minrow + i / 2; j < minrow + i; j++) 
            {
                System.out.print(seats1[i][j] + "\t");
            }

            // Adds "-" characters for the remaining seats in the row
            for (int j = 0; j < row - i - 1; j++) 
            {
                System.out.print("----");
            }
            System.out.println();
        }
    }

    public static String[][] replace_seats1(String[][] seats1, String[][] seats1s) 
    {
        for (int i = 0; i < seats1s.length; i++) 
        {
            for (int j = 0; j < seats1s[i].length; j++) 
            {
                seats1[i][j] = seats1s[i][j]; // seats1s dizisindeki elemanlar seats1 dizisine kopyalanır
            }
        }
        return seats1s;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static Object[] generate_seats2() 
    {
        // creates a 2D array for the seats of the movie hall
        String[][] seats2 = new String[row][column];
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < minrow + i; j++) 
            {
                seats2[i][j] = Character.toString((char) (i + 97)) + Integer.toString(j + 1);
            }
        }
        Random random = new Random();
        // determines the maximum number of occupied seats that can be
        int full_seat2 = random.nextInt((row * (2 * minrow + row - 1) / 2) - 2) + 1; // with at least one seat left vacant
        // Marks the full_seat as "xx"
        for (int i = 0; i < full_seat2; i++) 
        {
            int line = random.nextInt(row);
            int col = random.nextInt(minrow + line);
            seats2[line][col] = "xx";
        }
        String[][] seats2s = new String[seats2.length][seats2[0].length]; // seats1s dizisi seats1 dizisiyle aynı boyutta oluşturulur
        for (int i = 0; i < seats2.length; i++) 
        {
            for (int j = 0; j < seats2[i].length; j++) 
            {
                seats2s[i][j] = seats2[i][j]; // seats1 dizisindeki elemanlar seats1s dizisine kopyalanır
            }
        }
        List<String> seatList2 = new ArrayList<>();
        for (int i = 0; i < seats2.length; i++) 
        {
            for (int j = 0; j < seats2[i].length; j++) 
            {
                seatList2.add(seats2[i][j]); // Add each element of seats1 to seatList1
            }
        }
        int occupied_seats2 = 0;
        for (String seat : seatList2) {
            if (seat != null && seat.equals("xx")) {
                occupied_seats2++;
            }
        }
        return new Object[]{seats2, seats2s, seatList2, occupied_seats2};
    }
    
    public static void print_seats2(String[][] seats2) 
    {
        // Prints the seats
        for (int i = 0; i < row; i++) {
            // Adds "-" characters per line
            for (int j = 0; j < row - i - 1; j++) 
            {
                System.out.print("----");
            }

            // Prints the seats for the left half of the row
            for (int j = 0; j < minrow + i / 2; j++) 
            {
                System.out.print(seats2[i][j] + "\t");
            }

            // Prints the seats for the right half of the row
            for (int j = minrow + i / 2; j < minrow + i; j++) 
            {
                System.out.print(seats2[i][j] + "\t");
            }

            // Adds "-" characters for the remaining seats in the row
            for (int j = 0; j < row - i - 1; j++) 
            {
                System.out.print("----");
            }
            System.out.println();
        }
    }
    
    public static String[][] replace_seats2(String[][] seats2, String[][] seats2s) 
    {
        for (int i = 0; i < seats2s.length; i++) 
        {
            for (int j = 0; j < seats2s[i].length; j++) 
            {
                seats2[i][j] = seats2s[i][j]; // seats2s dizisindeki elemanlar seats2 dizisine kopyalanır
            }
        }
        return seats2s;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Object[] generate_seats3() {
    String[][] seats3 = new String[row][column];
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < minrow + i; j++) {
            seats3[i][j] = Character.toString((char) (i + 97)) + Integer.toString(j + 1);
        }
    }
    Random random = new Random();
    int fullSeat3 = random.nextInt((row * (2 * minrow + row - 1) / 2) - 2) + 1;
    for (int i = 0; i < fullSeat3; i++) {
        int line = random.nextInt(row);
        int col = random.nextInt(minrow + line);
        seats3[line][col] = "xx";
    }
    String[][] seats3s = new String[seats3.length][seats3[0].length];
    for (int i = 0; i < seats3.length; i++) {
        for (int j = 0; j < seats3[i].length; j++) {
            seats3s[i][j] = seats3[i][j];
        }
    }
    List<String> seatList3 = new ArrayList<>();
    for (int i = 0; i < seats3.length; i++) {
        for (int j = 0; j < seats3[i].length; j++) {
            seatList3.add(seats3[i][j]);
        }
    }
    int occupied_seats3 = 0;
    for (String seat : seatList3) {
        if (seat != null && seat.equals("xx")) {
            occupied_seats3++;
        }
    }
    return new Object[]{seats3, seats3s, seatList3, occupied_seats3};
}

    public static void print_seats3(String[][] seats3) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            for (int j = 0; j < minrow + i / 2; j++) {
                System.out.print(seats3[i][j] + "\t");
            }
            for (int j = minrow + i / 2; j < minrow + i; j++) {
                System.out.print(seats3[i][j] + "\t");
            }
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }

    public static String[][] replace_seats3(String[][] seats3, String[][] seats3s) {
        for (int i = 0; i < seats3s.length; i++) {
            for (int j = 0; j < seats3s[i].length; j++) {
                seats3[i][j] = seats3s[i][j];
            }
        }
        return seats3s;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Object[] generate_seats4() 
    {
        String[][] seats4 = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < minrow + i; j++) {
                seats4[i][j] = Character.toString((char) (i + 97)) + Integer.toString(j + 1);
            }
        }
        Random random = new Random();
        int fullSeat4 = random.nextInt((row * (2 * minrow + row - 1) / 2) - 2) + 1;
        for (int i = 0; i < fullSeat4; i++) {
            int line = random.nextInt(row);
            int col = random.nextInt(minrow + line);
            seats4[line][col] = "xx";
        }
        String[][] seats4s = new String[seats4.length][seats4[0].length];
        for (int i = 0; i < seats4.length; i++) {
            for (int j = 0; j < seats4[i].length; j++) {
                seats4s[i][j] = seats4[i][j];
            }
        }
        List<String> seatList4 = new ArrayList<>();
        for (int i = 0; i < seats4.length; i++) {
            for (int j = 0; j < seats4[i].length; j++) {
                seatList4.add(seats4[i][j]);
            }
        }
        int occupied_seats4 = 0;
        for (String seat : seatList4) {
            if (seat != null && seat.equals("xx")) {
                occupied_seats4++;
            }
        }
        return new Object[]{seats4, seats4s, seatList4, occupied_seats4};
    }

    public static void print_seats4(String[][] seats4) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            for (int j = 0; j < minrow + i / 2; j++) {
                System.out.print(seats4[i][j] + "\t");
            }
            for (int j = minrow + i / 2; j < minrow + i; j++) {
                System.out.print(seats4[i][j] + "\t");
            }
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }

    public static String[][] replace_seats4(String[][] seats4, String[][] seats4s) {
        for (int i = 0; i < seats4s.length; i++) {
            for (int j = 0; j < seats4s[i].length; j++) {
                seats4[i][j] = seats4s[i][j];
            }
        }
        return seats4s;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Object[] generate_seats5() 
    {
        String[][] seats5 = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < minrow + i; j++) {
                seats5[i][j] = Character.toString((char) (i + 97)) + Integer.toString(j + 1);
            }
        }
        Random random = new Random();
        int fullSeat5 = random.nextInt((row * (2 * minrow + row - 1) / 2) - 2) + 1;
        for (int i = 0; i < fullSeat5; i++) {
            int line = random.nextInt(row);
            int col = random.nextInt(minrow + line);
            seats5[line][col] = "xx";
        }
        String[][] seats5s = new String[seats5.length][seats5[0].length];
        for (int i = 0; i < seats5.length; i++) {
            for (int j = 0; j < seats5[i].length; j++) {
                seats5s[i][j] = seats5[i][j];
            }
        }
        List<String> seatList5 = new ArrayList<>();
        for (int i = 0; i < seats5.length; i++) {
            for (int j = 0; j < seats5[i].length; j++) {
                seatList5.add(seats5[i][j]);
            }
        }
        int occupied_seats5 = 0;
        for (String seat : seatList5) {
            if (seat != null && seat.equals("xx")) {
                occupied_seats5++;
            }
        }
        return new Object[]{seats5, seats5s, seatList5, occupied_seats5};
    }

    public static void print_seats5(String[][] seats5) 
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            for (int j = 0; j < minrow + i / 2; j++) {
                System.out.print(seats5[i][j] + "\t");
            }
            for (int j = minrow + i / 2; j < minrow + i; j++) {
                System.out.print(seats5[i][j] + "\t");
            }
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }

    public static String[][] replace_seats5(String[][] seats5, String[][] seats5s) 
    {
        for (int i = 0; i < seats5s.length; i++) {
            for (int j = 0; j < seats5s[i].length; j++) {
                seats5[i][j] = seats5s[i][j];
            }
        }
        return seats5s;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Object[] generate_seats6() 
    {
        String[][] seats6 = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < minrow + i; j++) {
                seats6[i][j] = Character.toString((char) (i + 97)) + Integer.toString(j + 1);
            }
        }
        Random random = new Random();
        int fullSeat6 = random.nextInt((row * (2 * minrow + row - 1) / 2) - 2) + 1;
        for (int i = 0; i < fullSeat6; i++) {
            int line = random.nextInt(row);
            int col = random.nextInt(minrow + line);
            seats6[line][col] = "xx";
        }
        String[][] seats6s = new String[seats6.length][seats6[0].length];
        for (int i = 0; i < seats6.length; i++) {
            for (int j = 0; j < seats6[i].length; j++) {
                seats6s[i][j] = seats6[i][j];
            }
        }
        List<String> seatList6 = new ArrayList<>();
        for (int i = 0; i < seats6.length; i++) {
            for (int j = 0; j < seats6[i].length; j++) {
                seatList6.add(seats6[i][j]);
            }
        }
        int occupied_seats6 = 0;
        for (String seat : seatList6) {
            if (seat != null && seat.equals("xx")) {
                occupied_seats6++;
            }
        }
        return new Object[]{seats6, seats6s, seatList6, occupied_seats6};
    }

    public static void print_seats6(String[][] seats6) 
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            for (int j = 0; j < minrow + i / 2; j++) {
                System.out.print(seats6[i][j] + "\t");
            }
            for (int j = minrow + i / 2; j < minrow + i; j++) {
                System.out.print(seats6[i][j] + "\t");
            }
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }

    public static String[][] replace_seats6(String[][] seats6, String[][] seats6s) 
    {
        for (int i = 0; i < seats6s.length; i++) {
            for (int j = 0; j < seats6s[i].length; j++) {
                seats6[i][j] = seats6s[i][j];
            }
        }
        return seats6s;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Object[] generate_seats7() 
    {
        String[][] seats7 = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < minrow + i; j++) {
                seats7[i][j] = Character.toString((char) (i + 97)) + Integer.toString(j + 1);
            }
        }
        Random random = new Random();
        int fullSeat7 = random.nextInt((row * (2 * minrow + row - 1) / 2) - 2) + 1;
        for (int i = 0; i < fullSeat7; i++) {
            int line = random.nextInt(row);
            int col = random.nextInt(minrow + line);
            seats7[line][col] = "xx";
        }
        String[][] seats7s = new String[seats7.length][seats7[0].length];
        for (int i = 0; i < seats7.length; i++) {
            for (int j = 0; j < seats7[i].length; j++) {
                seats7s[i][j] = seats7[i][j];
            }
        }
        List<String> seatList7 = new ArrayList<>();
        for (int i = 0; i < seats7.length; i++) {
            for (int j = 0; j < seats7[i].length; j++) {
                seatList7.add(seats7[i][j]);
            }
        }
        int occupied_seats7 = 0;
        for (String seat : seatList7) {
            if (seat != null && seat.equals("xx")) {
                occupied_seats7++;
            }
        }
        return new Object[]{seats7, seats7s, seatList7, occupied_seats7};
    }

    public static void print_seats7(String[][] seats7) 
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            for (int j = 0; j < minrow + i / 2; j++) {
                System.out.print(seats7[i][j] + "\t");
            }
            for (int j = minrow + i / 2; j < minrow + i; j++) {
                System.out.print(seats7[i][j] + "\t");
            }
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }

    public static String[][] replace_seats7(String[][] seats7, String[][] seats7s) 
    {
        for (int i = 0; i < seats7s.length; i++) {
            for (int j = 0; j < seats7s[i].length; j++) {
                seats7[i][j] = seats7s[i][j];
            }
        }
        return seats7s;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Object[] generate_seats8() 
    {
        String[][] seats8 = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < minrow + i; j++) {
                seats8[i][j] = Character.toString((char) (i + 97)) + Integer.toString(j + 1);
            }
        }
        Random random = new Random();
        int fullSeat8 = random.nextInt((row * (2 * minrow + row - 1) / 2) - 2) + 1;
        for (int i = 0; i < fullSeat8; i++) {
            int line = random.nextInt(row);
            int col = random.nextInt(minrow + line);
            seats8[line][col] = "xx";
        }
        String[][] seats8s = new String[seats8.length][seats8[0].length];
        for (int i = 0; i < seats8.length; i++) {
            for (int j = 0; j < seats8[i].length; j++) {
                seats8s[i][j] = seats8[i][j];
            }
        }
        List<String> seatList8 = new ArrayList<>();
        for (int i = 0; i < seats8.length; i++) {
            for (int j = 0; j < seats8[i].length; j++) {
                seatList8.add(seats8[i][j]);
            }
        }
        int occupied_seats8 = 0;
        for (String seat : seatList8) {
            if (seat != null && seat.equals("xx")) {
                occupied_seats8++;
            }
        }
        return new Object[]{seats8, seats8s, seatList8, occupied_seats8};
    }

    public static void print_seats8(String[][] seats8) 
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            for (int j = 0; j < minrow + i / 2; j++) {
                System.out.print(seats8[i][j] + "\t");
            }
            for (int j = minrow + i / 2; j < minrow + i; j++) {
                System.out.print(seats8[i][j] + "\t");
            }
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }

    public static String[][] replace_seats8(String[][] seats8, String[][] seats8s) 
    {
        for (int i = 0; i < seats8s.length; i++) {
            for (int j = 0; j < seats8s[i].length; j++) {
                seats8[i][j] = seats8s[i][j];
            }
        }
        return seats8s;
    }

}
