package com.geekster.JoinMapping.controller.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Student;
import com.geekster.JoinMapping.model.oneToOne.Subject;
import com.geekster.JoinMapping.service.oneToOne.SubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController {
    @Autowired
    SubService subService;

    @PostMapping("create/student")
    public void  createStudent(@RequestBody Subject subject) {
        subService.createStudent(subject);
    }
}
