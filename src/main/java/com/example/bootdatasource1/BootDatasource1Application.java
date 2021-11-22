package com.example.bootdatasource1;

import com.example.bootdatasource1.service.EmployeeReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDatasource1Application implements CommandLineRunner {

    @Autowired
    private EmployeeReportService employeeReportService;

    public static void main(String[] args) {
        SpringApplication.run(BootDatasource1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeReportService.printReport();
    }
}
