package Entities;

import java.util.ArrayList;
import java.util.List;

import Enumeracoes.WorkLevel;

public class Worker {
    private String name;
    private WorkLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker() {
    }

    public Worker(String name, WorkLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    

    












    }




