package com.geekster.JoinMapping.repository.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubRepo extends CrudRepository<Subject,Long> {
}
