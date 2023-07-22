package com.geekster.JoinMapping.service.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Student;
import com.geekster.JoinMapping.model.oneToOne.Teacher;
import com.geekster.JoinMapping.repository.oneToOne.IStdRepo;
import com.geekster.JoinMapping.repository.oneToOne.ITeacherRpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StdService {

    @Autowired
    IStdRepo iStdRepo;

    @Autowired
    ITeacherRpo iTeacherRpo;
    public String createStudents(List<Student> students) {
        for(Student student:students){
            Teacher teacher = student.getTeacher();
            Long teacherId = teacher.getTeacherId();
            if(teacherId== null){
                iTeacherRpo.save(teacher);
                iStdRepo.save(student);
            }
            else{
                Teacher saveteacher = iTeacherRpo.findFirstByTeacherId(teacherId);
                student.setTeacher(saveteacher);
                iTeacherRpo.save(saveteacher);
                iStdRepo.save(student);
            }
        }

         return "create Student claas";
    }

    public Iterable<Student> findStudents() {
        return iStdRepo.findAll();
    }

    public String updateStudent(Long id, Student student) {
        Student student1 = iStdRepo.findFirstByStudentId(id);

        if(student1 == null){
            return "Student not found";
        }
        else {
            iStdRepo.save(student);
        }
        return "information of student updated";
    }


    public Optional<Student> getId(Long id) {
        return iStdRepo.findById(id);
    }

    public String deleteStudent(Long id) {
        iStdRepo.deleteById(id);
        return "Student delete successful";
    }
}
