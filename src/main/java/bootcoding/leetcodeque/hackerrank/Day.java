package bootcoding.leetcodeque.hackerrank;

import java.util.Calendar;

public class Day {
    public static String findDay(int month, int day, int year) {
        String[] dayOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayIndex = cal.get(Calendar.DAY_OF_WEEK) - 1;
        return dayOfWeek[dayIndex];
    }

}
