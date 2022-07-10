package hello.world.controller;

import hello.world.models.Employee;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;

import java.util.ArrayList;
import java.util.List;

@Controller()
public class EmployeeRecordsController {

    private static List<Employee> records;

    static {
        records = new ArrayList<>();
        records.add(Employee.builder().name("John").lengthOfEmployment(10).title("Systems Architect").build());
        records.add(Employee.builder().name("Peter").lengthOfEmployment(7).title("Lead Developer").build());
        records.add(Employee.builder().name("AJ").lengthOfEmployment(6).title("UX Developer").build());
        records.add(Employee.builder().name("Brook Reed").lengthOfEmployment(3).title("Manager").build());
    }

    @Get(value = "/allDetails", produces = MediaType.APPLICATION_JSON)
    public Employee[] getAllEmployeeRecords() {
        return records.toArray(new Employee[0]);
    }

    @Put(value = "/addRecord", produces = MediaType.APPLICATION_JSON)
    public Employee[] addToRecords(@Body Employee recordToAdd) {
        records.add(recordToAdd);
        return records.toArray(new Employee[0]);
    }
}
