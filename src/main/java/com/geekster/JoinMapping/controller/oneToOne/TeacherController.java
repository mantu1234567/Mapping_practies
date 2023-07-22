package com.geekster.JoinMapping.controller.oneToOne;

import com.geekster.JoinMapping.service.oneToOne.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;
}
