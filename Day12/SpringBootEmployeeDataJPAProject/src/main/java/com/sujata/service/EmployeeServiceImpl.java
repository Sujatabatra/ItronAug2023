package com.sujata.service;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePayslip;
import com.sujata.persistence.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeDao employeeDao;

    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int empId) {
        return employeeDao.findById(empId);
    }

    @Override
    public boolean addNewEmployee(Employee employee) {
        try {
            return employeeDao.insertRecord(employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(), employee.getEmpDepartment(), employee.getEmpSalary()) > 0;
        }
        catch (Exception ex){
            return false;
        }

        }

    @Override
    public boolean deleteEmployeeById(int empId) {
        try {
            employeeDao.deleteById(empId);
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }

    /*
    HR=10% of basic salary
    DA=12% of basic salary
    PF : 15% of basic salary
    Total Salary = Basic+HR+DA-PF
     */
    @Override
    public Optional<EmployeePayslip> getEmployeePayslip(int empId) {
        Optional<Employee> optionalEmployee=employeeDao.findById(empId);
        EmployeePayslip employeePayslip=null;
        if(optionalEmployee.isPresent()){
            Employee employee=optionalEmployee.get();
            double hr=.10*employee.getEmpSalary();
            double da=.12*employee.getEmpSalary();
            double pf=.15*employee.getEmpSalary();
            double totalSalary=employee.getEmpSalary()+hr+da-pf;
            employeePayslip=new EmployeePayslip(employee,hr,da,pf,totalSalary);

        }
        return Optional.ofNullable(employeePayslip);
    }

    @Override
    public List<Employee> getEmployeeByDepartment(String department) {
        return  employeeDao.findEmployeeByEmpDepartment(department);
//        return employeeDao.findByDepartment(department);
    }
}
