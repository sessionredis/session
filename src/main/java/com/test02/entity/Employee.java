package com.test02.entity;

import java.math.BigDecimal;

public class Employee {
    private Integer id;

    private String classes;

    private String office;

    private BigDecimal salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office == null ? null : office.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}