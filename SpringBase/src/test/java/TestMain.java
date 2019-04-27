import org.joda.time.DateTime;

import java.util.Date;
import java.util.Locale;

public class TestMain {

    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(System.getProperties());

        DateTime dt = new DateTime(new Date());
        System.out.println(dt);
        System.out.println(dt.toString("YYYY MM DD HH mm ss"));
        System.out.println(dt.getDayOfWeek());
//        dt = dt.withYear(2016);
        System.out.println(dt.dayOfWeek().getAsText(Locale.ENGLISH));

    }
}
