package app.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-02
 * Time: 09:33
 * Description:
 */
public class Employee implements Serializable
{

    private static final long serialVersionUID = 6705576631949104008L;
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int salaryLevel;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public int getSalaryLevel()
    {
        return salaryLevel;
    }

    public void setSalaryLevel(int salaryLevel)
    {
        this.salaryLevel = salaryLevel;
    }
}
