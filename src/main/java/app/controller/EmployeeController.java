package app.controller;

import app.domain.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-02
 * Time: 09:47
 * Description:
 */
@Controller
public class EmployeeController
{
    private static final Log logger= LogFactory.getLog(EmployeeController.class);

    @RequestMapping(value = "employee_input")
    public String inputEmployee(Model model)
    {
        model.addAttribute(new Employee());
        return "EmployeeForm";
    }


    @RequestMapping(value="employee_save")
    public String saveEmployee(@ModelAttribute Employee employee, BindingResult bindingResult,Model model)
    {
        if (bindingResult.hasErrors())
        {
            FieldError fieldError = bindingResult.getFieldError();
            logger.info("Code:"+fieldError.getCode()+",field:"+fieldError.getField());

            return "EmployeeForm";
        }
        // save employee here

        model.addAttribute("employee",employee);
        return "EmployeeDetails";
    }
}
