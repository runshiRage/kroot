package com.kroot.web.controller;

import com.kroot.model.Student;
import com.kroot.service.impl.IStudentHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorld {

    @Autowired
    private IStudentHandler studentHandler;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Map helloWorld() {
        Map<String, Object> ret = new HashMap<>();
        ret.put("ret", "Hello World");
        return ret;
    }
    @RequestMapping(value = "/student/list", method = RequestMethod.GET)
    public List<Student> studentList(){
        return studentHandler.list();
    }
}
