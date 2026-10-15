package com.example.crudoperations.repository;

import com.example.crudoperations.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {

    //Fica vazio,mas podem ser adicionados metodos???
}