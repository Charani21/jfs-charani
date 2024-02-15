package com.careerit.jfs.day14;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
  private   List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        if (isExists(emp.getEmpno())) {
            System.out.println("Employee with  empno : " + emp.getEmpno() + " already exists ");
        } else {
            employees.add(emp);
            System.out.println("Employee with empno : " + emp.getEmpno() + " added successfully");
        }
    }

    public void removeEmployee(int empno) {
        if(employees.isEmpty()){
            System.out.println("No employees found");
            return;
        }
        int index = indexOf(empno);
        if (index != -1) {
            employees.remove(index);
            System.out.println("Employee with empno : " + empno + "removed successfully");
        } else {
            System.out.println("Employee with empno : " + empno + "mot exists");
        }
    }

    public void incrementSalary(int empno, double updatePercentage) {
        if(employees.isEmpty()){
            System.out.println("No employees found");
            return;
        }
        int index = indexOf(empno);
        if (index != -1) {
            Employee emp = employees.get(index);
            double updateSalary = emp.getSalary() + (emp.getSalary() * updatePercentage / 100);
            emp.setSalary(updateSalary);
        } else {
            System.out.println("Emplopyee with empno : " + empno + "not exists");
        }
    }

    public void showEmployee(int empno) {
        if(employees.isEmpty()){
            System.out.println("No employees found");
            return;
        }
        int index = indexOf(empno);
        if (index != -1) {
            Employee emp = employees.get(index);
            emp.showInfo();
        } else {
            System.out.println("Employee with empno : " + empno + " not exists");
        }
    }

    public void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println(".........................");
        }
    }

    public void showMaxPaidEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        List<Employee> maxPaidEmployees = new ArrayList<>();
        double maxSalary = maxSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() == maxSalary) {
                maxPaidEmployees.add(emp);
            }
        }
        for (Employee emp : maxPaidEmployees) {
            emp.showInfo();
            System.out.println("------------------------------");
        }
    }

    public double showSalaryStats() {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
        }
        double totalSalary = totalSalary();
        double minSalary = minSalary();
        double maxSalary = maxSalary();
        double avgSalary = totalSalary / employees.size();
        System.out.println("Total Salary is : " + totalSalary);
        System.out.println("Minimum Salary is : " + minSalary);
        System.out.println("Maximum Salary is : " + maxSalary);
        System.out.println("Average Salary is : " + avgSalary);
        return 0;
}

    private double totalSalary() {
        double total = 0;
        for(Employee emp : employees){
            total += emp.getSalary();
        }
        return total;
    }

    private double minSalary() {
        double min = employees.getFirst().getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() > min) {
                min = emp.getSalary();
            }
        }
        return min;
    }
    private double maxSalary() {
        double max = employees.getFirst().getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
        }
    }
    return max;
}
    private int indexOf(int empno) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpno() == empno) {
                return i;
            }
        }
        return -1;
    }

    private boolean isExists(int empno) {
        for (Employee emp : employees) {
            if (emp.getEmpno() == empno) {
                return true;
            }
        }
        return false;
    }
}
