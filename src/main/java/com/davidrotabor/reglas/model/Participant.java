package com.davidrotabor.reglas.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Participant {

    private String name;
    private int age;
    private int creditScore;
    private long annualSalary;
    private long existingDebt;
    private long loanAmount;
    private int children;
    private int socioEconomicStatus;
    private String contractType;
    private int contractDuration;

}
