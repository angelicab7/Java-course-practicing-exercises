package com.angelica.exercise;

import java.util.List;

public class Delivery extends Employee {
    public Delivery(String name, int id, String role, int salary, List<String> assignations, String area, String project) {
        super(name, id, role, salary, assignations, area, project);
    }

    @Override
    public void approvePromotion(int employeeID) {
        System.out.println("Sent promotion to Staffing");
    }
}
