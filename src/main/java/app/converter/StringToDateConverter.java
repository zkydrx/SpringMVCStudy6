package app.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-02
 * Time: 02:25
 * Description:
 */
public class StringToDateConverter implements Converter<String, Date>
{
    private String datePattern;

    public StringToDateConverter(String datePattern)
    {
        this.datePattern = datePattern;
        System.out.println("instantiating ...converter with pattern:*" + datePattern);
    }


    @Override
    public Date convert(String s)
    {
        try
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
            dateFormat.setLenient(false);
            return dateFormat.parse(s);
        }
        catch (ParseException e)
        {
            // the errors message will be displayed when using.
            // <form:errors>

            throw new IllegalArgumentException("invalid date format. Please use this pattern\""+datePattern+"\"");
        }
    }
}
