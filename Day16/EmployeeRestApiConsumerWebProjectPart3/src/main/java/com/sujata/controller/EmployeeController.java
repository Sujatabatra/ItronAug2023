package com.sujata.controller;

import com.sujata.entity.Employee;
import com.sujata.entity.User;
import com.sujata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ModelAttribute("departments")
    public List<String> getAllDepartment(){
        return employeeService.getAllEmployees().stream()
                .map(Employee::getEmpDepartment)
                .distinct()
                .collect(Collectors.toList());
    }

    @ModelAttribute("empIds")
    public List<Integer> getAllEmpIds(){
        return employeeService.getAllEmployees().stream()
                .map(Employee::getEmpId)
                .collect(Collectors.toList());
    }
    @RequestMapping("/menu")
    public ModelAndView showMenuPageController() {
        return new ModelAndView("menu");
    }

    @RequestMapping("/showAllEmployees")
    public ModelAndView showAllEmployeesController(){
        ModelAndView modelAndView=new ModelAndView();
        List<Employee> employees=employeeService.getAllEmployees();
        modelAndView.addObject("employeeList",employees);
        modelAndView.setViewName("DisplayAllEmployees");
        return modelAndView;
    }

    @RequestMapping("/inputEmployeeId")
    public ModelAndView inputEmployeeIdForSearchController(){
        return new ModelAndView("InputEmpIDForSearch","command",new Employee());
    }

    @RequestMapping("/searchEmployee")
    public ModelAndView searchEmployeeController(@ModelAttribute("command") Employee emp){
        ModelAndView modelAndView=new ModelAndView();

        Employee employee=employeeService.getEmployeeByID(emp.getEmpId());
        if(employee!=null){
            modelAndView.addObject("employee",employee);
            modelAndView.setViewName("DisplayEmployee");
        }
        else{
            modelAndView.addObject("message","Employee with ID "+emp.getEmpId()+" does not exist");
            modelAndView.setViewName("Output");
        }
        return modelAndView;
    }

//    @RequestMapping("/searchEmployee")
//    public ModelAndView searchEmployeeController(HttpServletRequest request){
//        ModelAndView modelAndView=new ModelAndView();
//
//        int employeeId=Integer.parseInt(request.getParameter("empId"));
//        Employee employee=employeeService.getEmployeeByID(employeeId);
//        if(employee!=null){
//            modelAndView.addObject("employee",employee);
//            modelAndView.setViewName("DisplayEmployee");
//        }
//        else{
//            modelAndView.addObject("message","Employee with ID "+employeeId+" does not exist");
//            modelAndView.setViewName("Output");
//        }
//        return modelAndView;
//    }

    @RequestMapping("/inputEmployeeDetails")
    public ModelAndView inputEmployeeDetailsPageController(){

        return new ModelAndView("InputEmployeeDetails","empl",new Employee());
    }

    @RequestMapping("/saveEmployee")
    public ModelAndView saveEmployeeController(@ModelAttribute("empl") Employee employee){
//        Employee employee=new Employee();
//        employee.setEmpId(Integer.parseInt(request.getParameter("eId")));
//        employee.setEmpName(request.getParameter("eName"));
//        employee.setEmpDepartment(request.getParameter("eDepartment"));
//        employee.setEmpDesignation(request.getParameter("eDesignation"));
//        employee.setEmpSalary(Double.parseDouble(request.getParameter("eSalary")));
        String message=null;
        if(employeeService.addEmployee(employee))
            message="Employee Added";
        else
            message="Employee cannot be Added";

        return new ModelAndView("Output","message",message);

    }

    @RequestMapping("/inputEmployeeIdForDelete")
    public ModelAndView inputEmpIdForDeletePageController(){
        return new ModelAndView("InputEmpIDForDelete");
    }

    @RequestMapping("/deleteEmployee")
    public ModelAndView deleteEmployeeController(@RequestParam("empId") int employeeId){

//        int employeeId=Integer.parseInt(request.getParameter("empId"));
        String message=null;
        if(employeeService.deleteEmployee(employeeId))
            message="Employee Deleted";
        else
            message="Employee cannot be Removed";

        return new ModelAndView("Output","message",message);
    }

    @RequestMapping("/inputEmployeeDetailForUpdate")
    public ModelAndView inputEmployeeDetailsForUpdatePageController(){
        return new ModelAndView("InputEmpDetailsForUpdateSalary");
    }

    @RequestMapping("/updateEmployee")
    public ModelAndView updateEmployeeController(@RequestParam("empId") int employeeId,@RequestParam("increment Amt") double incrementAmount){
//        int employeeId=Integer.parseInt(request.getParameter("empId"));
//        double incrementAmount=Double.parseDouble(request.getParameter("incrementAmt"));
        String message=null;
        if(employeeService.updateEmployee(employeeId,incrementAmount))
            message="Employee Salary Updated";
        else
            message="Employee Salary cannot be Updated";

        return new ModelAndView("Output","message",message);
    }
}
