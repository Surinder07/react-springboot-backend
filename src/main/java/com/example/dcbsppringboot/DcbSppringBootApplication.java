package com.example.dcbsppringboot;

import com.example.dcbsppringboot.model.Employee;
import com.example.dcbsppringboot.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DcbSppringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DcbSppringBootApplication.class, args);
    }

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void run(String... args) throws Exception {

     /*   Employee employee = new Employee();
        employee.setFirstName("Surinder");
        employee.setLastName("Singh");
        employee.setEmailId("surinder@gmail.com");
        employeeRepo.save(employee);



        Employee employee2 = new Employee();
        employee2.setFirstName("Peter");
        employee2.setLastName("Parker");
        employee2.setEmailId("peter@gmail.com");
        employeeRepo.save(employee2);*/
    }
}
