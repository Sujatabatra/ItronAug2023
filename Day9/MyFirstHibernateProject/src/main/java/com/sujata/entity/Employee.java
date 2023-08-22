package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {

    @Id
    @Column(name = "eId", nullable = false)
    private int eId;
    @Basic
    @Column(name = "eName", nullable = true, length = 30)
    private String eName;
    @Basic
    @Column(name = "designation", nullable = true, length = 20)
    private String designation;
    @Basic
    @Column(name = "department", nullable = true, length = 30)
    private String department;
    @Basic
    @Column(name = "salary", nullable = true, precision = 0)
    private Double salary;

}
