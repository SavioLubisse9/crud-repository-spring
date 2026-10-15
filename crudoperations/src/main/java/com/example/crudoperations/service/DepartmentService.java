package com.example.crudoperations.service;

import com.example.crudoperations.model.Department;

import java.util.List;

public interface DepartmentService{
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();


     Department updateDepartment(Department department,Long departmentId);

    void deleteDepartmentById(Long departmentId);

}