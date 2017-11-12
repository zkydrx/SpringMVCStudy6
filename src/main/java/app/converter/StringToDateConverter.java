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
 * Converter 是一般工具，可以将一种类型转换成另外一种类型。例如将String转成Date,或者将Long转成Date.
 * Converter 既可以用在Web层，也可以用在其他层。
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

            System.out.println("Exception");
            throw new IllegalArgumentException("invalid date format. Please use this pattern\""+datePattern+"\"");
        }
    }
}
