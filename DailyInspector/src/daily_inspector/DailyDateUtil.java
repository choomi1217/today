package daily_inspector;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DailyDateUtil {

    public static String dateNow(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
        return dateFormat.format(new Date());
    }

}
