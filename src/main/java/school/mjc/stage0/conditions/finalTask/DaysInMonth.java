package school.mjc.stage0.conditions.finalTask;

import java.time.DateTimeException;
import java.time.YearMonth;

public class DaysInMonth {
    public void printDays(int year, int month) {
        try {
            YearMonth date = YearMonth.of(year, month);
            System.out.println(date.lengthOfMonth());
        } catch (DateTimeException de) {
            System.out.println("invalid date");
        }
    }
}
