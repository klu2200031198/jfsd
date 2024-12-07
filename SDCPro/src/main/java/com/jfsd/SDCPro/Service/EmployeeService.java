package com.jfsd.SDCPro.Service;

import com.jfsd.SDCPro.Dto.EmployeeDTO;
import com.jfsd.SDCPro.Entity.LoginDTO;
import com.jfsd.SDCPro.Response.LoginMesage;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);

}