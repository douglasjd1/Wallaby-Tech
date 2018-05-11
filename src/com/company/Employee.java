package com.company;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Employee
{
    private String name;
    private BigDecimal amountAdded;

    List<InvestmentOptions> employeeInvestments = new LinkedList<>();


    public Employee(String name, BigDecimal amountAdded, List<InvestmentOptions> employeeInvestments)
    {
        this.name = name;
        this.amountAdded = amountAdded;

        this.employeeInvestments = employeeInvestments;
    }
    public String getName()
    {
        return name;
    }

    public BigDecimal getAmountAdded()
    {
        return amountAdded;
    }


    public List<InvestmentOptions> getEmployeeInvestments()
    {
        return employeeInvestments;
    }

    public void addAmountAdded(BigDecimal amountAdded)
    {
        this.amountAdded.add(amountAdded);
    }
}
