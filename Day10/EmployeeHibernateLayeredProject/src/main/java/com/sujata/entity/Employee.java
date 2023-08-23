package com.sujata.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Employee {
    @Id
    @Column(name = "eId", nullable = false)
    private int empId;
    @Basic
    @Column(name = "eName", nullable = true, length = 30)
    private String empName;
    @Basic
    @Column(name = "designation", nullable = true, length = 20)
    private String empDesignation;
    @Basic
    @Column(name = "department", nullable = true, length = 30)
    private String empDepartment;
    @Basic
    @Column(name = "salary", nullable = true, precision = 0)
    private Double empSalary;

}
