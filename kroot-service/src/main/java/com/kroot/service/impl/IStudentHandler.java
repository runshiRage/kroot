package com.kroot.service.impl;

import com.kroot.model.Student;

import java.util.List;

public interface IStudentHandler {
    public List<Student> list();
    public Student getByNumber(String number);
}
