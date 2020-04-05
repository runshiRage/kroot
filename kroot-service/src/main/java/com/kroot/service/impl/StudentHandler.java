package com.kroot.service.impl;

import com.kroot.model.Student;
import com.kroot.service.task.StudentCenter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentHandler implements IStudentHandler {

    @Override
    public List<Student> list() {
        return new ArrayList(StudentCenter.numberMapStudent.values());
    }

    @Override
    public Student getByNumber(String number) {
        return StudentCenter.numberMapStudent.get(number);
    }

}
