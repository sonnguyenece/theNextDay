import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class theNextDayTest4 {

    int day = 29;
    int month = 2;
    int year = 2020;
    int dayExpected = 1;
    int monthExpected = 3;
    int yearExpected = 2020;

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


