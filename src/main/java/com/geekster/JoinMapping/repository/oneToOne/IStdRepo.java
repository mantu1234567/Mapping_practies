package com.geekster.JoinMapping.repository.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStdRepo extends CrudRepository<Student,Long> {

    Student findFirstByStudentId(Long id);
}
