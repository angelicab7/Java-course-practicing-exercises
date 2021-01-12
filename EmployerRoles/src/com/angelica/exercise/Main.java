package com.angelica.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        List<String> assignations = new ArrayList<>();
        assignations.add("Studying");
        employeeList.add(new SoftwareEngineer("Angelica Bonilla", 235, "Web UI Junior Advanced", 5, assignations, "Studio UI", "Academy"));

        assignations = new ArrayList<>();
        assignations.add("Leadership");
        assignations.add("Talk with the client");
        assignations.add("Set deadlines");
        employeeList.add(new Delivery("Pepito Perez", 120, "Project Manager Senior", 8, assignations, "Delivery", "Expedia"));

        employeeList.get(1).approvePromotion(235);
    }
}
