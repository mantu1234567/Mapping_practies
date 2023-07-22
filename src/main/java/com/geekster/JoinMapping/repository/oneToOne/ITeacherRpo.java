package com.geekster.JoinMapping.repository.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRpo extends CrudRepository<Teacher,Long> {

    Teacher findFirstByTeacherId(Long Id);
}
