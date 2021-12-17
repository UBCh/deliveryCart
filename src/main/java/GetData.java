import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.*;
public class GetData {

    public GetData() {
    }

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void GoData(String[] args) {
        Date currentDate = new Date();
        // преобразовsdftv дату в календарь
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        // добавляем 3 дня
        c.add(Calendar.DATE, 3);
        // конвертируем календарь в дату
        Date currentDatePlusOne = c.getTime();
    }
}
