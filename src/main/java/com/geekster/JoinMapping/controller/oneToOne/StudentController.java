package com.geekster.JoinMapping.controller.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Student;
import com.geekster.JoinMapping.service.oneToOne.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StdService stdService;

    @PostMapping("create/std")
    public String createStudents(@RequestBody List<Student> students){

        return stdService.createStudents(students);
    }

    @GetMapping("find/all/students")
    public Iterable<Student> findStudents(){
        return stdService.findStudents();
    }

    @PutMapping("update/student/Info/{Id}")

    public String updateStudent(@PathVariable Long Id,@RequestBody Student student){
        return stdService.updateStudent(Id,student);
    }

    @GetMapping("find/by/Id/{Id}")
    public Optional<Student> findId(@PathVariable Long Id){
        return stdService.getId(Id);
    }

    @DeleteMapping("delete/Student/{Id}")
        public String deleteStudent(@PathVariable Long Id){
        return stdService.deleteStudent(Id);
    }
}
