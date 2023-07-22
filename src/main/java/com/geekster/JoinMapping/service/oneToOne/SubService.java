package com.geekster.JoinMapping.service.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Student;
import com.geekster.JoinMapping.model.oneToOne.Subject;
import com.geekster.JoinMapping.repository.oneToOne.ISubRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubService {

    @Autowired
    ISubRepo iSubRepo;

    public void createStudent(Subject student) {
        iSubRepo.save(student);
    }
}
