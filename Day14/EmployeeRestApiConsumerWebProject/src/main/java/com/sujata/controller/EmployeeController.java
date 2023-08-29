package com.sujata.controller;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
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
        return new ModelAndView("InputEmpIDForSearch");
    }

    @RequestMapping("/searchEmployee")
    public ModelAndView searchEmployeeController(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();

        int employeeId=Integer.parseInt(request.getParameter("empId"));
        Employee employee=employeeService.getEmployeeByID(employeeId);
        if(employee!=null){
            modelAndView.addObject("employee",employee);
            modelAndView.setViewName("DisplayEmployee");
        }
        else{
            modelAndView.addObject("message","Employee with ID "+employeeId+"does not exist");
            modelAndView.setViewName("Output");
        }
        return modelAndView;
    }
}
