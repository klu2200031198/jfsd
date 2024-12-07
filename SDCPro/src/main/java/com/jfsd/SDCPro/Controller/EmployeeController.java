package com.jfsd.SDCPro.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jfsd.SDCPro.Dto.EmployeeDTO;
import com.jfsd.SDCPro.Entity.LoginDTO;
import com.jfsd.SDCPro.Service.EmployeeService;
import com.jfsd.SDCPro.Response.LoginMesage;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginMesage loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}