package app.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-05
 * Time: 21:43
 * Description:
 */
public class DateFormatter implements Formatter<Date>
{

    private String datePattern;
    private SimpleDateFormat dateFormate;


    public DateFormatter(String datePattern)
    {
        this.datePattern = datePattern;
        dateFormate = new SimpleDateFormat(datePattern);
        dateFormate.setLenient(false);
    }

    @Override
    public Date parse(String s, Locale locale) throws ParseException
    {
        try
        {
            return dateFormate.parse(s);
        }
        catch (Exception e)
        {
            // the error message will be displayed when using
            // <form:errors>
            throw new IllegalArgumentException("invalid date mformat. Please use this pattern\""+datePattern+"\"");
        }

    }

    @Override
    public String print(Date date, Locale locale)
    {

        return dateFormate.format(date);
    }
}
