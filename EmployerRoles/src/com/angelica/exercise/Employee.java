package com.angelica.exercise;

import java.util.List;

public abstract class Employee {
   private String name;
   private int id;
   private String role;
   private int salary;
   private List<String> assignations;
   private String area;
   private String project;

    public Employee(String name,int id,String role,int salary,List<String> assignations,String area,String project) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.salary = salary;
        this.assignations = assignations;
        this.area = area;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    public List<String> getAssignations() {
        return assignations;
    }

    public String getArea() {
        return area;
    }

    public String getProject() {
        return project;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAssignations(List<String> assignations) {
        this.assignations = assignations;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public abstract void approvePromotion(int employeeID);
}
