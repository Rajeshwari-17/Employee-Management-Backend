package Utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.backend.EmployeeManagement.employee.Employee;
import com.example.backend.EmployeeManagement.employee.EmployeeService;


@Configuration
public class LoadDatabase {
	 @Bean
     CommandLineRunner initDatabase(EmployeeService employeeService) {
         // Load test users
         return args -> {
             employeeService.addEmployee(new Employee("Ares", "Ares", "Elite", "Ares", "admin", 1, true));

         };
     }

}
