package com.geekster.JoinMapping.model.oneToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.awt.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk-_address_id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id")
    private List<Subject> subject;

    @ManyToOne
    @JoinColumn(name = "fk_Teacher_id")
    private Teacher teacher;
}