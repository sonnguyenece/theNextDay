import java.util.Calendar;
import java.util.GregorianCalendar;

public class theNextDay {
    public static int[] findDate(int dayInput,int monthInput, int yearInput) {
        int []date =new int [3];
        monthInput--;
        dayInput++;

        Calendar calendar = new GregorianCalendar(yearInput,monthInput,dayInput);
        date[0]=calendar.get(Calendar.DATE);
        date[1]=calendar.get(Calendar.MONTH)+1;
        date[2]=calendar.get(Calendar.YEAR);
        
       return date;
    }
}

