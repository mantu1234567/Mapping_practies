package com.geekster.JoinMapping.service.oneToOne;

import com.geekster.JoinMapping.repository.oneToOne.ITeacherRpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    ITeacherRpo iTeacherRpo;
}
