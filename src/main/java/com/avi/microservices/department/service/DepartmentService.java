package com.avi.microservices.department.service;

import com.avi.microservices.department.entity.Department;
import com.avi.microservices.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("inside service for save department");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside service for findDepartmentById");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
