package com.jmallavalli.springboot.restapi.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class VersionEmployeeController {

    @GetMapping(path = "/v1/emp")
    public Employee getV1Employee() {
        return new Employee("Donald Duck");
    }

    @GetMapping(path = "/v2/emp")
    public EmployeeV2 getV2Employee() {
        return new EmployeeV2("Donald", "Duck");
    }

    @GetMapping(path = "/emp", params = "version=1")
    public Employee getV1EmployeeReqParam() {
        return new Employee("Donald Duck");
    }

    @GetMapping(path = "/emp", params = "version=2")
    public EmployeeV2 getV2EmployeeReqParam() {
        return new EmployeeV2("Donald", "Duck");
    }

    @GetMapping(path = "/emp/header", headers = "X-API-VERSION=1")
    public Employee getV1EmployeeHeader() {
        return new Employee("Donald Duck");
    }

    @GetMapping(path = "/emp/header", headers = "X-API-VERSION=2")
    public EmployeeV2 getV2EmployeeHeader() {
        return new EmployeeV2("Donald", "Duck");
    }
}
