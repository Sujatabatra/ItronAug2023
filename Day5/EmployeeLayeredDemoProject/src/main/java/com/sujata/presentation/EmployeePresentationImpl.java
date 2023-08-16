package com.sujata.presentation;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeePresentationImpl implements EmployeePresentation{

    private EmployeeService employeeService=new EmployeeServiceImpl();
    @Override
    public void showMenu() {
        System.out.println("1. Show All Employees");
        System.out.println("2. Search Employee By ID");
        System.out.println("3. Exit");

    }

    @Override
    public void performMenu(int choice) {
        Scanner scanner=new Scanner(System.in);
    switch (choice){
        case 1:
            List<Employee> empList=employeeService.getAllEmployees();
            for(Employee employee:empList){
                System.out.println(employee);
            }
            break;
        case 2:
            System.out.println("Enter Employee ID : ");
            int employeeId=scanner.nextInt();
            Optional<Employee> optionalEmployee=employeeService.getEmployeeById(employeeId);
            if(optionalEmployee.isPresent())
                System.out.println(optionalEmployee.get());
            else
                System.out.println("Employee with id "+employeeId+" does not exist!");
            break;
        case 3:
            System.out.println("Thanks for using Employee Management System");
            System.exit(0);
        default:
            System.out.println("Invalid Choice");
    }
    }
}
