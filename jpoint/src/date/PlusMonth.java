package date;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * Created by Mikalai_Churakou on 4/12/2017.
 */
public class PlusMonth {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.MONTH, 0);
        instance.set(Calendar.DATE, 31);
        System.out.println(instance);

        instance.add(Calendar.MONTH,1);

        System.out.println(instance);

        LocalDate date = LocalDate.of(2017, 1 , 31);

        System.out.println(date);

        System.out.println(date.plusMonths(1));
    }
}
