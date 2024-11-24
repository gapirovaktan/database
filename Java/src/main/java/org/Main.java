package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        Employee emp1 = new Employee("Izat Manapov", "Mapper", 7300, new Date());
        employeeData.createEmployee(emp1);
        System.out.println("Employee have just created.");

        Employee emp = employeeData.getEmployeeById(207109);
        System.out.println("Retrieved: " + emp);

        System.out.println("All employees:");
        for (Employee e : employeeData.getAllEmployees()) {
            System.out.println(e);
        }

        emp.setPosition("Tapper");
        emp.setSalary(79000);
        employeeData.updateEmployee(emp);
        System.out.println("Employee updated: " + employeeData.getEmployeeById(1));

        employeeData.deleteEmployee(1);
        System.out.println("Employee deleted.");
    }
}
            System.out.println(e.toString());
        }
    }
}
