import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class theNextDayTest1 {

    int day = 31;
    int month = 1;
    int year = 2018;
    int dayExpected = 1;
    int monthExpected = 2;
    int yearExpected = 2018;

    @Test
    void testDay() {

        int[] arrTemp = theNextDay.findDate(day, month, year);
        int resultDay = arrTemp[0];
        assertEquals(dayExpected, resultDay);

    }

    @Test
    void testMonth() {
        int[] arrTemp = theNextDay.findDate(day, month, year);
        int resultMonth = arrTemp[1];
        assertEquals(monthExpected, resultMonth);
    }

    @Test
    void testYear() {
        int[] arrTemp = theNextDay.findDate(day, month, year);
        int resultYear = arrTemp[2];
        assertEquals(yearExpected, resultYear);
    }
}
