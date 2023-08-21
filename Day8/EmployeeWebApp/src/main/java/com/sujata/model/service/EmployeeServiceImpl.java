package com.sujata.model.service;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePayslip;
import com.sujata.model.persistence.EmployeeDao;
import com.sujata.model.persistence.EmployeeDaoImpl;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao=new EmployeeDaoImpl();

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllRecord();
    }

    @Override
    public Optional<Employee> getEmployeeById(int empId) {
        return employeeDao.getRecordById(empId);
    }

    @Override
    public boolean addNewEmployee(Employee employee) {
        return employeeDao.addRecord(employee)>0;
    }

    @Override
    public boolean deleteEmployeeById(int empId) {
        return employeeDao.deleteRecordById(empId)>0;
    }

    /*
    HR=10% of basic salary
    DA=12% of basic salary
    PF : 15% of basic salary
    Total Salary = Basic+HR+DA-PF
     */
    @Override
    public Optional<EmployeePayslip> getEmployeePayslip(int empId) {
        Optional<Employee> optionalEmployee=employeeDao.getRecordById(empId);
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
}
