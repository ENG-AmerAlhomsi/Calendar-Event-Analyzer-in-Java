public class Main {
    public static void main(String[] args) {

        String[][] calendar = {
                {"volunteer", "delivery", null, null, "doctor", null, "soccer"},
                {null, "exam 1", null, "mechanic", null, null, "soccer"},
                {"volunteer", "off work", null, "birthday", null, "concert", null},
                {null, "exam 2", null, null, "doctor", null, "soccer"},
                {"visit family", null, null, null, null, null, null}
        };

//Detect which days of which weeks have something planned and alert us about the event.
//Count the number of events for each week
        for(int i = 0; i < calendar.length; i++) {
          int  numberOfEventsPerWeek = 0;
            for(int j = 0; j < calendar[i].length; j++) {
                // We need conditional logic to ensure that we do not count the empty days
                String event = calendar[i][j];
                if(event!=null && !event.isEmpty()) {
                    // If the day does not have a null value and an empty string for an event, then we print it and count it
                    System.out.println("Week: " + (i+1) + ", Day: " + (j+1) + ", Event: " + event);
                    numberOfEventsPerWeek++;
                }
            }
            System.out.println("Total number of events for week "+ (i+1) +": " + numberOfEventsPerWeek + "\n");
        }

//count all the events for each of the weekdays
        int numberOfEventsPerWeekday = 0;
        String[] days = {"Sundays", "Mondays", "Tuesdays", "Wednesdays", "Thursdays", "Fridays", "Saturdays"};
        for(int i = 0; i < calendar[0].length; i++) {
            numberOfEventsPerWeekday = 0;
            for (String[] strings : calendar) {
                String event = strings[i];
                if (event != null && !event.isEmpty()) {
                    numberOfEventsPerWeekday++;
                }
            }
            System.out.println("Number of events on " + days[i] + ": " + numberOfEventsPerWeekday);
        }

    }
}
