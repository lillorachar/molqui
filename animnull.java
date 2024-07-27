/**
 * Fills the provided calendar array with dates, starting from the first day of the month and continuing
 * until the last date. This helps in populating a calendar structure where each element represents a day.
 *
 * @param calendar A two-dimensional array representing the calendar grid.
 * @param firstDay An integer representing the first day of the month (e.g., 1 for Monday, 7 for Sunday).
 * @param lastDate An integer representing the last date of the month.
 */
public static void fillCalendarArray(int[][] calendar, int firstDay, int lastDate) {
    int day = 1;
    boolean started = false;

    for (int i = 0; i < calendar.length; i++) {
        for (int j = 0; j < calendar[i].length; j++) {
            if (i == 0 && j + 1 == firstDay) {
                started = true;
            }

            if (started && day <= lastDate) {
                calendar[i][j] = day;
                day++;
            } else {
                calendar[i][j] = 0; // Assuming 0 indicates no date.
            }
        }
    }
}
