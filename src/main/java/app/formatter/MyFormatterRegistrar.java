package app.formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-05
 * Time: 22:00
 * Description:
 */
public class MyFormatterRegistrar implements FormatterRegistrar
{

    private String datePattern;
    public MyFormatterRegistrar(String datePattern)
    {
        this.datePattern = datePattern;
    }
    @Override
    public void registerFormatters(FormatterRegistry formatterRegistry)
    {
        formatterRegistry.addFormatter(new DateFormatter(datePattern));

        //register more formatters here.
    }
}
