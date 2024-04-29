import java.util.Scanner;
import java.util.ArrayList;

public class WeeklyTemp {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> days = new ArrayList<String>();
    static ArrayList<Integer> temperatures = new ArrayList<Integer>();

    // populating the two arraylists
    public static void populateLists() {
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        temperatures.add(52);
        temperatures.add(48);
        temperatures.add(50);
        temperatures.add(55);
        temperatures.add(57);
        temperatures.add(54);
        temperatures.add(60);
    }

    // Calculating the weeks average temperature.
    public static int weekAverageTemp() {
        int tempSum = 0;
        int avgTemp = 0;

        for(int temp : temperatures) {
            tempSum += temp;
        }
        avgTemp = (tempSum / temperatures.size());

        return avgTemp;
    }

    // Printing the user's desired average temperature
    public static void printTemp() {

        String stringInput = "";

        while(stringInput != "q") {
            System.out.println("");
            System.out.println("Please enter a valid day of the week or enter \"week\" to see the average temperature. Enter \"q\" to quit: ");
            stringInput = input.nextLine();

            switch(stringInput.toLowerCase()) {
                case "sunday":
                System.out.println("Sundays's average temperature was " + temperatures.get(0) + " degrees.");
                break;
                case "monday":
                System.out.println("Monday's average temperature was " + temperatures.get(1) + " degrees.");
                break;
                case "tuesday":
                System.out.println("Tuesday's average temperature was " + temperatures.get(2) + " degrees.");
                break;
                case "wednesday":
                System.out.println("Wednesday's average temperature was " + temperatures.get(3) + " degrees.");
                break;
                case "thursday":
                System.out.println("Thursday's average temperature was " + temperatures.get(4) + " degrees.");
                break;
                case "friday":
                System.out.println("Friday's average temperature was " + temperatures.get(5) + " degrees.");
                break;
                case "saturday":
                System.out.println("Saturday's average temperature was " + temperatures.get(6) + " degrees.");
                break;
                case "week":
                System.out.println("Sundays's average temperature was " + temperatures.get(0) + " degrees.");
                System.out.println("Monday's average temperature was " + temperatures.get(1) + " degrees.");
                System.out.println("Tuesday's average temperature was " + temperatures.get(2) + " degrees.");
                System.out.println("Thursday's average temperature was " + temperatures.get(4) + " degrees.");
                System.out.println("Friday's average temperature was " + temperatures.get(5) + " degrees.");
                System.out.println("Saturday's average temperature was " + temperatures.get(6) + " degrees.");
                System.out.println("The week's average temperature was " + weekAverageTemp() + " degrees.");
                break;
                case "q":
                System.out.println("Goodbye.");
                stringInput = "q";
                break;
            }

        }
    } 

    // main method calls the necessary methods to get the requested temperatures printed.
    public static void main(String[] args) {
        populateLists();
        printTemp();
    }
}
