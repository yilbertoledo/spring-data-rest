package com.yet88.springboot.springdatarest.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yet88.springboot.springdatarest.model.Student;

@RepositoryRestResource(path = "student", collectionResourceRel = "student")
public interface StudentDataRestRepository extends PagingAndSortingRepository<Student, Long>
{
    List<Student> findByName(@Param("name") String name);

    List<Student> findByDni(@Param("dni") String dni);
}
